package com.nscorp.cost.calculator.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CostSummary {
    private double perCarCost;
    private double perTonCost;
    private double perTrainCost;
}
