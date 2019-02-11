package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.SummaryData;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class SummaryDataService {
    private static final String NONE_DIVISION = "NONE";

    @Autowired
    private CarService carService;
    @Autowired
    private JFHLService jfhlService;
    @Autowired
    private LocoService locoService;
    @Autowired
    private CarMilesService cmService;
    @Autowired
    private TrainService trainService;
    @Autowired
    private GeneralAdminService gaService;
    @Autowired
    private SharedAssetServices saaService;
    @Autowired
    private GrossTonMilesService gtmService;
    @Autowired
    private SpecialFacilityService sfService;
    @Autowired
    private TerminalAndYardService tyService;

    protected List<SummaryData> getSummaryDataList(final UnitTrainInputs inputs) {
        return IntStream.range(0, ListUtils.emptyIfNull(inputs.getUnitTrains()).size())
                .mapToObj(i -> isValidDivision(inputs, i) ? getDummySummaryData() : createSummaryData(inputs, i))
                .collect(Collectors.toList());
    }

    private SummaryData getDummySummaryData() {
        return SummaryData.builder().build();
    }

    private boolean isValidDivision(UnitTrainInputs inputs, int i) {
        return NONE_DIVISION.equalsIgnoreCase(inputs.getUnitTrains().get(i).getDivision());
    }

    private SummaryData createSummaryData(UnitTrainInputs inputs, int i) {
        return SummaryData.builder()
                .gaTaxes(gaService.getGATaxesCost(inputs))
                .gaAdminCost(gaService.getGeneralAdminCost(inputs))
                .gaMarketingCost(gaService.getGAMarketingCost(inputs))
                .trainStartCost(trainService.getTrainStartCost(inputs, i))
                .gaMechanicalCost(gtmService.getGAMechanicalCost(inputs, i))
                .gaEngineeringCost(gtmService.getGAEngineeringCost(inputs, i))
                .carHiredOrDailyCost(carService.getCarHireOrDailyRate(inputs, i))
                .networkEconomicCost(gtmService.getNetworkEconomicCost(inputs, i))
                .sharedAssetAreaCost(saaService.getSharedAssetAreaCost(inputs, i))
                .gaCustomerServiceCost(gaService.getGACustomerServiceCost(inputs))
                .gaTransportationCost(gaService.getGATransportationCost(inputs, i))
                .locomotiveEconomicCost(locoService.getLocoEconomicsCost(inputs, i))
                .fuelingLocomotivesCost(gtmService.getFuelingLocomotiveCost(inputs, i))
                .carDailyReplacementCost(carService.getCarDailyReplacementRate(inputs, i))
                .terminalYardOpsInspectionCost(tyService.getTerminalAndYardOpsCost(inputs))
                .locoOpsAndMaintenanceCost(cmService.getLocoOpsAndMaintenanceCost(inputs, i))
                .specializedFacilitiesServicesCost(sfService.getSharedAssetAreaCost(inputs, i))
                .communicationAndSignalCost(cmService.getCommunicationAndSignalCost(inputs, i))
                .bridgeAndTrackMaintenanceCost(gtmService.getBridgeAndTrackMaintenanceCost(inputs, i))
                .jointFacilityHaulageLeaseCost(jfhlService.getJointFacilityHaulageLeaseCost(inputs, i))
                .build();
    }
}
