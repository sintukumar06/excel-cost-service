package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.SwitchEvent;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class JFHLService {
    @Autowired
    private DivisionDataRepository gtmRepository;

    public double getJointFacilityHaulageLeaseCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.isAvgJointFacilityOrHaulageOrLease()
                ? fetchJointFacilityHaulageLeaseChargeFrom(inputs, unitTrain)
                : calculateJointFacilityHaulageLeaseCharge(inputs);
    }

    private float calculateJointFacilityHaulageLeaseCharge(UnitTrainInputs inputs) {
        return inputs.getNumberOfCars() * getTasdFactorPerCar(inputs);
    }

    private double fetchJointFacilityHaulageLeaseChargeFrom(UnitTrainInputs inputs, UnitTrain unitTrain) {
        return inputs.getNumberOfCars() * unitTrain.getLoadedMiles() * (1 + inputs.getEmptyReturnRatio())
                * fetchJointFacilityHaulageLeaseCost(unitTrain.getDivision());
    }

    private float getTasdFactorPerCar(UnitTrainInputs inputs) {
        return Objects.isNull(inputs.getManualInput()) ? 0 : inputs.getManualInput().getTasdPerCar();
    }

    private double fetchJointFacilityHaulageLeaseCost(String division) {
        return gtmRepository.getOne(division.toUpperCase()).getJFHLCostByCM();
    }
}
