package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.City;
import com.nscorp.cost.calculator.validation.constraints.SwitchType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SwitchEvent {
    @SwitchType
    private String switchType;
    @City
    private String cityAndState;
}
