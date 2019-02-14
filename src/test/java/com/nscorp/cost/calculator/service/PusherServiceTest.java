package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.PushersInfo;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
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

import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class PusherServiceTest extends AbstractBaseTest {
    @InjectMocks
    private PusherService testObj;
    @Autowired
    private DivisionDataRepository gtmRepository;
    @Autowired
    private LocoDataRepository locoRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setGtmRepository(gtmRepository);
        testObj.setLocoRepository(locoRepository);
    }

    @Test
    public void getPusherData() {
        List<PushersInfo> result = testObj.getPusherData(getRequestInput());
        assertThat(result, allOf(
                hasSize(1),
                contains(allOf(
                        hasProperty("pusherCostPerCar", equalTo(31.770658774783172D)),
                        hasProperty("pusherCostPerTrain", equalTo(4193.726958271379D))))));
    }
}