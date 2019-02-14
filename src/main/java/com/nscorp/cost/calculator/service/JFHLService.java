package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class JFHLService {
    private DivisionDataRepository gtmRepository;

    @Autowired
    public void setGtmRepository(DivisionDataRepository gtmRepository) {
        this.gtmRepository = gtmRepository;
    }

    public double getJointFacilityHaulageLeaseCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return inputs.isAvgJointFacilityOrHaulageOrLease()
                ? fetchJointFacilityHaulageLeaseChargeFrom(inputs, unitTrain)
                : calculateJointFacilityHaulageLeaseCharge(inputs);
    }

    private float calculateJointFacilityHaulageLeaseCharge(RequestInputs inputs) {
        return inputs.getNumberOfCars() * getTasdFactorPerCar(inputs);
    }

    private double fetchJointFacilityHaulageLeaseChargeFrom(RequestInputs inputs, UnitTrain unitTrain) {
        return inputs.getNumberOfCars() * unitTrain.getLoadedMiles() * (1 + inputs.getEmptyReturnRatio())
                * fetchJointFacilityHaulageLeaseCost(unitTrain.getDivision());
    }

    private float getTasdFactorPerCar(RequestInputs inputs) {
        return Objects.isNull(inputs.getManualInput()) ? 0 : inputs.getManualInput().getTasdPerCar();
    }

    private double fetchJointFacilityHaulageLeaseCost(String division) {
        return gtmRepository.getOne(division.toUpperCase()).getJFHLCostByCM();
    }
}
