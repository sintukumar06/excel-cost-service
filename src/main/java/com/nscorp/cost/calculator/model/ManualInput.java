package com.nscorp.cost.calculator.model;

import lombok.*;

@Data
@Builder
public class ManualInput {
    private float carHireDailyRate;
    private float carHirePerMile;
}
