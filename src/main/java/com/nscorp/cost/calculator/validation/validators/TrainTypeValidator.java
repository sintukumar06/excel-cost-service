package com.nscorp.cost.calculator.validation.validators;

import com.nscorp.cost.calculator.validation.LookUpUtils;
import com.nscorp.cost.calculator.validation.constraints.TrainType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.isNull;

public class TrainTypeValidator implements ConstraintValidator<TrainType, String> {
    @Autowired
    private LookUpUtils lookUpUtils;

    @Override
    public void initialize(TrainType constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return isNull(value) || lookUpUtils.isValidTrainType(value);
    }

}