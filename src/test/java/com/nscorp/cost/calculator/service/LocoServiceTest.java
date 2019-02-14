package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.repo.LocoDataRepository;
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
public class LocoServiceTest extends AbstractBaseTest {
    @InjectMocks
    private LocoService testObj;
    @Autowired
    private LocoDataRepository locoRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setLocoRepository(locoRepository);
    }

    @Test
    public void getLocoEconomicsCost() {
        double result = testObj.getLocoEconomicsCost(getRequestInput(), 0);
        assertThat(result, equalTo(8384.0));
    }
}