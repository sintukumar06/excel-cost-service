package com.nscorp.cost.calculator.validation.validators;

import com.nscorp.cost.calculator.validation.LookUpUtils;
import com.nscorp.cost.calculator.validation.constraints.City;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.isNull;

public class CityValidator implements ConstraintValidator<City, String> {
    @Autowired
    private LookUpUtils lookUpUtils;

    @Override
    public void initialize(City city) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return isNull(value) || lookUpUtils.isValidCity(value);
    }
}
