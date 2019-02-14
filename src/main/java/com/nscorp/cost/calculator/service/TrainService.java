package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.repo.TrainDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;

@Service
public class TrainService {
    private TrainDataRepository tdRepository;

    @Autowired
    public void setTdRepository(TrainDataRepository tdRepository) {
        this.tdRepository = tdRepository;
    }

    public double getTrainStartCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.getNumberOfTrainStarts() <= 0 ? 0 : calculateTrainStartCost(inputs, unitTrain);
    }

    private double calculateTrainStartCost(RequestInputs inputs, UnitTrain unitTrain) {
        return unitTrain.getNumberOfTrainStarts()
                * (1 + inputs.getEmptyReturnRatio()) * getTrainStartCost(inputs);
    }

    private double getTrainStartCost(RequestInputs inputs) {
        return isNull(inputs.getTrainType())
                ? 0 : tdRepository.getOne(inputs.getTrainType().toUpperCase()).getTrainStartCost();
    }
}
