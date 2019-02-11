package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.CostSummary;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.DumpingChargeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static org.apache.commons.lang3.StringUtils.isBlank;

@Service
public class CoalDumpingService {
    @Autowired
    private DumpingChargeRepository dcRepository;

    protected CostSummary getCoalDumping(UnitTrainInputs inputs) {
        return isBlank(inputs.getCoalDumpingCity()) ? null
                : getCoalDumpingInfo(inputs);
    }

    private CostSummary getCoalDumpingInfo(UnitTrainInputs inputs) {
        double perTonCharge = getDumpingCharge(inputs);
        return CostSummary.builder()
                .perTonCost(perTonCharge)
                .perCarCost(inputs.getLadingWeightPerCar() * perTonCharge)
                .perTrainCost(inputs.getLadingWeightPerCar() * inputs.getNumberOfCars() * perTonCharge)
                .build();
    }

    private double getDumpingCharge(UnitTrainInputs inputs) {
        return dcRepository.getOne(inputs.getCoalDumpingCity().trim().toUpperCase()).getDumpingCharge();
    }
}
