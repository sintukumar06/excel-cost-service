package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.RequestInputs;
import com.nscorp.cost.calculator.model.SummaryData;
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

    protected List<SummaryData> getSummaryDataList(final RequestInputs inputs) {
        return IntStream.range(0, ListUtils.emptyIfNull(inputs.getUnitTrains()).size())
                .mapToObj(i -> isValidDivision(inputs, i) ? getDummySummaryData() : createSummaryData(inputs, i))
                .collect(Collectors.toList());
    }

    private SummaryData getDummySummaryData() {
        return SummaryData.builder().build();
    }

    private boolean isValidDivision(RequestInputs inputs, int i) {
        return NONE_DIVISION.equalsIgnoreCase(inputs.getUnitTrains().get(i).getDivision());
    }

    private SummaryData createSummaryData(RequestInputs inputs, int i) {
        return SummaryData.builder()
                .gaTaxes(gaService.getGATaxesCost(inputs, i))
                .gaAdminCost(gaService.getGeneralAdminCost(inputs, i))
                .gaMarketingCost(gaService.getGAMarketingCost(inputs, i))
                .trainStartCost(trainService.getTrainStartCost(inputs, i))
                .gaMechanicalCost(gtmService.getGAMechanicalCost(inputs, i))
                .gaEngineeringCost(gtmService.getGAEngineeringCost(inputs, i))
                .carHiredOrDailyCost(carService.getCarHireOrDailyRate(inputs, i))
                .networkEconomicCost(gtmService.getNetworkEconomicCost(inputs, i))
                .sharedAssetAreaCost(saaService.getSharedAssetAreaCost(inputs, i))
                .gaTransportationCost(gaService.getGATransportationCost(inputs, i))
                .locomotiveEconomicCost(locoService.getLocoEconomicsCost(inputs, i))
                .gaCustomerServiceCost(gaService.getGACustomerServiceCost(inputs, i))
                .fuelingLocomotivesCost(gtmService.getFuelingLocomotiveCost(inputs, i))
                .carDailyReplacementCost(carService.getCarDailyReplacementRate(inputs, i))
                .locoOpsAndMaintenanceCost(cmService.getLocoOpsAndMaintenanceCost(inputs, i))
                .terminalYardOpsInspectionCost(tyService.getTerminalAndYardOpsCost(inputs, i))
                .communicationAndSignalCost(cmService.getCommunicationAndSignalCost(inputs, i))
                .bridgeAndTrackMaintenanceCost(gtmService.getBridgeAndTrackMaintenanceCost(inputs, i))
                .jointFacilityHaulageLeaseCost(jfhlService.getJointFacilityHaulageLeaseCost(inputs, i))
                .specializedFacilitiesServicesCost(sfService.getSpecializedFacilitiesServicesCost(inputs, i))
                .build();
    }
}
