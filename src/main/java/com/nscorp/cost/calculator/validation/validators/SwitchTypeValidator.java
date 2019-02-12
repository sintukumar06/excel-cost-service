package com.nscorp.cost.calculator.validation.validators;

import com.nscorp.cost.calculator.validation.LookUpUtils;
import com.nscorp.cost.calculator.validation.constraints.SwitchType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class SwitchTypeValidator implements ConstraintValidator<SwitchType, String> {
    @Autowired
    private LookUpUtils lookUpUtils;

    @Override
    public void initialize(SwitchType division) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return lookUpUtils.isValidSwitchType(value);
    }
}
