package com.nscorp.cost.calculator.validation.constraints;

import com.nscorp.cost.calculator.validation.validators.CityValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target({METHOD, FIELD})
@Retention(RUNTIME)
@Documented
@Constraint(validatedBy = {CityValidator.class})
public @interface City {
    String message() default "{value} is not a valid City Name as per lookup Table/ Data.";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
