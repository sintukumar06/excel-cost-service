package com.nscorp.cost.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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

    public double getPusherCost() {
        return getBridgeAndTrackMaintenanceCost()
                + getCommunicationAndSignalCost()
                + getFuelingLocomotivesCost()
                + getGaEngineeringCost()
                + getGaMechanicalCost()
                + getGaTransportationCost()
                + getLocoOpsAndMaintenanceCost()
                + getNetworkEconomicCost()
                + getLocomotiveEconomicCost();
    }

    public double getVecTotal() {
        return getCarHiredOrDailyCost()
                + getBridgeAndTrackMaintenanceCost()
                + getCommunicationAndSignalCost()
                + getFuelingLocomotivesCost()
                + getGaAdminCost()
                + getGaCustomerServiceCost()
                + getGaEngineeringCost()
                + getGaMarketingCost()
                + getGaMechanicalCost()
                + getGaTransportationCost()
                + getLocoOpsAndMaintenanceCost()
                + getSharedAssetAreaCost()
                + getSpecializedFacilitiesServicesCost()
                + getJointFacilityHaulageLeaseCost()
                + getNetworkEconomicCost()
                + getLocomotiveEconomicCost()
                + getCarMaintenance()
                + getGaTaxes()
                + getTerminalYardOpsInspectionCost()
                + getTrainStartCost();
    }

    public double getVrcTotal() {
        return getVecTotal() + getCarDailyReplacementCost() - getCarHiredOrDailyCost();
    }
}
