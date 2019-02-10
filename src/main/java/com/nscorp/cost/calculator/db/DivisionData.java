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
    @Column(name = "GTM_NETWORK_ECONOMIC")
    private double networkEconomic;
    @Column(name = "CREW_WAGES_TOTAL")
    private double crewWagesTotal;
    @Column(name = "GA_TRANSPORTATION")
    private double gaTransportation;

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
}
