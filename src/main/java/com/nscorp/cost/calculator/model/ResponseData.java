package com.nscorp.cost.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData {
    private CostSummary vec;
    private CostSummary vrc;
    private CostSummary coalDumping;
    private List<PushersInfo> pusherData;
    private List<SummaryData> summaryData;
}
