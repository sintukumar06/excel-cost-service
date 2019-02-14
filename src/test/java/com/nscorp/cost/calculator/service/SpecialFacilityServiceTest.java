package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.repo.TerminalYardRepository;
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
public class SpecialFacilityServiceTest extends AbstractBaseTest {
    @InjectMocks
    private SpecialFacilityService testObj;
    @Autowired
    private TerminalYardRepository tyRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setTyRepository(tyRepository);
    }

    @Test
    public void getSpecializedFacilitiesServicesCost() {
        double result = testObj.getSpecializedFacilitiesServicesCost(getRequestInput(), 0);
        assertThat(result, equalTo(112200.0));
    }
}