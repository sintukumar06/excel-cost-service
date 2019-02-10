package com.nscorp.cost.calculator.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SummaryData {
    private double carHiredOrDailyCost;
    private double carDailyReplacementCost;
    private double bridgeAndTrackMaintenanceCost;
    private double communicationAndSignalCost;
    private double fuelingLocomotivesCost;
    private double gaAdminCost;
    private double gaCustomerServiceCost;
    private double gaEngineeringCost;
    private double gaMarketingCost;
    private double gaMechanicalCost;
    private double gaTransportationCost;
    private double locoOpsAndMaintenanceCost;
    private double sharedAssetAreaCost;
    private double specializedFacilitiesServicesCost;
    private double jointFacilityHaulageLeaseCost;
    private double networkEconomicCost;
    private double locomotiveEconomicCost;
    private double carMaintenance;
    private double gaTaxes;
    private double terminalYardOpsInspectionCost;
    private double trainStartCost;
}
