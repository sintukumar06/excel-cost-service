package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import com.nscorp.cost.calculator.repo.GeneralAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneralAdminService {
    private GeneralAdminRepository gaRepository;
    private DivisionDataRepository gtmRepository;

    @Autowired
    public void setGaRepository(GeneralAdminRepository gaRepository) {
        this.gaRepository = gaRepository;
    }

    @Autowired
    public void setGtmRepository(DivisionDataRepository gtmRepository) {
        this.gtmRepository = gtmRepository;
    }

    public double getGeneralAdminCost(RequestInputs inputs, int index) {
        return index == 0 ? calculateCost(inputs, getAdminCostByCarload(inputs)) : 0;
    }

    public double getGACustomerServiceCost(RequestInputs inputs, int index) {
        return index == 0 ? calculateCost(inputs, getGaCustomerServiceByCarload(inputs)) : 0;
    }

    public double getGAMarketingCost(RequestInputs inputs, int index) {
        return index == 0 ? calculateCost(inputs, getGaMarketingByCarload(inputs)) : 0;
    }

    public double getGATransportationCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return unitTrain.getLoadedMiles() * (1 + inputs.getEmptyReturnRatio()) * getGaTransportbyCW(unitTrain);
    }

    private double getGaTransportbyCW(UnitTrain unitTrain) {
        return gtmRepository.getOne(unitTrain.getDivision()).getGaTransportByCW();
    }

    public double getGATaxesCost(RequestInputs inputs, int index) {
        return index == 0 ? inputs.getNumberOfCars() * getGaTaxesByCarload(inputs) : 0;
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
