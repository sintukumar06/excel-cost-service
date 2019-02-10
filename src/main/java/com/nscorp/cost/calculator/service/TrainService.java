package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.TrainDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TrainService {
    @Autowired
    private TrainDataRepository tdRepository;

    public double getTrainStartCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.getNumberOfTrainStarts() <= 0 ? 0 : calculateTrainStartCost(inputs, unitTrain);
    }

    private double calculateTrainStartCost(UnitTrainInputs inputs, UnitTrain unitTrain) {
        return unitTrain.getNumberOfTrainStarts()
                * (1 + inputs.getEmptyReturnRatio()) * getTrainStartCost(inputs);
    }

    private double getTrainStartCost(UnitTrainInputs inputs) {
        return tdRepository.getOne(inputs.getTrainType().toUpperCase()).getTrainStartCost();
    }
}
