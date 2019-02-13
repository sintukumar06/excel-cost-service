package com.nscorp.cost.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ManualInput {
    private float carHireDailyRate;
    private float carHirePerMile;
    private float bhrrFactorPerCar;
    private float tasdPerCar;
    private float tareWeightAdjust;
    private float locoWeight;
    private float networkEconomicFactor;
}
