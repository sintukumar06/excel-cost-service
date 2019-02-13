package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.Division;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class PushersInfo {
    @Division
    private String division;
    private float loadedMiles;
    private float pusherDaysOnline;
    private float numberOfPushers;
    private int numberOfPusherStarts;
    private double pusherCostPerCar;
    private double pusherCostPerTrain;
}
