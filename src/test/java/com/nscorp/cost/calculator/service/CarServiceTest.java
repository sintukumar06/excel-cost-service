package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.repo.MktgCarRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class CarServiceTest extends AbstractBaseTest {
    @InjectMocks
    private CarService testObj;
    @Autowired
    private MktgCarRepository carRepository;

    @Before
    public void setup() {
        testObj.setCarRepository(carRepository);
    }

    @Test
    public void calculateCarHireDailyRateWhenManualInputIsGiven() {
        float result = testObj.getCarHireOrDailyRate(getRequestInput(), 0);
        assertThat(result, equalTo(368280.0f));
    }
}