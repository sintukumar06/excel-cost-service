package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.City;
import com.nscorp.cost.calculator.validation.constraints.SwitchType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SwitchEvent {
    @SwitchType
    private String switchType;
    @City
    private String cityAndState;
}
