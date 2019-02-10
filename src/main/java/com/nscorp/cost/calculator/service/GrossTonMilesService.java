package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import com.nscorp.cost.calculator.repo.MktgCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GrossTonMilesService {
    @Autowired
    private DivisionDataRepository gtmRepository;
    @Autowired
    private MktgCarRepository carRepository;

    public double getBridgeAndTrackMaintenanceCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return calculateCost(inputs, unitTrain, getBridgeAndTrackMaintenanceByGTM(unitTrain));
    }

    public double getFuelingLocomotiveCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return calculateCost(inputs, unitTrain, getFuelingLocomotiveByGTM(unitTrain));
    }

    private double getFuelingLocomotiveByGTM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getFuelingLocomotiveByGTM();
    }

    private double getBridgeAndTrackMaintenanceByGTM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getBridgeAndTrackMaintenanceByGTM();
    }

    private double calculateCost(UnitTrainInputs inputs, UnitTrain unitTrain, double costByGTM) {
        return unitTrain.getLoadedMiles() * costByGTM * (inputs.getNumberOfCars()
                * (inputs.getLadingWeightPerCar() + getTare(inputs) + (getTare(inputs) * inputs.getEmptyReturnRatio()))
                + (inputs.getNumberOfLocomotives() * getLocoWeight(inputs) * (1 + inputs.getEmptyReturnRatio())));
    }

    private float getLocoWeight(UnitTrainInputs inputs) {
        return isManualLocoWeightPresent(inputs) ? inputs.getManualInput().getLocoWeight() : 0f;
    }

    private boolean isManualLocoWeightPresent(UnitTrainInputs inputs) {
        return !Objects.isNull(inputs.getManualInput()) && inputs.getManualInput().getLocoWeight() > 0;
    }

    private float getTare(UnitTrainInputs inputs) {
        return isManualTareWeightPresent(inputs) ? inputs.getManualInput().getTareWeightAdjust() : getTareWeight(inputs);
    }

    private boolean isManualTareWeightPresent(UnitTrainInputs inputs) {
        return !Objects.isNull(inputs.getManualInput()) && inputs.getManualInput().getTareWeightAdjust() > 0;
    }

    private float getTareWeight(UnitTrainInputs input) {
        return carRepository.findOne(buildMktgCarKey(input)).getTare();
    }

    private String buildMktgCarKey(UnitTrainInputs input) {
        return input.getMktgCarType().concat(input.getCarOwner());
    }
}
