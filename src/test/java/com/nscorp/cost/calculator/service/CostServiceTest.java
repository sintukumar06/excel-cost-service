package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.ResponseData;
import com.nscorp.cost.calculator.repo.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class CostServiceTest extends AbstractBaseTest {
    @InjectMocks
    private CostService testObj;
    @Spy
    private CarService carService;
    @Spy
    private JFHLService jfhlService;
    @Spy
    private LocoService locoService;
    @Spy
    private CarMilesService cmService;
    @Spy
    private TrainService trainService;
    @Spy
    private PusherService pusherService;
    @Spy
    private GeneralAdminService gaService;
    @Spy
    private SharedAssetServices saaService;
    @Spy
    private GrossTonMilesService gtmService;
    @Spy
    private SpecialFacilityService sfService;
    @Spy
    private TerminalAndYardService tyService;
    @Spy
    private CoalDumpingService coalDumpingService;
    @Spy
    @InjectMocks
    private SummaryDataService summaryDataService;

    @Autowired
    private MktgCarRepository carRepository;
    @Autowired
    private TrainDataRepository tdRepository;
    @Autowired
    private LocoDataRepository locoRepository;
    @Autowired
    private TerminalYardRepository tyRepository;
    @Autowired
    private GeneralAdminRepository gaRepository;
    @Autowired
    private DivisionDataRepository gtmRepository;
    @Autowired
    private DumpingChargeRepository dcRepository;
    @Autowired
    private RateIndexRepository riRepository;

    @Before
    public void setUp() throws Exception {
        testObj.setRiRepository(riRepository);
        carService.setCarRepository(carRepository);
        cmService.setGtmRepository(gtmRepository);
        gaService.setGaRepository(gaRepository);
        gaService.setGtmRepository(gtmRepository);
        gtmService.setGtmRepository(gtmRepository);
        gtmService.setCarRepository(carRepository);
        jfhlService.setGtmRepository(gtmRepository);
        locoService.setLocoRepository(locoRepository);
        saaService.setGtmRepository(gtmRepository);
        saaService.setTyRepository(tyRepository);
        sfService.setTyRepository(tyRepository);
        tyService.setTyRepository(tyRepository);
        trainService.setTdRepository(tdRepository);
        pusherService.setLocoRepository(locoRepository);
        pusherService.setGtmRepository(gtmRepository);
        coalDumpingService.setDcRepository(dcRepository);
    }


    @Test
    public void computeCost() {
        ResponseData result = testObj.computeCost(getRequestInput());
        assertThat(result, allOf(
                hasProperty("vec"),
                hasProperty("vrc"),
                hasProperty("coalDumping"),
                hasProperty("summaryData", allOf(hasSize(1), contains(allOf(
                        hasProperty("carHiredOrDailyCost", equalTo(368280.0D)),
                        hasProperty("carDailyReplacementCost", equalTo(0.0D)),
                        hasProperty("bridgeAndTrackMaintenanceCost", equalTo(4235.740902215691D)),
                        hasProperty("communicationAndSignalCost", equalTo(975.3245379232507D)),
                        hasProperty("fuelingLocomotivesCost", equalTo(12929.115525549336D)),
                        hasProperty("gaAdminCost", equalTo(2133.12D)),
                        hasProperty("gaCustomerServiceCost", equalTo(0.0D)),
                        hasProperty("gaEngineeringCost", equalTo(32.36521371528885D)),
                        hasProperty("gaMarketingCost", equalTo(142.56D)),
                        hasProperty("gaMechanicalCost", equalTo(98.69490757171876D)),
                        hasProperty("gaTransportationCost", equalTo(76.62188165086509D)),
                        hasProperty("locoOpsAndMaintenanceCost", equalTo(5305.050617283039D)),
                        hasProperty("sharedAssetAreaCost", equalTo(107.50723064D)),
                        hasProperty("specializedFacilitiesServicesCost", equalTo(112200.0D)),
                        hasProperty("jointFacilityHaulageLeaseCost", equalTo(3146.1807396036456D)),
                        hasProperty("networkEconomicCost", equalTo(23125.60906817819D)),
                        hasProperty("locomotiveEconomicCost", equalTo(8384.0D)),
                        hasProperty("carMaintenance", equalTo(0.0D)),
                        hasProperty("gaTaxes", equalTo(402.59999999999997D)),
                        hasProperty("terminalYardOpsInspectionCost", equalTo(519.68544788D)),
                        hasProperty("trainStartCost", equalTo(8712.0D))))))));
    }
}