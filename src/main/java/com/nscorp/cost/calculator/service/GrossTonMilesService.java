package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.db.MktgCarType;
import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import com.nscorp.cost.calculator.repo.MktgCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GrossTonMilesService {
    private MktgCarRepository carRepository;
    private DivisionDataRepository gtmRepository;

    @Autowired
    public void setCarRepository(MktgCarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Autowired
    public void setGtmRepository(DivisionDataRepository gtmRepository) {
        this.gtmRepository = gtmRepository;
    }

    public double getBridgeAndTrackMaintenanceCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return calculateCost(inputs, unitTrain, getBridgeAndTrackMaintenanceByGTM(unitTrain));
    }

    public double getFuelingLocomotiveCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return calculateCost(inputs, unitTrain, getFuelingLocomotiveByGTM(unitTrain));
    }

    public double getGAEngineeringCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return calculateCost(inputs, unitTrain, getGaEngineeringByGTM(unitTrain));
    }

    public double getGAMechanicalCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return calculateCost(inputs, unitTrain, getGaMechanicalByGTM(unitTrain));
    }

    public double getNetworkEconomicCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return isManualNetworkEconomicPresent(unitTrain)
                ? unitTrain.getNetworkEconomicFactor() * inputs.getNumberOfCars()
                : calculateCost(inputs, unitTrain, getNetworkEconomicByGTM(unitTrain));
    }

    private double getNetworkEconomicByGTM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getNetworkEconomicByGTM();
    }

    private double getGaMechanicalByGTM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getGaMechanicalByGTM();
    }

    private double getGaEngineeringByGTM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getGaEngineeringByGTM();
    }

    private double getFuelingLocomotiveByGTM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getFuelingLocomotiveByGTM();
    }

    private double getBridgeAndTrackMaintenanceByGTM(UnitTrain unitTrain) {
        return gtmRepository.findOne(unitTrain.getDivision()).getBridgeAndTrackMaintenanceByGTM();
    }

    private double calculateCost(RequestInputs inputs, UnitTrain unitTrain, double costByGTM) {
        return unitTrain.getLoadedMiles() * costByGTM * (inputs.getNumberOfCars()
                * (inputs.getLadingWeightPerCar() + getTare(inputs) + (getTare(inputs) * inputs.getEmptyReturnRatio()))
                + (inputs.getNumberOfLocomotives() * getLocoWeight(inputs) * (1 + inputs.getEmptyReturnRatio())));
    }

    private float getLocoWeight(RequestInputs inputs) {
        return isManualLocoWeightPresent(inputs) ? inputs.getManualInput().getLocoWeight() : 0f;
    }

    private boolean isManualLocoWeightPresent(RequestInputs inputs) {
        return !Objects.isNull(inputs.getManualInput()) && inputs.getManualInput().getLocoWeight() > 0;
    }

    private boolean isManualNetworkEconomicPresent(UnitTrain unitTrain) {
        return unitTrain.getNetworkEconomicFactor() > 0;
    }

    private float getTare(RequestInputs inputs) {
        return isManualTareWeightPresent(inputs) ? inputs.getManualInput().getTareWeightAdjust() : getTareWeight(inputs);
    }

    private boolean isManualTareWeightPresent(RequestInputs inputs) {
        return !Objects.isNull(inputs.getManualInput()) && inputs.getManualInput().getTareWeightAdjust() > 0;
    }

    private float getTareWeight(RequestInputs input) {
        MktgCarType mktgCarType = carRepository.findOne(buildMktgCarKey(input));
        return Objects.isNull(mktgCarType) ? 0f : mktgCarType.getTare();
    }

    private String buildMktgCarKey(RequestInputs input) {
        return input.getMktgCarType() + input.getCarOwner();
    }
}
