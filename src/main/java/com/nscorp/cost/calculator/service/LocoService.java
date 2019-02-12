package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.repo.LocoDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocoService {
    public static final String SUPER_CORE_LINK_RATING = "A";
    @Autowired
    private LocoDataRepository locoRepository;

    public double getLocoEconomicsCost(RequestInputs inputs, int index) {
        UnitTrain unitTrain = inputs.getUnitTrains().get(index);
        return inputs.getNumberOfLocomotives() * unitTrain.getLocomotiveDaysOnline()
                * (1 + inputs.getEmptyReturnRatio()) * getLocoEconomicsCostPerDays();
    }

    private double getLocoEconomicsCostPerDays() {
        return locoRepository.findOne(SUPER_CORE_LINK_RATING).getLocoEconomicsCostPerDays();
    }
}
