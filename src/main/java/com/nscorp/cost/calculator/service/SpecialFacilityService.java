package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.SwitchEvent;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.TerminalYardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class SpecialFacilityService {
    @Autowired
    private TerminalYardRepository tyRepository;

    public double getSharedAssetAreaCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.isSpecializedFacilitySvcs() ?
                fetchDynamicSpecialFacilityChargeFrom(inputs) : calculateManualSpecialFacilityCharge(inputs);
    }

    private float calculateManualSpecialFacilityCharge(UnitTrainInputs inputs) {
        return inputs.getNumberOfCars() * getBhrrFactorPerCar(inputs);
    }

    private double fetchDynamicSpecialFacilityChargeFrom(UnitTrainInputs inputs) {
        return inputs.getSwitchEvents().stream()
                .mapToDouble(e -> inputs.getNumberOfCars() * fetchSpecialFacilityCost(e)).sum();
    }

    private float getBhrrFactorPerCar(UnitTrainInputs inputs) {
        return Objects.isNull(inputs.getManualInput()) ? 0 : inputs.getManualInput().getBhrrFactorPerCar();
    }

    private double fetchSpecialFacilityCost(SwitchEvent event) {
        return tyRepository.getOne(event.getCityAndState().toUpperCase()).getSpecFacilityPerCarloadOrig();
    }
}
