package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.CostSummary;
import com.nscorp.cost.calculator.repo.DumpingChargeRepository;
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
public class CoalDumpingServiceTest extends AbstractBaseTest {
    @InjectMocks
    private CoalDumpingService testObj;
    @Autowired
    private DumpingChargeRepository dcRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setDcRepository(dcRepository);
    }

    @Test
    public void calculateCarHireDailyRateWhenManualInputIsGiven() {
        CostSummary result = testObj.getCoalDumping(getRequestInput());
        assertThat(result.getPerTonCost(), equalTo(-2.27841367));
        assertThat(result.getPerCarCost(), equalTo(-202.77881663));
        assertThat(result.getPerTrainCost(), equalTo(-26766.803795159998));
    }
}