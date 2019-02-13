package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.ManualInput;
import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.UnitTrain;

import java.util.Arrays;

public abstract class AbstractBaseTest {
    protected RequestInputs getRequestInput() {
        return RequestInputs.builder()
                .mktgMajorGroup("COAL")
                .numberOfCars(132)
                .ladingWeightPerCar(89.0f)
                .numberOfLocomotives(4)
                .mktgCarType("HE")
                .carOwner("PRIVATE")
                .emptyReturnRatio(1.0f)
                .trainType("UNIT BULK")
                .coalDumpingCity("Lamberts Point")
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