package com.nscorp.cost.calculator.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SummaryData {
    private double carHiredOrDailyCost;
    private double carDailyReplacementCost;
}
