package com.nscorp.cost.calculator.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResponseData {
    private CostSummary vec;
    private CostSummary vrc;
    private CostSummary coalDumping;
    private List<PushersInfo> pusherData;
    private List<SummaryData> summaryData;
}
