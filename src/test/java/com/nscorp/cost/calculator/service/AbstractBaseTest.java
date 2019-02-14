package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.*;

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
                .switchEvents(Arrays.asList(
                        SwitchEvent.builder().switchType("INTERCHANGE").cityAndState("AYER, MA").build(),
                        SwitchEvent.builder().switchType("INTERCHANGE").cityAndState("MOBILE, AL").build()))
                .manualInput(ManualInput.builder()
                        .carHireDailyRate(12.0f)
                        .carHirePerMile(5.0f)
                        .build())
                .pushers(Arrays.asList(PushersInfo.builder().division("S JERSEY CSAO").loadedMiles(27)
                        .pusherDaysOnline(2).numberOfPushers(4).numberOfPusherStarts(3).build()))
                .unitTrains(Arrays.asList(UnitTrain.builder()
                        .division("ALABAMA")
                        .loadedMiles(273.0f)
                        .locomotiveDaysOnline(2.00f)
                        .carDaysOnline(2.50f)
                        .numberOfTrainStarts(3)
                        .build()))
                .carHiredOrDailyRate(true)
                .avgJointFacilityOrHaulageOrLease(true)
                .specializedFacilitySvcs(false)
                .build();
    }
}
