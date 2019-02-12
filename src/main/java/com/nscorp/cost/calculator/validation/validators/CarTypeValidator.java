package com.nscorp.cost.calculator.validation.validators;

import com.nscorp.cost.calculator.validation.LookUpUtils;
import com.nscorp.cost.calculator.validation.constraints.CarType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Objects;

public class CarTypeValidator implements ConstraintValidator<CarType, String> {
    @Autowired
    private LookUpUtils lookUpUtils;

    @Override
    public void initialize(CarType constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return Objects.isNull(value) || lookUpUtils.isValidCarType(value);
    }
}
