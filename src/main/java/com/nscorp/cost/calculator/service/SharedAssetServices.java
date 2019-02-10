package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.SwitchEvent;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import com.nscorp.cost.calculator.repo.TerminalYardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SharedAssetServices {
    @Autowired
    private DivisionDataRepository gtmRepository;
    @Autowired
    private TerminalYardRepository tyRepository;

    public double getSharedAssetAreaCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        double sharedAssets = inputs.getSwitchEvents().stream().mapToDouble(e -> fetchSharedAssetCost(e)).sum();
        return (inputs.getEmptyReturnRatio() > 0 ? 2 * sharedAssets : sharedAssets) + (inputs.getNumberOfCars() * (
                (unitTrain.getLoadedMiles() * getSaaPerMile(unitTrain) * (1 + inputs.getEmptyReturnRatio())) + (
                        getSaaPerOrigin(unitTrain) * (inputs.getEmptyReturnRatio() > 0 ? 1 + inputs.getEmptyReturnRatio() : 0))));
    }

    private double getSaaPerOrigin(UnitTrain unitTrain) {
        String division = unitTrain.getDivision().toUpperCase();
        return division.contains("CSAO") ? getSharedAssetAreaCostByOrigination(division) : 0;
    }

    private double getSharedAssetAreaCostByOrigination(String division) {
        return gtmRepository.getOne(division).getSharedAssetAreaCostByOrigination();
    }

    private double getSaaPerMile(UnitTrain unitTrain) {
        String division = unitTrain.getDivision().toUpperCase();
        return division.contains("CSAO") ? getSharedAssetAreaCostByCM(division) : 0;
    }

    private double getSharedAssetAreaCostByCM(String division) {
        return gtmRepository.getOne(division).getSharedAssetAreaCostByCM();
    }

    private double fetchSharedAssetCost(SwitchEvent event) {
        switch (event.getSwitchType()) {
            case "CLASS":
                return tyRepository.getOne(event.getCityAndState().toUpperCase()).getSaaClassCost();
            case "TERMINAL":
                return tyRepository.getOne(event.getCityAndState().toUpperCase()).getSaaTerminalCost();
            case "INTERCHANGE":
                return tyRepository.getOne(event.getCityAndState().toUpperCase()).getSaaInterchangeCost();
            default:
                return 0;
        }
    }
}
