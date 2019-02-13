package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TERMINAL_YARD_DATA")
public class TerminalYard {
    @Id
    @Column(name = "CITY_NAME")
    private String cityName;
    @Column(name = "TERMINAL_CONTROL_AREA")
    private String terminal;
    @Column(name = "OP_STATION")
    private String opStation;
    @Column(name = "CLASS_COSTS")
    private double classCost;
    @Column(name = "INTERCHANGE_COSTS")
    private double interchangeCost;
    @Column(name = "TERMINAL_COSTS")
    private double terminalCost;
    @Column(name = "SHARED_ASSET_CLASS_COSTS")
    private double saaClassCost;
    @Column(name = "SHARED_ASSET_INTERCHANGE_COSTS")
    private double saaInterchangeCost;
    @Column(name = "SHARED_ASSET_TERMINAL_COSTS")
    private double saaTerminalCost;
    @Column(name = "MECHANICAL_PER_CAR")
    private double mechanicalPerCar;
    @Column(name = "CARLOAD_ORIGS_ONNET")
    private double carloadOrigsOnnet;
    @Column(name = "SPEC_FACILITY_PER_CARLOAD_ORIG")
    private double specFacilityPerCarloadOrig;

    public TerminalYard() {
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getTerminal() {
        return this.terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getOpStation() {
        return this.opStation;
    }

    public void setOpStation(String opStation) {
        this.opStation = opStation;
    }

    public double getClassCost() {
        return this.classCost;
    }

    public void setClassCost(double classCost) {
        this.classCost = classCost;
    }

    public double getInterchangeCost() {
        return this.interchangeCost;
    }

    public void setInterchangeCost(double interchangeCost) {
        this.interchangeCost = interchangeCost;
    }

    public double getTerminalCost() {
        return this.terminalCost;
    }

    public void setTerminalCost(double terminalCost) {
        this.terminalCost = terminalCost;
    }

    public double getSaaClassCost() {
        return this.saaClassCost;
    }

    public void setSaaClassCost(double saaClassCost) {
        this.saaClassCost = saaClassCost;
    }

    public double getSaaInterchangeCost() {
        return this.saaInterchangeCost;
    }

    public void setSaaInterchangeCost(double saaInterchangeCost) {
        this.saaInterchangeCost = saaInterchangeCost;
    }

    public double getSaaTerminalCost() {
        return this.saaTerminalCost;
    }

    public void setSaaTerminalCost(double saaTerminalCost) {
        this.saaTerminalCost = saaTerminalCost;
    }

    public double getMechanicalPerCar() {
        return this.mechanicalPerCar;
    }

    public void setMechanicalPerCar(double mechanicalPerCar) {
        this.mechanicalPerCar = mechanicalPerCar;
    }

    public double getCarloadOrigsOnnet() {
        return this.carloadOrigsOnnet;
    }

    public void setCarloadOrigsOnnet(double carloadOrigsOnnet) {
        this.carloadOrigsOnnet = carloadOrigsOnnet;
    }

    public double getSpecFacilityPerCarloadOrig() {
        return this.specFacilityPerCarloadOrig;
    }

    public void setSpecFacilityPerCarloadOrig(double specFacilityPerCarloadOrig) {
        this.specFacilityPerCarloadOrig = specFacilityPerCarloadOrig;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TerminalYard)) return false;
        final TerminalYard other = (TerminalYard) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cityName = this.getCityName();
        final Object other$cityName = other.getCityName();
        if (this$cityName == null ? other$cityName != null : !this$cityName.equals(other$cityName)) return false;
        final Object this$terminal = this.getTerminal();
        final Object other$terminal = other.getTerminal();
        if (this$terminal == null ? other$terminal != null : !this$terminal.equals(other$terminal)) return false;
        final Object this$opStation = this.getOpStation();
        final Object other$opStation = other.getOpStation();
        if (this$opStation == null ? other$opStation != null : !this$opStation.equals(other$opStation)) return false;
        if (Double.compare(this.getClassCost(), other.getClassCost()) != 0) return false;
        if (Double.compare(this.getInterchangeCost(), other.getInterchangeCost()) != 0) return false;
        if (Double.compare(this.getTerminalCost(), other.getTerminalCost()) != 0) return false;
        if (Double.compare(this.getSaaClassCost(), other.getSaaClassCost()) != 0) return false;
        if (Double.compare(this.getSaaInterchangeCost(), other.getSaaInterchangeCost()) != 0) return false;
        if (Double.compare(this.getSaaTerminalCost(), other.getSaaTerminalCost()) != 0) return false;
        if (Double.compare(this.getMechanicalPerCar(), other.getMechanicalPerCar()) != 0) return false;
        if (Double.compare(this.getCarloadOrigsOnnet(), other.getCarloadOrigsOnnet()) != 0) return false;
        if (Double.compare(this.getSpecFacilityPerCarloadOrig(), other.getSpecFacilityPerCarloadOrig()) != 0)
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TerminalYard;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cityName = this.getCityName();
        result = result * PRIME + ($cityName == null ? 43 : $cityName.hashCode());
        final Object $terminal = this.getTerminal();
        result = result * PRIME + ($terminal == null ? 43 : $terminal.hashCode());
        final Object $opStation = this.getOpStation();
        result = result * PRIME + ($opStation == null ? 43 : $opStation.hashCode());
        final long $classCost = Double.doubleToLongBits(this.getClassCost());
        result = result * PRIME + (int) ($classCost >>> 32 ^ $classCost);
        final long $interchangeCost = Double.doubleToLongBits(this.getInterchangeCost());
        result = result * PRIME + (int) ($interchangeCost >>> 32 ^ $interchangeCost);
        final long $terminalCost = Double.doubleToLongBits(this.getTerminalCost());
        result = result * PRIME + (int) ($terminalCost >>> 32 ^ $terminalCost);
        final long $saaClassCost = Double.doubleToLongBits(this.getSaaClassCost());
        result = result * PRIME + (int) ($saaClassCost >>> 32 ^ $saaClassCost);
        final long $saaInterchangeCost = Double.doubleToLongBits(this.getSaaInterchangeCost());
        result = result * PRIME + (int) ($saaInterchangeCost >>> 32 ^ $saaInterchangeCost);
        final long $saaTerminalCost = Double.doubleToLongBits(this.getSaaTerminalCost());
        result = result * PRIME + (int) ($saaTerminalCost >>> 32 ^ $saaTerminalCost);
        final long $mechanicalPerCar = Double.doubleToLongBits(this.getMechanicalPerCar());
        result = result * PRIME + (int) ($mechanicalPerCar >>> 32 ^ $mechanicalPerCar);
        final long $carloadOrigsOnnet = Double.doubleToLongBits(this.getCarloadOrigsOnnet());
        result = result * PRIME + (int) ($carloadOrigsOnnet >>> 32 ^ $carloadOrigsOnnet);
        final long $specFacilityPerCarloadOrig = Double.doubleToLongBits(this.getSpecFacilityPerCarloadOrig());
        result = result * PRIME + (int) ($specFacilityPerCarloadOrig >>> 32 ^ $specFacilityPerCarloadOrig);
        return result;
    }

    public String toString() {
        return "TerminalYard(cityName=" + this.getCityName() + ", terminal=" + this.getTerminal() + ", opStation=" + this.getOpStation() + ", classCost=" + this.getClassCost() + ", interchangeCost=" + this.getInterchangeCost() + ", terminalCost=" + this.getTerminalCost() + ", saaClassCost=" + this.getSaaClassCost() + ", saaInterchangeCost=" + this.getSaaInterchangeCost() + ", saaTerminalCost=" + this.getSaaTerminalCost() + ", mechanicalPerCar=" + this.getMechanicalPerCar() + ", carloadOrigsOnnet=" + this.getCarloadOrigsOnnet() + ", specFacilityPerCarloadOrig=" + this.getSpecFacilityPerCarloadOrig() + ")";
    }
}
