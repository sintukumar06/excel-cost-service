package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

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
    @Column(name = "GA_TRANSPORTATION_BY_CW")
    private double gaTransportByCW;
    @Column(name = "BTM_BY_GTM")
    private double bridgeAndTrackMaintenanceByGTM;
    @Column(name = "FL_BY_GTM")
    private double fuelingLocomotiveByGTM;
    @Column(name = "GA_ENGINEERING_BY_GTM")
    private double gaEngineeringByGTM;
    @Column(name = "GA_MECHANICAL_BY_GTM")
    private double gaMechanicalByGTM;
    @Column(name = "NETWORK_ECONOMIC_BY_GTM")
    private double networkEconomicByGTM;
    @Column(name = "CS_BY_CM")
    private double communicationAndSignalByCM;
    @Column(name = "LOCO_OM_BY_CM")
    private double locoOpsMaintenanceByCM;
    @Column(name = "LOCO_OM_BY_GTM")
    private double locoOpsMaintenanceByGTM;
    @Column(name = "SAA_BY_CM")
    private double sharedAssetAreaCostByCM;
    @Column(name = "SAA_BY_ORIGINATION")
    private double sharedAssetAreaCostByOrigination;
    @Column(name = "JFHL_BY_CM")
    private double JFHLCostByCM;
    @Column(name = "JFHL_BY_GTM")
    private double JFHLCostByGTM;

    public DivisionData() {
    }

    public String getDivision() {
        return this.division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public double getGrossTonMiles() {
        return this.grossTonMiles;
    }

    public void setGrossTonMiles(double grossTonMiles) {
        this.grossTonMiles = grossTonMiles;
    }

    public double getCarMiles() {
        return this.carMiles;
    }

    public void setCarMiles(double carMiles) {
        this.carMiles = carMiles;
    }

    public double getBridgeAndTrackMaintenance() {
        return this.bridgeAndTrackMaintenance;
    }

    public void setBridgeAndTrackMaintenance(double bridgeAndTrackMaintenance) {
        this.bridgeAndTrackMaintenance = bridgeAndTrackMaintenance;
    }

    public double getFuelingLocomotives() {
        return this.fuelingLocomotives;
    }

    public void setFuelingLocomotives(double fuelingLocomotives) {
        this.fuelingLocomotives = fuelingLocomotives;
    }

    public double getGaEngineering() {
        return this.gaEngineering;
    }

    public void setGaEngineering(double gaEngineering) {
        this.gaEngineering = gaEngineering;
    }

    public double getGaMechanical() {
        return this.gaMechanical;
    }

    public void setGaMechanical(double gaMechanical) {
        this.gaMechanical = gaMechanical;
    }

    public double getLocoOperationMaint() {
        return this.locoOperationMaint;
    }

    public void setLocoOperationMaint(double locoOperationMaint) {
        this.locoOperationMaint = locoOperationMaint;
    }

    public double getJfhlLines() {
        return this.jfhlLines;
    }

    public void setJfhlLines(double jfhlLines) {
        this.jfhlLines = jfhlLines;
    }

    public double getCmCommunicationAndSignalCost() {
        return this.cmCommunicationAndSignalCost;
    }

    public void setCmCommunicationAndSignalCost(double cmCommunicationAndSignalCost) {
        this.cmCommunicationAndSignalCost = cmCommunicationAndSignalCost;
    }

    public double getCmLocoOperationMaint() {
        return this.cmLocoOperationMaint;
    }

    public void setCmLocoOperationMaint(double cmLocoOperationMaint) {
        this.cmLocoOperationMaint = cmLocoOperationMaint;
    }

    public double getCmJFHLLines() {
        return this.cmJFHLLines;
    }

    public void setCmJFHLLines(double cmJFHLLines) {
        this.cmJFHLLines = cmJFHLLines;
    }

    public double getCmSharedAssetAreaOnLink() {
        return this.cmSharedAssetAreaOnLink;
    }

    public void setCmSharedAssetAreaOnLink(double cmSharedAssetAreaOnLink) {
        this.cmSharedAssetAreaOnLink = cmSharedAssetAreaOnLink;
    }

    public double getNetworkEconomic() {
        return this.networkEconomic;
    }

    public void setNetworkEconomic(double networkEconomic) {
        this.networkEconomic = networkEconomic;
    }

    public double getCrewWagesTotal() {
        return this.crewWagesTotal;
    }

    public void setCrewWagesTotal(double crewWagesTotal) {
        this.crewWagesTotal = crewWagesTotal;
    }

    public double getGaTransportation() {
        return this.gaTransportation;
    }

    public void setGaTransportation(double gaTransportation) {
        this.gaTransportation = gaTransportation;
    }

    public double getSharedAssetAreaCostOnNodes() {
        return this.sharedAssetAreaCostOnNodes;
    }

    public void setSharedAssetAreaCostOnNodes(double sharedAssetAreaCostOnNodes) {
        this.sharedAssetAreaCostOnNodes = sharedAssetAreaCostOnNodes;
    }

    public double getTotalCarloadOrigs() {
        return this.totalCarloadOrigs;
    }

    public void setTotalCarloadOrigs(double totalCarloadOrigs) {
        this.totalCarloadOrigs = totalCarloadOrigs;
    }

    public double getGaTransportByCW() {
        return this.gaTransportByCW;
    }

    public void setGaTransportByCW(double gaTransportByCW) {
        this.gaTransportByCW = gaTransportByCW;
    }

    public double getBridgeAndTrackMaintenanceByGTM() {
        return this.bridgeAndTrackMaintenanceByGTM;
    }

    public void setBridgeAndTrackMaintenanceByGTM(double bridgeAndTrackMaintenanceByGTM) {
        this.bridgeAndTrackMaintenanceByGTM = bridgeAndTrackMaintenanceByGTM;
    }

    public double getFuelingLocomotiveByGTM() {
        return this.fuelingLocomotiveByGTM;
    }

    public void setFuelingLocomotiveByGTM(double fuelingLocomotiveByGTM) {
        this.fuelingLocomotiveByGTM = fuelingLocomotiveByGTM;
    }

    public double getGaEngineeringByGTM() {
        return this.gaEngineeringByGTM;
    }

    public void setGaEngineeringByGTM(double gaEngineeringByGTM) {
        this.gaEngineeringByGTM = gaEngineeringByGTM;
    }

    public double getGaMechanicalByGTM() {
        return this.gaMechanicalByGTM;
    }

    public void setGaMechanicalByGTM(double gaMechanicalByGTM) {
        this.gaMechanicalByGTM = gaMechanicalByGTM;
    }

    public double getNetworkEconomicByGTM() {
        return this.networkEconomicByGTM;
    }

    public void setNetworkEconomicByGTM(double networkEconomicByGTM) {
        this.networkEconomicByGTM = networkEconomicByGTM;
    }

    public double getCommunicationAndSignalByCM() {
        return this.communicationAndSignalByCM;
    }

    public void setCommunicationAndSignalByCM(double communicationAndSignalByCM) {
        this.communicationAndSignalByCM = communicationAndSignalByCM;
    }

    public double getLocoOpsMaintenanceByCM() {
        return this.locoOpsMaintenanceByCM;
    }

    public void setLocoOpsMaintenanceByCM(double locoOpsMaintenanceByCM) {
        this.locoOpsMaintenanceByCM = locoOpsMaintenanceByCM;
    }

    public double getLocoOpsMaintenanceByGTM() {
        return this.locoOpsMaintenanceByGTM;
    }

    public void setLocoOpsMaintenanceByGTM(double locoOpsMaintenanceByGTM) {
        this.locoOpsMaintenanceByGTM = locoOpsMaintenanceByGTM;
    }

    public double getSharedAssetAreaCostByCM() {
        return this.sharedAssetAreaCostByCM;
    }

    public void setSharedAssetAreaCostByCM(double sharedAssetAreaCostByCM) {
        this.sharedAssetAreaCostByCM = sharedAssetAreaCostByCM;
    }

    public double getSharedAssetAreaCostByOrigination() {
        return this.sharedAssetAreaCostByOrigination;
    }

    public void setSharedAssetAreaCostByOrigination(double sharedAssetAreaCostByOrigination) {
        this.sharedAssetAreaCostByOrigination = sharedAssetAreaCostByOrigination;
    }

    public double getJFHLCostByCM() {
        return this.JFHLCostByCM;
    }

    public void setJFHLCostByCM(double JFHLCostByCM) {
        this.JFHLCostByCM = JFHLCostByCM;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DivisionData)) return false;
        final DivisionData other = (DivisionData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$division = this.getDivision();
        final Object other$division = other.getDivision();
        if (!Objects.equals(this$division, other$division)) return false;
        if (Double.compare(this.getGrossTonMiles(), other.getGrossTonMiles()) != 0) return false;
        if (Double.compare(this.getCarMiles(), other.getCarMiles()) != 0) return false;
        if (Double.compare(this.getBridgeAndTrackMaintenance(), other.getBridgeAndTrackMaintenance()) != 0)
            return false;
        if (Double.compare(this.getFuelingLocomotives(), other.getFuelingLocomotives()) != 0) return false;
        if (Double.compare(this.getGaEngineering(), other.getGaEngineering()) != 0) return false;
        if (Double.compare(this.getGaMechanical(), other.getGaMechanical()) != 0) return false;
        if (Double.compare(this.getLocoOperationMaint(), other.getLocoOperationMaint()) != 0) return false;
        if (Double.compare(this.getJfhlLines(), other.getJfhlLines()) != 0) return false;
        if (Double.compare(this.getCmCommunicationAndSignalCost(), other.getCmCommunicationAndSignalCost()) != 0)
            return false;
        if (Double.compare(this.getCmLocoOperationMaint(), other.getCmLocoOperationMaint()) != 0) return false;
        if (Double.compare(this.getCmJFHLLines(), other.getCmJFHLLines()) != 0) return false;
        if (Double.compare(this.getCmSharedAssetAreaOnLink(), other.getCmSharedAssetAreaOnLink()) != 0) return false;
        if (Double.compare(this.getNetworkEconomic(), other.getNetworkEconomic()) != 0) return false;
        if (Double.compare(this.getCrewWagesTotal(), other.getCrewWagesTotal()) != 0) return false;
        if (Double.compare(this.getGaTransportation(), other.getGaTransportation()) != 0) return false;
        if (Double.compare(this.getSharedAssetAreaCostOnNodes(), other.getSharedAssetAreaCostOnNodes()) != 0)
            return false;
        if (Double.compare(this.getTotalCarloadOrigs(), other.getTotalCarloadOrigs()) != 0) return false;
        if (Double.compare(this.getGaTransportByCW(), other.getGaTransportByCW()) != 0) return false;
        if (Double.compare(this.getBridgeAndTrackMaintenanceByGTM(), other.getBridgeAndTrackMaintenanceByGTM()) != 0)
            return false;
        if (Double.compare(this.getFuelingLocomotiveByGTM(), other.getFuelingLocomotiveByGTM()) != 0) return false;
        if (Double.compare(this.getGaEngineeringByGTM(), other.getGaEngineeringByGTM()) != 0) return false;
        if (Double.compare(this.getGaMechanicalByGTM(), other.getGaMechanicalByGTM()) != 0) return false;
        if (Double.compare(this.getNetworkEconomicByGTM(), other.getNetworkEconomicByGTM()) != 0) return false;
        if (Double.compare(this.getCommunicationAndSignalByCM(), other.getCommunicationAndSignalByCM()) != 0)
            return false;
        if (Double.compare(this.getLocoOpsMaintenanceByCM(), other.getLocoOpsMaintenanceByCM()) != 0) return false;
        if (Double.compare(this.getLocoOpsMaintenanceByGTM(), other.getLocoOpsMaintenanceByGTM()) != 0) return false;
        if (Double.compare(this.getSharedAssetAreaCostByCM(), other.getSharedAssetAreaCostByCM()) != 0) return false;
        if (Double.compare(this.getSharedAssetAreaCostByOrigination(), other.getSharedAssetAreaCostByOrigination()) != 0)
            return false;
        if (Double.compare(this.getJFHLCostByCM(), other.getJFHLCostByCM()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DivisionData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $division = this.getDivision();
        result = result * PRIME + ($division == null ? 43 : $division.hashCode());
        final long $grossTonMiles = Double.doubleToLongBits(this.getGrossTonMiles());
        result = result * PRIME + (int) ($grossTonMiles >>> 32 ^ $grossTonMiles);
        final long $carMiles = Double.doubleToLongBits(this.getCarMiles());
        result = result * PRIME + (int) ($carMiles >>> 32 ^ $carMiles);
        final long $bridgeAndTrackMaintenance = Double.doubleToLongBits(this.getBridgeAndTrackMaintenance());
        result = result * PRIME + (int) ($bridgeAndTrackMaintenance >>> 32 ^ $bridgeAndTrackMaintenance);
        final long $fuelingLocomotives = Double.doubleToLongBits(this.getFuelingLocomotives());
        result = result * PRIME + (int) ($fuelingLocomotives >>> 32 ^ $fuelingLocomotives);
        final long $gaEngineering = Double.doubleToLongBits(this.getGaEngineering());
        result = result * PRIME + (int) ($gaEngineering >>> 32 ^ $gaEngineering);
        final long $gaMechanical = Double.doubleToLongBits(this.getGaMechanical());
        result = result * PRIME + (int) ($gaMechanical >>> 32 ^ $gaMechanical);
        final long $locoOperationMaint = Double.doubleToLongBits(this.getLocoOperationMaint());
        result = result * PRIME + (int) ($locoOperationMaint >>> 32 ^ $locoOperationMaint);
        final long $jfhlLines = Double.doubleToLongBits(this.getJfhlLines());
        result = result * PRIME + (int) ($jfhlLines >>> 32 ^ $jfhlLines);
        final long $cmCommunicationAndSignalCost = Double.doubleToLongBits(this.getCmCommunicationAndSignalCost());
        result = result * PRIME + (int) ($cmCommunicationAndSignalCost >>> 32 ^ $cmCommunicationAndSignalCost);
        final long $cmLocoOperationMaint = Double.doubleToLongBits(this.getCmLocoOperationMaint());
        result = result * PRIME + (int) ($cmLocoOperationMaint >>> 32 ^ $cmLocoOperationMaint);
        final long $cmJFHLLines = Double.doubleToLongBits(this.getCmJFHLLines());
        result = result * PRIME + (int) ($cmJFHLLines >>> 32 ^ $cmJFHLLines);
        final long $cmSharedAssetAreaOnLink = Double.doubleToLongBits(this.getCmSharedAssetAreaOnLink());
        result = result * PRIME + (int) ($cmSharedAssetAreaOnLink >>> 32 ^ $cmSharedAssetAreaOnLink);
        final long $networkEconomic = Double.doubleToLongBits(this.getNetworkEconomic());
        result = result * PRIME + (int) ($networkEconomic >>> 32 ^ $networkEconomic);
        final long $crewWagesTotal = Double.doubleToLongBits(this.getCrewWagesTotal());
        result = result * PRIME + (int) ($crewWagesTotal >>> 32 ^ $crewWagesTotal);
        final long $gaTransportation = Double.doubleToLongBits(this.getGaTransportation());
        result = result * PRIME + (int) ($gaTransportation >>> 32 ^ $gaTransportation);
        final long $sharedAssetAreaCostOnNodes = Double.doubleToLongBits(this.getSharedAssetAreaCostOnNodes());
        result = result * PRIME + (int) ($sharedAssetAreaCostOnNodes >>> 32 ^ $sharedAssetAreaCostOnNodes);
        final long $totalCarloadOrigs = Double.doubleToLongBits(this.getTotalCarloadOrigs());
        result = result * PRIME + (int) ($totalCarloadOrigs >>> 32 ^ $totalCarloadOrigs);
        final long $gaTransportByCW = Double.doubleToLongBits(this.getGaTransportByCW());
        result = result * PRIME + (int) ($gaTransportByCW >>> 32 ^ $gaTransportByCW);
        final long $bridgeAndTrackMaintenanceByGTM = Double.doubleToLongBits(this.getBridgeAndTrackMaintenanceByGTM());
        result = result * PRIME + (int) ($bridgeAndTrackMaintenanceByGTM >>> 32 ^ $bridgeAndTrackMaintenanceByGTM);
        final long $fuelingLocomotiveByGTM = Double.doubleToLongBits(this.getFuelingLocomotiveByGTM());
        result = result * PRIME + (int) ($fuelingLocomotiveByGTM >>> 32 ^ $fuelingLocomotiveByGTM);
        final long $gaEngineeringByGTM = Double.doubleToLongBits(this.getGaEngineeringByGTM());
        result = result * PRIME + (int) ($gaEngineeringByGTM >>> 32 ^ $gaEngineeringByGTM);
        final long $gaMechanicalByGTM = Double.doubleToLongBits(this.getGaMechanicalByGTM());
        result = result * PRIME + (int) ($gaMechanicalByGTM >>> 32 ^ $gaMechanicalByGTM);
        final long $networkEconomicByGTM = Double.doubleToLongBits(this.getNetworkEconomicByGTM());
        result = result * PRIME + (int) ($networkEconomicByGTM >>> 32 ^ $networkEconomicByGTM);
        final long $communicationAndSignalByCM = Double.doubleToLongBits(this.getCommunicationAndSignalByCM());
        result = result * PRIME + (int) ($communicationAndSignalByCM >>> 32 ^ $communicationAndSignalByCM);
        final long $locoOpsMaintenanceByCM = Double.doubleToLongBits(this.getLocoOpsMaintenanceByCM());
        result = result * PRIME + (int) ($locoOpsMaintenanceByCM >>> 32 ^ $locoOpsMaintenanceByCM);
        final long $locoOpsMaintenanceByGTM = Double.doubleToLongBits(this.getLocoOpsMaintenanceByGTM());
        result = result * PRIME + (int) ($locoOpsMaintenanceByGTM >>> 32 ^ $locoOpsMaintenanceByGTM);
        final long $sharedAssetAreaCostByCM = Double.doubleToLongBits(this.getSharedAssetAreaCostByCM());
        result = result * PRIME + (int) ($sharedAssetAreaCostByCM >>> 32 ^ $sharedAssetAreaCostByCM);
        final long $sharedAssetAreaCostByOrigination = Double.doubleToLongBits(this.getSharedAssetAreaCostByOrigination());
        result = result * PRIME + (int) ($sharedAssetAreaCostByOrigination >>> 32 ^ $sharedAssetAreaCostByOrigination);
        final long $JFHLCostByCM = Double.doubleToLongBits(this.getJFHLCostByCM());
        result = result * PRIME + (int) ($JFHLCostByCM >>> 32 ^ $JFHLCostByCM);
        return result;
    }

    public String toString() {
        return "DivisionData(division=" + this.getDivision()
                + ", grossTonMiles=" + this.getGrossTonMiles()
                + ", carMiles=" + this.getCarMiles()
                + ", bridgeAndTrackMaintenance=" + this.getBridgeAndTrackMaintenance()
                + ", fuelingLocomotives=" + this.getFuelingLocomotives()
                + ", gaEngineering=" + this.getGaEngineering()
                + ", gaMechanical=" + this.getGaMechanical()
                + ", locoOperationMaint=" + this.getLocoOperationMaint()
                + ", jfhlLines=" + this.getJfhlLines()
                + ", cmCommunicationAndSignalCost=" + this.getCmCommunicationAndSignalCost()
                + ", cmLocoOperationMaint=" + this.getCmLocoOperationMaint()
                + ", cmJFHLLines=" + this.getCmJFHLLines()
                + ", cmSharedAssetAreaOnLink=" + this.getCmSharedAssetAreaOnLink()
                + ", networkEconomic=" + this.getNetworkEconomic()
                + ", crewWagesTotal=" + this.getCrewWagesTotal()
                + ", gaTransportation=" + this.getGaTransportation()
                + ", sharedAssetAreaCostOnNodes=" + this.getSharedAssetAreaCostOnNodes()
                + ", totalCarloadOrigs=" + this.getTotalCarloadOrigs()
                + ", gaTransportByCW=" + this.getGaTransportByCW()
                + ", bridgeAndTrackMaintenanceByGTM=" + this.getBridgeAndTrackMaintenanceByGTM()
                + ", fuelingLocomotiveByGTM=" + this.getFuelingLocomotiveByGTM()
                + ", gaEngineeringByGTM=" + this.getGaEngineeringByGTM()
                + ", gaMechanicalByGTM=" + this.getGaMechanicalByGTM()
                + ", networkEconomicByGTM=" + this.getNetworkEconomicByGTM()
                + ", communicationAndSignalByCM=" + this.getCommunicationAndSignalByCM()
                + ", locoOpsMaintenanceByCM=" + this.getLocoOpsMaintenanceByCM()
                + ", locoOpsMaintenanceByGTM=" + this.getLocoOpsMaintenanceByGTM()
                + ", sharedAssetAreaCostByCM=" + this.getSharedAssetAreaCostByCM()
                + ", sharedAssetAreaCostByOrigination=" + this.getSharedAssetAreaCostByOrigination()
                + ", JFHLCostByCM=" + this.getJFHLCostByCM() + ")";
    }
}
