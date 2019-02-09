package com.nscorp.cost.calculator.model;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResponseData {
    private List<SummaryData> summaryDataList;
}
