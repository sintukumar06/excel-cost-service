package com.nscorp.cost.calculator.model;

import lombok.*;

@Data
@Builder
public class UnitTrain {
    private String division;
    private float loadedMiles;
    private float locomotiveDaysOnline;
    private float carDaysOnline;
    private int numberOfTrainStarts;
    private boolean carHiredOrDailyRate;
    private boolean avgJointFacilityOrHaulageOrLease;
    private boolean specializedFacilitySvcs;
}
