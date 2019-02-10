package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.ResponseData;
import com.nscorp.cost.calculator.model.SummaryData;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Service
public class CostService {
    @Autowired
    private CarService carService;
    @Autowired
    private GrossTonMilesService gtmService;
    @Autowired
    private CarMilesService cmService;

    public ResponseData computeCost(UnitTrainInputs inputs) {
        return ResponseData.builder()
                .summaryDataList(getSummaryDataList(inputs))
                .build();
    }

    private List<SummaryData> getSummaryDataList(UnitTrainInputs inputs) {
        List<SummaryData> summaryDataList = new ArrayList<>();
        if (Objects.isNull(inputs.getUnitTrains()))
            return Arrays.asList(getDummySummaryData());

        for (int i = 0; i < inputs.getUnitTrains().size(); i++) {
            summaryDataList.add(isValidDivision(inputs, i) ? getDummySummaryData() : createSummaryData(inputs, i));
        }
        return summaryDataList;
    }

    private SummaryData getDummySummaryData() {
        return SummaryData.builder().build();
    }

    private boolean isValidDivision(UnitTrainInputs inputs, int i) {
        return inputs.getUnitTrains().get(i).getDivision().equalsIgnoreCase("NONE");
    }

    private SummaryData createSummaryData(UnitTrainInputs inputs, int i) {
        return SummaryData.builder()
                .carHiredOrDailyCost(carService.getCarHireOrDailyRate(inputs, i))
                .fuelingLocomotivesCost(gtmService.getFuelingLocomotiveCost(inputs, i))
                .carDailyReplacementCost(carService.getCarDailyReplacementRate(inputs, i))
                .communicationAndSignalCost(cmService.getCommunicationAndSignalCost(inputs, i))
                .bridgeAndTrackMaintenanceCost(gtmService.getBridgeAndTrackMaintenanceCost(inputs, i))
                .build();
    }
}
