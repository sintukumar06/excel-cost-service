package com.nscorp.cost.calculator.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

    @java.beans.ConstructorProperties({"carHiredOrDailyCost", "carDailyReplacementCost", "bridgeAndTrackMaintenanceCost", "communicationAndSignalCost", "fuelingLocomotivesCost", "gaAdminCost", "gaCustomerServiceCost", "gaEngineeringCost", "gaMarketingCost", "gaMechanicalCost", "gaTransportationCost", "locoOpsAndMaintenanceCost", "sharedAssetAreaCost", "specializedFacilitiesServicesCost", "jointFacilityHaulageLeaseCost", "networkEconomicCost", "locomotiveEconomicCost", "carMaintenance", "gaTaxes", "terminalYardOpsInspectionCost", "trainStartCost"})
    public SummaryData(double carHiredOrDailyCost, double carDailyReplacementCost, double bridgeAndTrackMaintenanceCost, double communicationAndSignalCost, double fuelingLocomotivesCost, double gaAdminCost, double gaCustomerServiceCost, double gaEngineeringCost, double gaMarketingCost, double gaMechanicalCost, double gaTransportationCost, double locoOpsAndMaintenanceCost, double sharedAssetAreaCost, double specializedFacilitiesServicesCost, double jointFacilityHaulageLeaseCost, double networkEconomicCost, double locomotiveEconomicCost, double carMaintenance, double gaTaxes, double terminalYardOpsInspectionCost, double trainStartCost) {
        this.carHiredOrDailyCost = carHiredOrDailyCost;
        this.carDailyReplacementCost = carDailyReplacementCost;
        this.bridgeAndTrackMaintenanceCost = bridgeAndTrackMaintenanceCost;
        this.communicationAndSignalCost = communicationAndSignalCost;
        this.fuelingLocomotivesCost = fuelingLocomotivesCost;
        this.gaAdminCost = gaAdminCost;
        this.gaCustomerServiceCost = gaCustomerServiceCost;
        this.gaEngineeringCost = gaEngineeringCost;
        this.gaMarketingCost = gaMarketingCost;
        this.gaMechanicalCost = gaMechanicalCost;
        this.gaTransportationCost = gaTransportationCost;
        this.locoOpsAndMaintenanceCost = locoOpsAndMaintenanceCost;
        this.sharedAssetAreaCost = sharedAssetAreaCost;
        this.specializedFacilitiesServicesCost = specializedFacilitiesServicesCost;
        this.jointFacilityHaulageLeaseCost = jointFacilityHaulageLeaseCost;
        this.networkEconomicCost = networkEconomicCost;
        this.locomotiveEconomicCost = locomotiveEconomicCost;
        this.carMaintenance = carMaintenance;
        this.gaTaxes = gaTaxes;
        this.terminalYardOpsInspectionCost = terminalYardOpsInspectionCost;
        this.trainStartCost = trainStartCost;
    }

    public SummaryData() {
    }

    public static SummaryDataBuilder builder() {
        return new SummaryDataBuilder();
    }

    @JsonIgnore
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

    @JsonIgnore
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

    @JsonIgnore
    public double getVrcTotal() {
        return getVecTotal() + getCarDailyReplacementCost() - getCarHiredOrDailyCost();
    }

    public double getCarHiredOrDailyCost() {
        return this.carHiredOrDailyCost;
    }

    public void setCarHiredOrDailyCost(double carHiredOrDailyCost) {
        this.carHiredOrDailyCost = carHiredOrDailyCost;
    }

    public double getCarDailyReplacementCost() {
        return this.carDailyReplacementCost;
    }

    public void setCarDailyReplacementCost(double carDailyReplacementCost) {
        this.carDailyReplacementCost = carDailyReplacementCost;
    }

    public double getBridgeAndTrackMaintenanceCost() {
        return this.bridgeAndTrackMaintenanceCost;
    }

    public void setBridgeAndTrackMaintenanceCost(double bridgeAndTrackMaintenanceCost) {
        this.bridgeAndTrackMaintenanceCost = bridgeAndTrackMaintenanceCost;
    }

    public double getCommunicationAndSignalCost() {
        return this.communicationAndSignalCost;
    }

    public void setCommunicationAndSignalCost(double communicationAndSignalCost) {
        this.communicationAndSignalCost = communicationAndSignalCost;
    }

    public double getFuelingLocomotivesCost() {
        return this.fuelingLocomotivesCost;
    }

    public void setFuelingLocomotivesCost(double fuelingLocomotivesCost) {
        this.fuelingLocomotivesCost = fuelingLocomotivesCost;
    }

    public double getGaAdminCost() {
        return this.gaAdminCost;
    }

    public void setGaAdminCost(double gaAdminCost) {
        this.gaAdminCost = gaAdminCost;
    }

    public double getGaCustomerServiceCost() {
        return this.gaCustomerServiceCost;
    }

    public void setGaCustomerServiceCost(double gaCustomerServiceCost) {
        this.gaCustomerServiceCost = gaCustomerServiceCost;
    }

    public double getGaEngineeringCost() {
        return this.gaEngineeringCost;
    }

    public void setGaEngineeringCost(double gaEngineeringCost) {
        this.gaEngineeringCost = gaEngineeringCost;
    }

    public double getGaMarketingCost() {
        return this.gaMarketingCost;
    }

    public void setGaMarketingCost(double gaMarketingCost) {
        this.gaMarketingCost = gaMarketingCost;
    }

    public double getGaMechanicalCost() {
        return this.gaMechanicalCost;
    }

    public void setGaMechanicalCost(double gaMechanicalCost) {
        this.gaMechanicalCost = gaMechanicalCost;
    }

    public double getGaTransportationCost() {
        return this.gaTransportationCost;
    }

    public void setGaTransportationCost(double gaTransportationCost) {
        this.gaTransportationCost = gaTransportationCost;
    }

    public double getLocoOpsAndMaintenanceCost() {
        return this.locoOpsAndMaintenanceCost;
    }

    public void setLocoOpsAndMaintenanceCost(double locoOpsAndMaintenanceCost) {
        this.locoOpsAndMaintenanceCost = locoOpsAndMaintenanceCost;
    }

    public double getSharedAssetAreaCost() {
        return this.sharedAssetAreaCost;
    }

    public void setSharedAssetAreaCost(double sharedAssetAreaCost) {
        this.sharedAssetAreaCost = sharedAssetAreaCost;
    }

    public double getSpecializedFacilitiesServicesCost() {
        return this.specializedFacilitiesServicesCost;
    }

    public void setSpecializedFacilitiesServicesCost(double specializedFacilitiesServicesCost) {
        this.specializedFacilitiesServicesCost = specializedFacilitiesServicesCost;
    }

    public double getJointFacilityHaulageLeaseCost() {
        return this.jointFacilityHaulageLeaseCost;
    }

    public void setJointFacilityHaulageLeaseCost(double jointFacilityHaulageLeaseCost) {
        this.jointFacilityHaulageLeaseCost = jointFacilityHaulageLeaseCost;
    }

    public double getNetworkEconomicCost() {
        return this.networkEconomicCost;
    }

    public void setNetworkEconomicCost(double networkEconomicCost) {
        this.networkEconomicCost = networkEconomicCost;
    }

    public double getLocomotiveEconomicCost() {
        return this.locomotiveEconomicCost;
    }

    public void setLocomotiveEconomicCost(double locomotiveEconomicCost) {
        this.locomotiveEconomicCost = locomotiveEconomicCost;
    }

    public double getCarMaintenance() {
        return this.carMaintenance;
    }

    public void setCarMaintenance(double carMaintenance) {
        this.carMaintenance = carMaintenance;
    }

    public double getGaTaxes() {
        return this.gaTaxes;
    }

    public void setGaTaxes(double gaTaxes) {
        this.gaTaxes = gaTaxes;
    }

    public double getTerminalYardOpsInspectionCost() {
        return this.terminalYardOpsInspectionCost;
    }

    public void setTerminalYardOpsInspectionCost(double terminalYardOpsInspectionCost) {
        this.terminalYardOpsInspectionCost = terminalYardOpsInspectionCost;
    }

    public double getTrainStartCost() {
        return this.trainStartCost;
    }

    public void setTrainStartCost(double trainStartCost) {
        this.trainStartCost = trainStartCost;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SummaryData)) return false;
        final SummaryData other = (SummaryData) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getCarHiredOrDailyCost(), other.getCarHiredOrDailyCost()) != 0) return false;
        if (Double.compare(this.getCarDailyReplacementCost(), other.getCarDailyReplacementCost()) != 0) return false;
        if (Double.compare(this.getBridgeAndTrackMaintenanceCost(), other.getBridgeAndTrackMaintenanceCost()) != 0)
            return false;
        if (Double.compare(this.getCommunicationAndSignalCost(), other.getCommunicationAndSignalCost()) != 0)
            return false;
        if (Double.compare(this.getFuelingLocomotivesCost(), other.getFuelingLocomotivesCost()) != 0) return false;
        if (Double.compare(this.getGaAdminCost(), other.getGaAdminCost()) != 0) return false;
        if (Double.compare(this.getGaCustomerServiceCost(), other.getGaCustomerServiceCost()) != 0) return false;
        if (Double.compare(this.getGaEngineeringCost(), other.getGaEngineeringCost()) != 0) return false;
        if (Double.compare(this.getGaMarketingCost(), other.getGaMarketingCost()) != 0) return false;
        if (Double.compare(this.getGaMechanicalCost(), other.getGaMechanicalCost()) != 0) return false;
        if (Double.compare(this.getGaTransportationCost(), other.getGaTransportationCost()) != 0) return false;
        if (Double.compare(this.getLocoOpsAndMaintenanceCost(), other.getLocoOpsAndMaintenanceCost()) != 0)
            return false;
        if (Double.compare(this.getSharedAssetAreaCost(), other.getSharedAssetAreaCost()) != 0) return false;
        if (Double.compare(this.getSpecializedFacilitiesServicesCost(), other.getSpecializedFacilitiesServicesCost()) != 0)
            return false;
        if (Double.compare(this.getJointFacilityHaulageLeaseCost(), other.getJointFacilityHaulageLeaseCost()) != 0)
            return false;
        if (Double.compare(this.getNetworkEconomicCost(), other.getNetworkEconomicCost()) != 0) return false;
        if (Double.compare(this.getLocomotiveEconomicCost(), other.getLocomotiveEconomicCost()) != 0) return false;
        if (Double.compare(this.getCarMaintenance(), other.getCarMaintenance()) != 0) return false;
        if (Double.compare(this.getGaTaxes(), other.getGaTaxes()) != 0) return false;
        if (Double.compare(this.getTerminalYardOpsInspectionCost(), other.getTerminalYardOpsInspectionCost()) != 0)
            return false;
        if (Double.compare(this.getTrainStartCost(), other.getTrainStartCost()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SummaryData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $carHiredOrDailyCost = Double.doubleToLongBits(this.getCarHiredOrDailyCost());
        result = result * PRIME + (int) ($carHiredOrDailyCost >>> 32 ^ $carHiredOrDailyCost);
        final long $carDailyReplacementCost = Double.doubleToLongBits(this.getCarDailyReplacementCost());
        result = result * PRIME + (int) ($carDailyReplacementCost >>> 32 ^ $carDailyReplacementCost);
        final long $bridgeAndTrackMaintenanceCost = Double.doubleToLongBits(this.getBridgeAndTrackMaintenanceCost());
        result = result * PRIME + (int) ($bridgeAndTrackMaintenanceCost >>> 32 ^ $bridgeAndTrackMaintenanceCost);
        final long $communicationAndSignalCost = Double.doubleToLongBits(this.getCommunicationAndSignalCost());
        result = result * PRIME + (int) ($communicationAndSignalCost >>> 32 ^ $communicationAndSignalCost);
        final long $fuelingLocomotivesCost = Double.doubleToLongBits(this.getFuelingLocomotivesCost());
        result = result * PRIME + (int) ($fuelingLocomotivesCost >>> 32 ^ $fuelingLocomotivesCost);
        final long $gaAdminCost = Double.doubleToLongBits(this.getGaAdminCost());
        result = result * PRIME + (int) ($gaAdminCost >>> 32 ^ $gaAdminCost);
        final long $gaCustomerServiceCost = Double.doubleToLongBits(this.getGaCustomerServiceCost());
        result = result * PRIME + (int) ($gaCustomerServiceCost >>> 32 ^ $gaCustomerServiceCost);
        final long $gaEngineeringCost = Double.doubleToLongBits(this.getGaEngineeringCost());
        result = result * PRIME + (int) ($gaEngineeringCost >>> 32 ^ $gaEngineeringCost);
        final long $gaMarketingCost = Double.doubleToLongBits(this.getGaMarketingCost());
        result = result * PRIME + (int) ($gaMarketingCost >>> 32 ^ $gaMarketingCost);
        final long $gaMechanicalCost = Double.doubleToLongBits(this.getGaMechanicalCost());
        result = result * PRIME + (int) ($gaMechanicalCost >>> 32 ^ $gaMechanicalCost);
        final long $gaTransportationCost = Double.doubleToLongBits(this.getGaTransportationCost());
        result = result * PRIME + (int) ($gaTransportationCost >>> 32 ^ $gaTransportationCost);
        final long $locoOpsAndMaintenanceCost = Double.doubleToLongBits(this.getLocoOpsAndMaintenanceCost());
        result = result * PRIME + (int) ($locoOpsAndMaintenanceCost >>> 32 ^ $locoOpsAndMaintenanceCost);
        final long $sharedAssetAreaCost = Double.doubleToLongBits(this.getSharedAssetAreaCost());
        result = result * PRIME + (int) ($sharedAssetAreaCost >>> 32 ^ $sharedAssetAreaCost);
        final long $specializedFacilitiesServicesCost = Double.doubleToLongBits(this.getSpecializedFacilitiesServicesCost());
        result = result * PRIME + (int) ($specializedFacilitiesServicesCost >>> 32 ^ $specializedFacilitiesServicesCost);
        final long $jointFacilityHaulageLeaseCost = Double.doubleToLongBits(this.getJointFacilityHaulageLeaseCost());
        result = result * PRIME + (int) ($jointFacilityHaulageLeaseCost >>> 32 ^ $jointFacilityHaulageLeaseCost);
        final long $networkEconomicCost = Double.doubleToLongBits(this.getNetworkEconomicCost());
        result = result * PRIME + (int) ($networkEconomicCost >>> 32 ^ $networkEconomicCost);
        final long $locomotiveEconomicCost = Double.doubleToLongBits(this.getLocomotiveEconomicCost());
        result = result * PRIME + (int) ($locomotiveEconomicCost >>> 32 ^ $locomotiveEconomicCost);
        final long $carMaintenance = Double.doubleToLongBits(this.getCarMaintenance());
        result = result * PRIME + (int) ($carMaintenance >>> 32 ^ $carMaintenance);
        final long $gaTaxes = Double.doubleToLongBits(this.getGaTaxes());
        result = result * PRIME + (int) ($gaTaxes >>> 32 ^ $gaTaxes);
        final long $terminalYardOpsInspectionCost = Double.doubleToLongBits(this.getTerminalYardOpsInspectionCost());
        result = result * PRIME + (int) ($terminalYardOpsInspectionCost >>> 32 ^ $terminalYardOpsInspectionCost);
        final long $trainStartCost = Double.doubleToLongBits(this.getTrainStartCost());
        result = result * PRIME + (int) ($trainStartCost >>> 32 ^ $trainStartCost);
        return result;
    }

    public String toString() {
        return "SummaryData(carHiredOrDailyCost=" + this.getCarHiredOrDailyCost() + ", carDailyReplacementCost=" + this.getCarDailyReplacementCost() + ", bridgeAndTrackMaintenanceCost=" + this.getBridgeAndTrackMaintenanceCost() + ", communicationAndSignalCost=" + this.getCommunicationAndSignalCost() + ", fuelingLocomotivesCost=" + this.getFuelingLocomotivesCost() + ", gaAdminCost=" + this.getGaAdminCost() + ", gaCustomerServiceCost=" + this.getGaCustomerServiceCost() + ", gaEngineeringCost=" + this.getGaEngineeringCost() + ", gaMarketingCost=" + this.getGaMarketingCost() + ", gaMechanicalCost=" + this.getGaMechanicalCost() + ", gaTransportationCost=" + this.getGaTransportationCost() + ", locoOpsAndMaintenanceCost=" + this.getLocoOpsAndMaintenanceCost() + ", sharedAssetAreaCost=" + this.getSharedAssetAreaCost() + ", specializedFacilitiesServicesCost=" + this.getSpecializedFacilitiesServicesCost() + ", jointFacilityHaulageLeaseCost=" + this.getJointFacilityHaulageLeaseCost() + ", networkEconomicCost=" + this.getNetworkEconomicCost() + ", locomotiveEconomicCost=" + this.getLocomotiveEconomicCost() + ", carMaintenance=" + this.getCarMaintenance() + ", gaTaxes=" + this.getGaTaxes() + ", terminalYardOpsInspectionCost=" + this.getTerminalYardOpsInspectionCost() + ", trainStartCost=" + this.getTrainStartCost() + ")";
    }

    public static class SummaryDataBuilder {
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

        SummaryDataBuilder() {
        }

        public SummaryData.SummaryDataBuilder carHiredOrDailyCost(double carHiredOrDailyCost) {
            this.carHiredOrDailyCost = carHiredOrDailyCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder carDailyReplacementCost(double carDailyReplacementCost) {
            this.carDailyReplacementCost = carDailyReplacementCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder bridgeAndTrackMaintenanceCost(double bridgeAndTrackMaintenanceCost) {
            this.bridgeAndTrackMaintenanceCost = bridgeAndTrackMaintenanceCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder communicationAndSignalCost(double communicationAndSignalCost) {
            this.communicationAndSignalCost = communicationAndSignalCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder fuelingLocomotivesCost(double fuelingLocomotivesCost) {
            this.fuelingLocomotivesCost = fuelingLocomotivesCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder gaAdminCost(double gaAdminCost) {
            this.gaAdminCost = gaAdminCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder gaCustomerServiceCost(double gaCustomerServiceCost) {
            this.gaCustomerServiceCost = gaCustomerServiceCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder gaEngineeringCost(double gaEngineeringCost) {
            this.gaEngineeringCost = gaEngineeringCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder gaMarketingCost(double gaMarketingCost) {
            this.gaMarketingCost = gaMarketingCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder gaMechanicalCost(double gaMechanicalCost) {
            this.gaMechanicalCost = gaMechanicalCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder gaTransportationCost(double gaTransportationCost) {
            this.gaTransportationCost = gaTransportationCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder locoOpsAndMaintenanceCost(double locoOpsAndMaintenanceCost) {
            this.locoOpsAndMaintenanceCost = locoOpsAndMaintenanceCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder sharedAssetAreaCost(double sharedAssetAreaCost) {
            this.sharedAssetAreaCost = sharedAssetAreaCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder specializedFacilitiesServicesCost(double specializedFacilitiesServicesCost) {
            this.specializedFacilitiesServicesCost = specializedFacilitiesServicesCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder jointFacilityHaulageLeaseCost(double jointFacilityHaulageLeaseCost) {
            this.jointFacilityHaulageLeaseCost = jointFacilityHaulageLeaseCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder networkEconomicCost(double networkEconomicCost) {
            this.networkEconomicCost = networkEconomicCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder locomotiveEconomicCost(double locomotiveEconomicCost) {
            this.locomotiveEconomicCost = locomotiveEconomicCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder carMaintenance(double carMaintenance) {
            this.carMaintenance = carMaintenance;
            return this;
        }

        public SummaryData.SummaryDataBuilder gaTaxes(double gaTaxes) {
            this.gaTaxes = gaTaxes;
            return this;
        }

        public SummaryData.SummaryDataBuilder terminalYardOpsInspectionCost(double terminalYardOpsInspectionCost) {
            this.terminalYardOpsInspectionCost = terminalYardOpsInspectionCost;
            return this;
        }

        public SummaryData.SummaryDataBuilder trainStartCost(double trainStartCost) {
            this.trainStartCost = trainStartCost;
            return this;
        }

        public SummaryData build() {
            return new SummaryData(carHiredOrDailyCost, carDailyReplacementCost, bridgeAndTrackMaintenanceCost, communicationAndSignalCost, fuelingLocomotivesCost, gaAdminCost, gaCustomerServiceCost, gaEngineeringCost, gaMarketingCost, gaMechanicalCost, gaTransportationCost, locoOpsAndMaintenanceCost, sharedAssetAreaCost, specializedFacilitiesServicesCost, jointFacilityHaulageLeaseCost, networkEconomicCost, locomotiveEconomicCost, carMaintenance, gaTaxes, terminalYardOpsInspectionCost, trainStartCost);
        }

        public String toString() {
            return "SummaryData.SummaryDataBuilder(carHiredOrDailyCost=" + this.carHiredOrDailyCost + ", carDailyReplacementCost=" + this.carDailyReplacementCost + ", bridgeAndTrackMaintenanceCost=" + this.bridgeAndTrackMaintenanceCost + ", communicationAndSignalCost=" + this.communicationAndSignalCost + ", fuelingLocomotivesCost=" + this.fuelingLocomotivesCost + ", gaAdminCost=" + this.gaAdminCost + ", gaCustomerServiceCost=" + this.gaCustomerServiceCost + ", gaEngineeringCost=" + this.gaEngineeringCost + ", gaMarketingCost=" + this.gaMarketingCost + ", gaMechanicalCost=" + this.gaMechanicalCost + ", gaTransportationCost=" + this.gaTransportationCost + ", locoOpsAndMaintenanceCost=" + this.locoOpsAndMaintenanceCost + ", sharedAssetAreaCost=" + this.sharedAssetAreaCost + ", specializedFacilitiesServicesCost=" + this.specializedFacilitiesServicesCost + ", jointFacilityHaulageLeaseCost=" + this.jointFacilityHaulageLeaseCost + ", networkEconomicCost=" + this.networkEconomicCost + ", locomotiveEconomicCost=" + this.locomotiveEconomicCost + ", carMaintenance=" + this.carMaintenance + ", gaTaxes=" + this.gaTaxes + ", terminalYardOpsInspectionCost=" + this.terminalYardOpsInspectionCost + ", trainStartCost=" + this.trainStartCost + ")";
        }
    }
}
