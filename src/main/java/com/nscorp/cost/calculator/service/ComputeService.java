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
public class ComputeService {
    @Autowired
    private CarService carService;

    public ResponseData computeCost(UnitTrainInputs inputs) {
        return ResponseData.builder()
                .summaryDataList(getSummaryDataList(inputs))
                .build();
    }

    private List<SummaryData> getSummaryDataList(UnitTrainInputs inputs) {
        List<SummaryData> summaryDataList = new ArrayList<>();
        if (Objects.isNull(inputs.getUnitTrains()))
            return Arrays.asList(SummaryData.builder().build());

        for (int i = 0; i < inputs.getUnitTrains().size(); i++) {
            summaryDataList.add(createSummaryData(inputs, i));
        }
        return summaryDataList;
    }

    private SummaryData createSummaryData(UnitTrainInputs inputs, int i) {
        return SummaryData.builder()
                .carHiredOrDailyRate(carService.getCarHireOrDailyRate(inputs, i))
                .build();
    }
}
