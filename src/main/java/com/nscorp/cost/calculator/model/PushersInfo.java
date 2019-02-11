package com.nscorp.cost.calculator.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
public class PushersInfo {
    private String division;
    private float loadedMiles;
    private float pusherDaysOnline;
    private float numberOfPushers;
    private int numberOfPusherStarts;
    private double pusherCostPerCar;
    private double pusherCostPerTrain;
}
