package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.db.MktgCarType;
import com.nscorp.cost.calculator.model.ManualInput;
import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.repo.MktgCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class CarService {
    private MktgCarRepository carRepository;

    @Autowired
    public void setCarRepository(MktgCarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public float getCarHireOrDailyRate(RequestInputs input, int index) {
        UnitTrain unitTrain = input.getUnitTrains().get(index);
        if (isManualCarHireRatePresent(input.getManualInput())) {
            return (1 + input.getEmptyReturnRatio()) * input.getNumberOfCars() *
                    (unitTrain.getCarDaysOnline() * input.getManualInput().getCarHireDailyRate()
                            + input.getManualInput().getCarHirePerMile() * unitTrain.getLoadedMiles());
        }
        if (!isManualCarHireRatePresent(input.getManualInput()) && input.isCarHiredOrDailyRate()) {
            return getCarDailyEquipmentCost(input, unitTrain) + getCarMileageCost(input, unitTrain);
        }
        return 0;
    }

    public float getCarDailyReplacementRate(RequestInputs input, int index) {
        UnitTrain unitTrain = input.getUnitTrains().get(index);
        return isCarReplacementRateApplicable(input) ? getCarDailyReplacementCost(input, unitTrain) : 0;
    }

    private boolean isCarReplacementRateApplicable(RequestInputs input) {
        return !"PRIVATE".equalsIgnoreCase(input.getCarOwner()) && input.isCarHiredOrDailyRate();
    }

    private float getCarMileageCost(RequestInputs input, UnitTrain unitTrain) {
        return (1 + input.getEmptyReturnRatio()) * input.getNumberOfCars() * getMileageRate(input) * unitTrain.getLoadedMiles();
    }

    private float getCarDailyReplacementCost(RequestInputs input, UnitTrain unitTrain) {
        return (1 + input.getEmptyReturnRatio()) * input.getNumberOfCars() * unitTrain.getCarDaysOnline() * getDailyReplacementRate(input);
    }

    private float getDailyReplacementRate(RequestInputs input) {
        MktgCarType mktgCarType = carRepository.findOne(buildMktgCarKey(input));
        return Objects.isNull(mktgCarType) ? 0f : mktgCarType.getDailyReplacement();
    }

    private float getCarDailyEquipmentCost(RequestInputs input, UnitTrain unitTrain) {
        return (1 + input.getEmptyReturnRatio()) * input.getNumberOfCars() * unitTrain.getCarDaysOnline() * getDailyEquipmentCost(input);
    }

    private float getMileageRate(RequestInputs input) {
        MktgCarType mktgCarType = carRepository.findOne(buildMktgCarKey(input));
        return Objects.isNull(mktgCarType) ? 0f : mktgCarType.getMileageRate();
    }

    private float getDailyEquipmentCost(RequestInputs input) {
        MktgCarType mktgCarType = carRepository.findOne(buildMktgCarKey(input));
        return Objects.isNull(mktgCarType) ? 0f : mktgCarType.getDailyEquipmentCost();
    }

    private String buildMktgCarKey(RequestInputs input) {
        return input.getMktgCarType() + input.getCarOwner();
    }

    private boolean isManualCarHireRatePresent(ManualInput input) {
        return !Objects.isNull(input) && (input.getCarHireDailyRate() > 0 || input.getCarHirePerMile() > 0);
    }
}
