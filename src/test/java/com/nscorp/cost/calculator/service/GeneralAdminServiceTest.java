package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import com.nscorp.cost.calculator.repo.GeneralAdminRepository;
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
public class GeneralAdminServiceTest extends AbstractBaseTest {
    @InjectMocks
    private GeneralAdminService testObj;
    @Autowired
    private GeneralAdminRepository gaRepository;
    @Autowired
    private DivisionDataRepository gtmRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setGaRepository(gaRepository);
        testObj.setGtmRepository(gtmRepository);
    }

    @Test
    public void getGeneralAdminCost() {
        double result = testObj.getGeneralAdminCost(getRequestInput());
        assertThat(result, equalTo(2133.12));
    }

    @Test
    public void getGACustomerServiceCost() {
        double result = testObj.getGACustomerServiceCost(getRequestInput());
        assertThat(result, equalTo(0.0));
    }

    @Test
    public void getGAMarketingCost() {
        double result = testObj.getGAMarketingCost(getRequestInput());
        assertThat(result, equalTo(142.56));
    }

    @Test
    public void getGATransportationCost() {
        double result = testObj.getGATransportationCost(getRequestInput(), 0);
        assertThat(result, equalTo(76.62188165086509));
    }

    @Test
    public void getGATaxesCost() {
        double result = testObj.getGATaxesCost(getRequestInput());
        assertThat(result, equalTo(402.59999999999997));
    }
}