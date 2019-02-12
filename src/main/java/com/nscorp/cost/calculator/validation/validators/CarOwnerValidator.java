package com.nscorp.cost.calculator.validation.validators;

import com.nscorp.cost.calculator.validation.LookUpUtils;
import com.nscorp.cost.calculator.validation.constraints.CarOwner;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.isNull;

public class CarOwnerValidator implements ConstraintValidator<CarOwner, String> {
    @Autowired
    private LookUpUtils lookUpUtils;

    @Override
    public void initialize(CarOwner constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return isNull(value) || lookUpUtils.isValidCarOwner(value);
    }
}
