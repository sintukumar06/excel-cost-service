package com.nscorp.cost.calculator.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SwitchEvent {
    private String switchType;
    private String cityAndState;
}
