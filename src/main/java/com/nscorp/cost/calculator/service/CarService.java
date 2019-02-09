package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.db.MktgCarTypeId;
import com.nscorp.cost.calculator.model.ManualInput;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.MktgCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CarService {
    @Autowired
    private MktgCarRepository carRepository;

    public float getCarHireOrDailyRate(UnitTrainInputs input, int index) {
        UnitTrain unitTrain = input.getUnitTrains().get(index);
        if (isManualCarHireRatePresent(input.getManualInput())) {
            return (1 + input.getEmptyReturnRatio()) * input.getNumberOfCars() *
                    (unitTrain.getCarDaysOnline() * input.getManualInput().getCarHireDailyRate()
                            + input.getManualInput().getCarHirePerMile() * unitTrain.getLoadedMiles());
        }
        if (!isManualCarHireRatePresent(input.getManualInput()) && unitTrain.isCarHiredOrDailyRate()) {
            return (1 + input.getEmptyReturnRatio()) * input.getNumberOfCars() *
                    (unitTrain.getCarDaysOnline() * getDailyEquipmentCost(input) + getMileageRate(input) * unitTrain.getLoadedMiles());
        }
        return 0;
    }

    private float getMileageRate(UnitTrainInputs input) {
        return carRepository.findOne(buildMktgCarKey(input)).getMileageRate();
    }

    private float getDailyEquipmentCost(UnitTrainInputs input) {
        return carRepository.findOne(buildMktgCarKey(input)).getDailyEquipmentCost();
    }

    private MktgCarTypeId buildMktgCarKey(UnitTrainInputs input) {
        return MktgCarTypeId.builder().marketingCarType(input.getMktgCarType()).carOwner(input.getCarOwner()).build();
    }

    private boolean isManualCarHireRatePresent(ManualInput input) {
        return !Objects.isNull(input) && (input.getCarHireDailyRate() > 0 || input.getCarHirePerMile() > 0);
    }
}
