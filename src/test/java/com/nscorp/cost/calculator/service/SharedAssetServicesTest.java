package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.repo.DivisionDataRepository;
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

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class SharedAssetServicesTest extends AbstractBaseTest {
    @InjectMocks
    private SharedAssetServices testObj;
    @Autowired
    private TerminalYardRepository tyRepository;
    @Autowired
    private DivisionDataRepository gtmRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setGtmRepository(gtmRepository);
        testObj.setTyRepository(tyRepository);
    }

    @Test
    public void getSharedAssetAreaCost() {
    }
}