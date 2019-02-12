package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.Division;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UnitTrain {
    @Division
    private String division;
    private float loadedMiles;
    private float locomotiveDaysOnline;
    private float carDaysOnline;
    private int numberOfTrainStarts;
    private boolean carHiredOrDailyRate;
    private boolean avgJointFacilityOrHaulageOrLease;
    private boolean specializedFacilitySvcs;
}
