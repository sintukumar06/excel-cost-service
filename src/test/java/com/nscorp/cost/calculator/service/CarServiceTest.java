package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.ExcelCostCalculatorApplication;
import com.nscorp.cost.calculator.model.ManualInput;
import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@Slf4j
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = {ExcelCostCalculatorApplication.class})
public class CarServiceTest {
    @Autowired
    private CarService carService;

    @Test
    public void calculateCarHireDailyRateWhenManualInputIsGiven() {
        float result = carService.getCarHireOrDailyRate(getRequestInput(), 0);
        log.info("Result calculated :" + result);
    }

    private RequestInputs getRequestInput() {
        return RequestInputs.builder()
                .mktgMajorGroup("COAL")
                .numberOfCars(132)
                .ladingWeightPerCar(89.0f)
                .numberOfLocomotives(4)
                .mktgCarType("HE")
                .carOwner("PRIVATE")
                .emptyReturnRatio(1.0f)
                .trainType("UNIT BULK")
                .manualInput(ManualInput.builder()
                        .carHireDailyRate(12.0f)
                        .carHirePerMile(5.0f)
                        .build())
                .unitTrains(Arrays.asList(UnitTrain.builder()
                        .division("ALABAMA")
                        .loadedMiles(273.0f)
                        .locomotiveDaysOnline(2.00f)
                        .carDaysOnline(2.50f)
                        .numberOfTrainStarts(3)
                        .carHiredOrDailyRate(true)
                        .avgJointFacilityOrHaulageOrLease(false)
                        .specializedFacilitySvcs(false)
                        .build()))
                .build();
    }
}