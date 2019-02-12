package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.SwitchEvent;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.repo.TerminalYardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;
import static org.apache.commons.collections4.ListUtils.emptyIfNull;

@Service
public class SpecialFacilityService {
    @Autowired
    private TerminalYardRepository tyRepository;

    public double getSharedAssetAreaCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.isSpecializedFacilitySvcs() ?
                fetchDynamicSpecialFacilityChargeFrom(inputs) : calculateManualSpecialFacilityCharge(inputs);
    }

    private float calculateManualSpecialFacilityCharge(RequestInputs inputs) {
        return inputs.getNumberOfCars() * getBhrrFactorPerCar(inputs);
    }

    private double fetchDynamicSpecialFacilityChargeFrom(RequestInputs inputs) {
        return emptyIfNull(inputs.getSwitchEvents()).stream()
                .mapToDouble(e -> inputs.getNumberOfCars() * fetchSpecialFacilityCost(e)).sum();
    }

    private float getBhrrFactorPerCar(RequestInputs inputs) {
        return isNull(inputs.getManualInput()) ? 0 : inputs.getManualInput().getBhrrFactorPerCar();
    }

    private double fetchSpecialFacilityCost(SwitchEvent event) {
        return tyRepository.getOne(event.getCityAndState().toUpperCase()).getSpecFacilityPerCarloadOrig();
    }
}
