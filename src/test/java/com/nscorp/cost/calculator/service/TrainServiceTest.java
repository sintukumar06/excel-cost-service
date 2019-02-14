package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.repo.TrainDataRepository;
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
public class TrainServiceTest extends AbstractBaseTest {
    @InjectMocks
    private TrainService testObj;
    @Autowired
    private TrainDataRepository tdRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setTdRepository(tdRepository);
    }

    @Test
    public void getTrainStartCost() {
        double result = testObj.getTrainStartCost(getRequestInput(), 0);
        assertThat(result, equalTo(8712.0));
    }
}