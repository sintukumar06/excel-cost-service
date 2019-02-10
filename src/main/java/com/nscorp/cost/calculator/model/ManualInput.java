package com.nscorp.cost.calculator.model;

import lombok.*;

@Data
@Builder
public class ManualInput {
    private float carHireDailyRate;
    private float carHirePerMile;
    private float bhrrFactorPerCar;
    private float tasdPerCar;
    private float tareWeightAdjust;
    private float locoWeight;
    private float networkEconomicFactor;
}
