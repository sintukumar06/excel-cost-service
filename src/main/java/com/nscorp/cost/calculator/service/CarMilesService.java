package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarMilesService {
    @Autowired
    private DivisionDataRepository gtmRepository;

    public double getCommunicationAndSignalCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return computeCost(inputs, unitTrain, getCommunicationAndSignalByCM(unitTrain));
    }

    public double getLocoOpsAndMaintenanceCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return computeCost(inputs, unitTrain, getLocoOpsMaintenanceByCM(unitTrain));
    }

    private double getLocoOpsMaintenanceByCM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getLocoOpsMaintenanceByCM();
    }

    private double computeCost(UnitTrainInputs inputs, UnitTrain unitTrain, double rate) {
        return unitTrain.getLoadedMiles() * inputs.getNumberOfCars() * (1 + inputs.getEmptyReturnRatio()) * rate;
    }

    private double getCommunicationAndSignalByCM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getCommunicationAndSignalByCM();
    }
}
