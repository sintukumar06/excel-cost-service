package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
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

    public double getGeneralAdminCost(RequestInputs inputs) {
        return calculateCost(inputs, getAdminCostByCarload(inputs));
    }

    public double getGACustomerServiceCost(RequestInputs inputs) {
        return calculateCost(inputs, getGaCustomerServiceByCarload(inputs));
    }

    public double getGAMarketingCost(RequestInputs inputs) {
        return calculateCost(inputs, getGaMarketingByCarload(inputs));
    }

    public double getGATransportationCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.getLoadedMiles() * (1 + inputs.getEmptyReturnRatio()) * getGaTransportbyCW(unitTrain);
    }

    private double getGaTransportbyCW(UnitTrain unitTrain) {
        return gtmRepository.getOne(unitTrain.getDivision()).getGaTransportByCW();
    }

    public double getGATaxesCost(RequestInputs inputs) {
        return inputs.getNumberOfCars() * getGaTaxesByCarload(inputs);
    }

    private double getGaMarketingByCarload(RequestInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getGaMarketingByCarload();
    }

    private double getGaTaxesByCarload(RequestInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getGaTaxesByCarload();
    }

    private double getAdminCostByCarload(RequestInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getAdminCostByCarload();
    }

    private double getGaCustomerServiceByCarload(RequestInputs inputs) {
        return gaRepository.getOne(inputs.getMktgMajorGroup()).getGaCustomerServiceByCarload();
    }

    private double calculateCost(RequestInputs inputs, double rate) {
        return inputs.getNumberOfCars() * (1 + inputs.getEmptyReturnRatio()) * rate;
    }
}
