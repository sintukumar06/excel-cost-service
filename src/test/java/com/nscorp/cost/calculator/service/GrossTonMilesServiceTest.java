package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.repo.DivisionDataRepository;
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
public class GrossTonMilesServiceTest extends AbstractBaseTest {
    @InjectMocks
    private GrossTonMilesService testObj;
    @Autowired
    private MktgCarRepository carRepository;
    @Autowired
    private DivisionDataRepository gtmRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setCarRepository(carRepository);
        testObj.setGtmRepository(gtmRepository);
    }

    @Test
    public void getBridgeAndTrackMaintenanceCost() {
        double result = testObj.getBridgeAndTrackMaintenanceCost(getRequestInput(), 0);
        assertThat(result, equalTo(4235.740902215691));
    }

    @Test
    public void getFuelingLocomotiveCost() {
        double result = testObj.getFuelingLocomotiveCost(getRequestInput(), 0);
        assertThat(result, equalTo(12929.115525549336));
    }

    @Test
    public void getGAEngineeringCost() {
        double result = testObj.getGAEngineeringCost(getRequestInput(), 0);
        assertThat(result, equalTo(32.36521371528885));
    }

    @Test
    public void getGAMechanicalCost() {
        double result = testObj.getGAMechanicalCost(getRequestInput(), 0);
        assertThat(result, equalTo(98.69490757171876));
    }

    @Test
    public void getNetworkEconomicCost() {
        double result = testObj.getNetworkEconomicCost(getRequestInput(), 0);
        assertThat(result, equalTo(23125.60906817819));
    }
}