package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DIVISION_DATA")
public class DivisionData {
    @Id
    @Column(name = "DIVISION")
    private String division;
    @Column(name = "GROSS_TON_MILES")
    private double grossTonMiles;
    @Column(name = "CAR_MILES")
    private double carMiles;
    @Column(name = "GTM_BT_MAINTENANCE")
    private double bridgeAndTrackMaintenance;
    @Column(name = "GTM_FUELING_LOCOMOTIVES")
    private double fuelingLocomotives;
    @Column(name = "GTM_GA_ENGINEERING")
    private double gaEngineering;
    @Column(name = "GTM_GA_MACHANICAL")
    private double gaMechanical;
    @Column(name = "GTM_LOCO_OPERATION_MAINT")
    private double locoOperationMaint;
    @Column(name = "GTM_JFHL_LINES")
    private double jfhlLines;
    @Column(name = "CM_COMMUNICATION_SIGNAL")
    private double cmCommunicationAndSignalCost;
    @Column(name = "CM_LOCO_OPS_MAINT")
    private double cmLocoOperationMaint;
    @Column(name = "CM_JFHL_LINES")
    private double cmJFHLLines;
    @Column(name = "CM_SHARED_ASSET_AREA")
    private double cmSharedAssetAreaOnLink;
    @Column(name = "GTM_NETWORK_ECONOMIC")
    private double networkEconomic;
    @Column(name = "CREW_WAGES_TOTAL")
    private double crewWagesTotal;
    @Column(name = "GA_TRANSPORTATION")
    private double gaTransportation;
    @Column(name = "ORIG_SHARED_ASSET_AREA")
    private double sharedAssetAreaCostOnNodes;
    @Column(name = "TOTAL_CARLOAD_ORIGINATION")
    private double totalCarloadOrigs;

    public double getBridgeAndTrackMaintenanceByGTM() {
        return getBridgeAndTrackMaintenance() / getGrossTonMiles();
    }

    public double getFuelingLocomotiveByGTM() {
        return getFuelingLocomotives() / getGrossTonMiles();
    }

    public double getGAEngineeringByGTM() {
        return getGaEngineering() / getGrossTonMiles();
    }

    public double getGAMechanicalByGTM() {
        return getGaMechanical() / getGrossTonMiles();
    }

    public double getGATransportbyCW() {
        return getGaTransportation() / getCrewWagesTotal();
    }

    public double getCommunicationAndSignalByCM() {
        return getCmCommunicationAndSignalCost() / getCarMiles();
    }

    public double getLocoOpsMaintenanceByCM() {
        return getCmLocoOperationMaint() / getCarMiles();
    }

    public double getSharedAssetAreaCostByCM() {
        return getCmSharedAssetAreaOnLink() / getCarMiles();
    }

    public double getJFHLCostByCM() {
        return getJfhlLines() / getCarMiles();
    }

    public double getSharedAssetAreaCostByOrigination() {
        return getSharedAssetAreaCostOnNodes() / getTotalCarloadOrigs();
    }
}
