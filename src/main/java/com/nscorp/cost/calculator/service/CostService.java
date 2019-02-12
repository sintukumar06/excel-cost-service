package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.*;
import com.nscorp.cost.calculator.repo.RateIndexRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CostService {
    @Autowired
    private PusherService pusherService;
    @Autowired
    private RateIndexRepository riRepository;
    @Autowired
    private CoalDumpingService coalDumpingService;
    @Autowired
    private SummaryDataService summaryDataService;

    public ResponseData computeCost(RequestInputs inputs) {
        List<PushersInfo> pusherData = pusherService.getPusherData(inputs);
        CostSummary coalDumpingCost = coalDumpingService.getCoalDumping(inputs);
        List<SummaryData> summaryData = summaryDataService.getSummaryDataList(inputs);

        return ResponseData.builder()
                .coalDumping(coalDumpingCost)
                .pusherData(pusherData)
                .summaryData(summaryData)
                .vec(getVECSummary(inputs, summaryData, pusherData, coalDumpingCost))
                .vrc(getVRCSummary(inputs, summaryData, pusherData, coalDumpingCost))
                .build();
    }

    private CostSummary getVECSummary(RequestInputs inputs, List<SummaryData> summaryData, List<PushersInfo> pusherData, CostSummary coalDumpingCost) {
        double perTrainCost = getPerTrainVECCost(inputs, summaryData, pusherData, coalDumpingCost);
        return CostSummary.builder()
                .perTrainCost(perTrainCost)
                .perCarCost(perTrainCost / inputs.getNumberOfCars())
                .perTonCost(perTrainCost / (inputs.getNumberOfCars() * inputs.getLadingWeightPerCar()))
                .build();
    }

    private CostSummary getVRCSummary(RequestInputs inputs, List<SummaryData> summaryData, List<PushersInfo> pusherData, CostSummary coalDumpingCost) {
        double perTrainCost = getPerTrainVRCCost(inputs, summaryData, pusherData, coalDumpingCost);
        return CostSummary.builder()
                .perTrainCost(perTrainCost)
                .perCarCost(perTrainCost / inputs.getNumberOfCars())
                .perTonCost(perTrainCost / (inputs.getNumberOfCars() * inputs.getLadingWeightPerCar()))
                .build();
    }

    private double getPerTrainVECCost(RequestInputs inputs, List<SummaryData> summaryData, List<PushersInfo> pusherData, CostSummary coalDumpingCost) {
        return (1 + getRateIndex(inputs)) * (getSummaryDataVecTotal(summaryData) + getTotalPusherCost(pusherData) + coalDumpingCost.getPerTrainCost());
    }

    private double getPerTrainVRCCost(RequestInputs inputs, List<SummaryData> summaryData, List<PushersInfo> pusherData, CostSummary coalDumpingCost) {
        return (1 + getRateIndex(inputs)) * (getSummaryDataVrcTotal(summaryData) + getTotalPusherCost(pusherData) + coalDumpingCost.getPerTrainCost());
    }

    private double getTotalPusherCost(List<PushersInfo> pusherData) {
        return pusherData.parallelStream().mapToDouble(e -> e.getPusherCostPerTrain()).sum();
    }

    private double getSummaryDataVecTotal(List<SummaryData> summaryData) {
        return summaryData.parallelStream().mapToDouble(e -> e.getVecTotal()).sum();
    }

    private double getSummaryDataVrcTotal(List<SummaryData> summaryData) {
        return summaryData.parallelStream().mapToDouble(e -> e.getVrcTotal()).sum();
    }

    private double getRateIndex(RequestInputs inputs) {
        switch (inputs.getMktgMajorGroup().toUpperCase()) {
            case "AGRICULTURE":
                return riRepository.getOne(getYearForRateIndex()).getAgriculture();
            case "AUTOMOTIVE":
                return riRepository.getOne(getYearForRateIndex()).getAutomotive();
            case "CHEMICALS":
                return riRepository.getOne(getYearForRateIndex()).getChemical();
            case "COAL":
                return riRepository.getOne(getYearForRateIndex()).getCoal();
            case "INTERMODAL":
                return riRepository.getOne(getYearForRateIndex()).getIntermodal();
            case "METALS":
                return riRepository.getOne(getYearForRateIndex()).getMetals();
            case "PAPER":
                return riRepository.getOne(getYearForRateIndex()).getPaper();
            default:
                return 1;
        }
    }

    private int getYearForRateIndex() {
        return LocalDate.now().getYear() - 1;
    }
}
