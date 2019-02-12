package com.nscorp.cost.calculator.validation.validators;

import com.nscorp.cost.calculator.validation.LookUpUtils;
import com.nscorp.cost.calculator.validation.constraints.MajorGroupType;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import static java.util.Objects.isNull;

public class MajorGroupTypeValidator implements ConstraintValidator<MajorGroupType, String> {
    @Autowired
    private LookUpUtils lookUpUtils;

    @Override
    public void initialize(MajorGroupType majorGroupType) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        return !isNull(value) && lookUpUtils.isValidMajorGroupType(value);
    }
}
