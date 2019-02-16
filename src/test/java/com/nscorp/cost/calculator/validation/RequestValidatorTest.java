package com.nscorp.cost.calculator.validation;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.SwitchEvent;
import com.nscorp.cost.calculator.model.UnitTrain;
import com.nscorp.cost.calculator.service.AbstractBaseTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.ConstraintViolation;
import javax.validation.Validator;
import java.util.Set;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class RequestValidatorTest extends AbstractBaseTest {
    @Autowired
    private Validator validator;

    @Test
    public void isInValidDivisionOnNull() {
        Set<ConstraintViolation<UnitTrain>> constraintViolations = validator.validate(UnitTrain.builder().build());
        assertThat(constraintViolations, hasSize(2));
    }

    @Test
    public void isInValidDivisionOnInvalidValue() {
        Set<ConstraintViolation<UnitTrain>> constraintViolations = validator
                .validate(UnitTrain.builder().division("DUMMY").build());
        assertThat(constraintViolations, hasSize(1));
    }

    @Test
    public void isInValidCarOwnerOnInvalidValue() {
        RequestInputs requestInputs = getRequestInput();
        requestInputs.setCarOwner("INVALIDTYPE");
        Set<ConstraintViolation<RequestInputs>> constraintViolations = validator.validate(requestInputs);
        assertThat(constraintViolations, hasSize(1));
    }

    @Test
    public void isInValidCarTypeOnInvalidValue() {
        RequestInputs requestInputs = getRequestInput();
        requestInputs.setMktgCarType("XX");
        Set<ConstraintViolation<RequestInputs>> constraintViolations = validator.validate(requestInputs);
        assertThat(constraintViolations, hasSize(1));
    }

    @Test
    public void isInValidCityOnInvalidValue() {
        RequestInputs requestInputs = getRequestInput();
        requestInputs.setCoalDumpingCity("InvalidCity");
        Set<ConstraintViolation<RequestInputs>> constraintViolations = validator.validate(requestInputs);
        assertThat(constraintViolations, hasSize(1));
    }

    @Test
    public void isInValidMajorGroupOnInvalidValue() {
        RequestInputs requestInputs = getRequestInput();
        requestInputs.setMktgMajorGroup("MajorGroup");
        Set<ConstraintViolation<RequestInputs>> constraintViolations = validator.validate(requestInputs);
        assertThat(constraintViolations, hasSize(1));
    }

    @Test
    public void isInValidSwitchTypeOnInvalidValue() {
        Set<ConstraintViolation<SwitchEvent>> constraintViolations = validator
                .validate(SwitchEvent.builder().switchType("INVALID").build());
        assertThat(constraintViolations, hasSize(1));
    }

    @Test
    public void isInValidTrainTypeeOnInvalidValue() {
        RequestInputs requestInputs = getRequestInput();
        requestInputs.setTrainType("TrainTYpe");
        Set<ConstraintViolation<RequestInputs>> constraintViolations = validator.validate(requestInputs);
        assertThat(constraintViolations, hasSize(1));
    }
}