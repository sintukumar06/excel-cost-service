package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "MKTG_CAR_TYPE_DATA")
public class MktgCarType {
    @Id
    @Column(name = "CAR_TYPE_OWNER")
    private String carTypeOwner;
    @Column(name = "MARKETING_CAR_TYPE")
    private String marketingCarType;
    @Column(name = "CAR_OWNER")
    private String carOwner;
    @Column(name = "TARE")
    private float tare;
    @Column(name = "NUMBER_OF_CARS")
    private int numberOfCars;
    @Column(name = "MILEAGE_RATE")
    private float mileageRate;
    @Column(name = "ANNUAL_MAINT")
    private float annualMaint;
    @Column(name = "DAILY_REPLACEMENT")
    private float dailyReplacement;
    @Column(name = "DAILY_ECON_COST")
    private float dailyEconCost;
    @Column(name = "DAILY_MAINTENANCE_COST")
    private float dailyMaintenanceCost;
    @Column(name = "DAILY_CAR_HIRE_COST")
    private float dailyCarHireCost;
    @Column(name = "DAILY_EQUIPMENT_COST")
    private float dailyEquipmentCost;

    public MktgCarType() {
    }

    public String getCarTypeOwner() {
        return this.carTypeOwner;
    }

    public void setCarTypeOwner(String carTypeOwner) {
        this.carTypeOwner = carTypeOwner;
    }

    public String getMarketingCarType() {
        return this.marketingCarType;
    }

    public void setMarketingCarType(String marketingCarType) {
        this.marketingCarType = marketingCarType;
    }

    public String getCarOwner() {
        return this.carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public float getTare() {
        return this.tare;
    }

    public void setTare(float tare) {
        this.tare = tare;
    }

    public int getNumberOfCars() {
        return this.numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public float getMileageRate() {
        return this.mileageRate;
    }

    public void setMileageRate(float mileageRate) {
        this.mileageRate = mileageRate;
    }

    public float getAnnualMaint() {
        return this.annualMaint;
    }

    public void setAnnualMaint(float annualMaint) {
        this.annualMaint = annualMaint;
    }

    public float getDailyReplacement() {
        return this.dailyReplacement;
    }

    public void setDailyReplacement(float dailyReplacement) {
        this.dailyReplacement = dailyReplacement;
    }

    public float getDailyEconCost() {
        return this.dailyEconCost;
    }

    public void setDailyEconCost(float dailyEconCost) {
        this.dailyEconCost = dailyEconCost;
    }

    public float getDailyMaintenanceCost() {
        return this.dailyMaintenanceCost;
    }

    public void setDailyMaintenanceCost(float dailyMaintenanceCost) {
        this.dailyMaintenanceCost = dailyMaintenanceCost;
    }

    public float getDailyCarHireCost() {
        return this.dailyCarHireCost;
    }

    public void setDailyCarHireCost(float dailyCarHireCost) {
        this.dailyCarHireCost = dailyCarHireCost;
    }

    public float getDailyEquipmentCost() {
        return this.dailyEquipmentCost;
    }

    public void setDailyEquipmentCost(float dailyEquipmentCost) {
        this.dailyEquipmentCost = dailyEquipmentCost;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MktgCarType)) return false;
        final MktgCarType other = (MktgCarType) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$carTypeOwner = this.getCarTypeOwner();
        final Object other$carTypeOwner = other.getCarTypeOwner();
        if (!Objects.equals(this$carTypeOwner, other$carTypeOwner))
            return false;
        final Object this$marketingCarType = this.getMarketingCarType();
        final Object other$marketingCarType = other.getMarketingCarType();
        if (!Objects.equals(this$marketingCarType, other$marketingCarType))
            return false;
        final Object this$carOwner = this.getCarOwner();
        final Object other$carOwner = other.getCarOwner();
        if (!Objects.equals(this$carOwner, other$carOwner)) return false;
        if (Float.compare(this.getTare(), other.getTare()) != 0) return false;
        if (this.getNumberOfCars() != other.getNumberOfCars()) return false;
        if (Float.compare(this.getMileageRate(), other.getMileageRate()) != 0) return false;
        if (Float.compare(this.getAnnualMaint(), other.getAnnualMaint()) != 0) return false;
        if (Float.compare(this.getDailyReplacement(), other.getDailyReplacement()) != 0) return false;
        if (Float.compare(this.getDailyEconCost(), other.getDailyEconCost()) != 0) return false;
        if (Float.compare(this.getDailyMaintenanceCost(), other.getDailyMaintenanceCost()) != 0) return false;
        if (Float.compare(this.getDailyCarHireCost(), other.getDailyCarHireCost()) != 0) return false;
        if (Float.compare(this.getDailyEquipmentCost(), other.getDailyEquipmentCost()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MktgCarType;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $carTypeOwner = this.getCarTypeOwner();
        result = result * PRIME + ($carTypeOwner == null ? 43 : $carTypeOwner.hashCode());
        final Object $marketingCarType = this.getMarketingCarType();
        result = result * PRIME + ($marketingCarType == null ? 43 : $marketingCarType.hashCode());
        final Object $carOwner = this.getCarOwner();
        result = result * PRIME + ($carOwner == null ? 43 : $carOwner.hashCode());
        result = result * PRIME + Float.floatToIntBits(this.getTare());
        result = result * PRIME + this.getNumberOfCars();
        result = result * PRIME + Float.floatToIntBits(this.getMileageRate());
        result = result * PRIME + Float.floatToIntBits(this.getAnnualMaint());
        result = result * PRIME + Float.floatToIntBits(this.getDailyReplacement());
        result = result * PRIME + Float.floatToIntBits(this.getDailyEconCost());
        result = result * PRIME + Float.floatToIntBits(this.getDailyMaintenanceCost());
        result = result * PRIME + Float.floatToIntBits(this.getDailyCarHireCost());
        result = result * PRIME + Float.floatToIntBits(this.getDailyEquipmentCost());
        return result;
    }

    public String toString() {
        return "MktgCarType(carTypeOwner=" + this.getCarTypeOwner()
                + ", marketingCarType=" + this.getMarketingCarType()
                + ", carOwner=" + this.getCarOwner()
                + ", tare=" + this.getTare()
                + ", numberOfCars=" + this.getNumberOfCars()
                + ", mileageRate=" + this.getMileageRate()
                + ", annualMaint=" + this.getAnnualMaint()
                + ", dailyReplacement=" + this.getDailyReplacement()
                + ", dailyEconCost=" + this.getDailyEconCost()
                + ", dailyMaintenanceCost=" + this.getDailyMaintenanceCost()
                + ", dailyCarHireCost=" + this.getDailyCarHireCost()
                + ", dailyEquipmentCost=" + this.getDailyEquipmentCost() + ")";
    }
}
