package com.nscorp.cost.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CostSummary {
    private double perCarCost;
    private double perTonCost;
    private double perTrainCost;
}
