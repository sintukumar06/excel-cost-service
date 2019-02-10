package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import com.nscorp.cost.calculator.repo.GeneralAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralAdminService {
    @Autowired
    private GeneralAdminRepository gaRepository;
    @Autowired
    private DivisionDataRepository gtmRepository;

    public double getGeneralAdminCost(UnitTrainInputs inputs) {
        return calculateCost(inputs, getAdminCostByCarload(inputs));
    }

    public double getGACustomerServiceCost(UnitTrainInputs inputs) {
        return calculateCost(inputs, getGaCustomerServiceByCarload(inputs));
    }

    public double getGAMarketingCost(UnitTrainInputs inputs) {
        return calculateCost(inputs, getGaMarketingByCarload(inputs));
    }

    public double getGATransportationCost(UnitTrainInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.getLoadedMiles() * (1 + inputs.getEmptyReturnRatio()) * getGaTransportbyCW(unitTrain);
    }

    private double getGaTransportbyCW(UnitTrain unitTrain) {
        return gtmRepository.getOne(unitTrain.getDivision()).getGATransportbyCW();
    }

    public double getGATaxesCost(UnitTrainInputs inputs) {
        return inputs.getNumberOfCars() * getGaTaxesByCarload(inputs);
    }

    private double getGaMarketingByCarload(UnitTrainInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getGAMarketingByCarload();
    }

    private double getGaTaxesByCarload(UnitTrainInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getGATaxesByCarload();
    }

    private double getAdminCostByCarload(UnitTrainInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getAdminCostByCarload();
    }

    private double getGaCustomerServiceByCarload(UnitTrainInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getGACustomerServiceByCarload();
    }

    private double calculateCost(UnitTrainInputs inputs, double rate) {
        return inputs.getNumberOfCars() * (1 + inputs.getEmptyReturnRatio()) * rate;
    }
}
