package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.SwitchEvent;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.TerminalYardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TerminalAndYardService {
    @Autowired
    private TerminalYardRepository tyRepository;

    public double getTerminalAndYardOpsCost(UnitTrainInputs inputs) {
        return inputs.getEmptyReturnRatio() > 0 ? 2 * getTotalCost(inputs) : getTotalCost(inputs);
    }

    private double getTotalCost(UnitTrainInputs inputs) {
        return getTotalMechanicalCost(inputs) + getTotalTerminalCost(inputs);
    }

    private double getTotalTerminalCost(UnitTrainInputs inputs) {
        return inputs.getSwitchEvents().stream().mapToDouble(e -> fetchTerminalCost(e)).sum();
    }

    private double getTotalMechanicalCost(UnitTrainInputs inputs) {
        return inputs.getSwitchEvents().stream()
                .mapToDouble(e -> inputs.getNumberOfCars() * getMechanicalPerCar(e)).sum();
    }

    private double getMechanicalPerCar(SwitchEvent e) {
        return tyRepository.getOne(e.getCityAndState().toUpperCase()).getMechanicalPerCar();
    }

    private double fetchTerminalCost(SwitchEvent event) {
        switch (event.getSwitchType().toUpperCase()) {
            case "CLASS":
                return tyRepository.getOne(event.getCityAndState().toUpperCase()).getClassCost();
            case "TERMINAL":
                return tyRepository.getOne(event.getCityAndState().toUpperCase()).getTerminalCost();
            case "INTERCHANGE":
                return tyRepository.getOne(event.getCityAndState().toUpperCase()).getInterchangeCost();
            default:
                return 0;
        }
    }

}
