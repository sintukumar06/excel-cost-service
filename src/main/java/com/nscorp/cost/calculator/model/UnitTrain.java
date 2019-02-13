package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.Division;

public class UnitTrain {
    @Division
    private String division;
    private float loadedMiles;
    private float locomotiveDaysOnline;
    private float carDaysOnline;
    private int numberOfTrainStarts;
    private boolean carHiredOrDailyRate;
    private boolean avgJointFacilityOrHaulageOrLease;
    private boolean specializedFacilitySvcs;

    @java.beans.ConstructorProperties({"division", "loadedMiles", "locomotiveDaysOnline", "carDaysOnline", "numberOfTrainStarts", "carHiredOrDailyRate", "avgJointFacilityOrHaulageOrLease", "specializedFacilitySvcs"})
    public UnitTrain(String division, float loadedMiles, float locomotiveDaysOnline, float carDaysOnline, int numberOfTrainStarts, boolean carHiredOrDailyRate, boolean avgJointFacilityOrHaulageOrLease, boolean specializedFacilitySvcs) {
        this.division = division;
        this.loadedMiles = loadedMiles;
        this.locomotiveDaysOnline = locomotiveDaysOnline;
        this.carDaysOnline = carDaysOnline;
        this.numberOfTrainStarts = numberOfTrainStarts;
        this.carHiredOrDailyRate = carHiredOrDailyRate;
        this.avgJointFacilityOrHaulageOrLease = avgJointFacilityOrHaulageOrLease;
        this.specializedFacilitySvcs = specializedFacilitySvcs;
    }

    public UnitTrain() {
    }

    public static UnitTrainBuilder builder() {
        return new UnitTrainBuilder();
    }

    public String getDivision() {
        return this.division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public float getLoadedMiles() {
        return this.loadedMiles;
    }

    public void setLoadedMiles(float loadedMiles) {
        this.loadedMiles = loadedMiles;
    }

    public float getLocomotiveDaysOnline() {
        return this.locomotiveDaysOnline;
    }

    public void setLocomotiveDaysOnline(float locomotiveDaysOnline) {
        this.locomotiveDaysOnline = locomotiveDaysOnline;
    }

    public float getCarDaysOnline() {
        return this.carDaysOnline;
    }

    public void setCarDaysOnline(float carDaysOnline) {
        this.carDaysOnline = carDaysOnline;
    }

    public int getNumberOfTrainStarts() {
        return this.numberOfTrainStarts;
    }

    public void setNumberOfTrainStarts(int numberOfTrainStarts) {
        this.numberOfTrainStarts = numberOfTrainStarts;
    }

    public boolean isCarHiredOrDailyRate() {
        return this.carHiredOrDailyRate;
    }

    public void setCarHiredOrDailyRate(boolean carHiredOrDailyRate) {
        this.carHiredOrDailyRate = carHiredOrDailyRate;
    }

    public boolean isAvgJointFacilityOrHaulageOrLease() {
        return this.avgJointFacilityOrHaulageOrLease;
    }

    public void setAvgJointFacilityOrHaulageOrLease(boolean avgJointFacilityOrHaulageOrLease) {
        this.avgJointFacilityOrHaulageOrLease = avgJointFacilityOrHaulageOrLease;
    }

    public boolean isSpecializedFacilitySvcs() {
        return this.specializedFacilitySvcs;
    }

    public void setSpecializedFacilitySvcs(boolean specializedFacilitySvcs) {
        this.specializedFacilitySvcs = specializedFacilitySvcs;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UnitTrain)) return false;
        final UnitTrain other = (UnitTrain) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$division = this.getDivision();
        final Object other$division = other.getDivision();
        if (this$division == null ? other$division != null : !this$division.equals(other$division)) return false;
        if (Float.compare(this.getLoadedMiles(), other.getLoadedMiles()) != 0) return false;
        if (Float.compare(this.getLocomotiveDaysOnline(), other.getLocomotiveDaysOnline()) != 0) return false;
        if (Float.compare(this.getCarDaysOnline(), other.getCarDaysOnline()) != 0) return false;
        if (this.getNumberOfTrainStarts() != other.getNumberOfTrainStarts()) return false;
        if (this.isCarHiredOrDailyRate() != other.isCarHiredOrDailyRate()) return false;
        if (this.isAvgJointFacilityOrHaulageOrLease() != other.isAvgJointFacilityOrHaulageOrLease()) return false;
        if (this.isSpecializedFacilitySvcs() != other.isSpecializedFacilitySvcs()) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UnitTrain;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $division = this.getDivision();
        result = result * PRIME + ($division == null ? 43 : $division.hashCode());
        result = result * PRIME + Float.floatToIntBits(this.getLoadedMiles());
        result = result * PRIME + Float.floatToIntBits(this.getLocomotiveDaysOnline());
        result = result * PRIME + Float.floatToIntBits(this.getCarDaysOnline());
        result = result * PRIME + this.getNumberOfTrainStarts();
        result = result * PRIME + (this.isCarHiredOrDailyRate() ? 79 : 97);
        result = result * PRIME + (this.isAvgJointFacilityOrHaulageOrLease() ? 79 : 97);
        result = result * PRIME + (this.isSpecializedFacilitySvcs() ? 79 : 97);
        return result;
    }

    public String toString() {
        return "UnitTrain(division=" + this.getDivision() + ", loadedMiles=" + this.getLoadedMiles() + ", locomotiveDaysOnline=" + this.getLocomotiveDaysOnline() + ", carDaysOnline=" + this.getCarDaysOnline() + ", numberOfTrainStarts=" + this.getNumberOfTrainStarts() + ", carHiredOrDailyRate=" + this.isCarHiredOrDailyRate() + ", avgJointFacilityOrHaulageOrLease=" + this.isAvgJointFacilityOrHaulageOrLease() + ", specializedFacilitySvcs=" + this.isSpecializedFacilitySvcs() + ")";
    }

    public static class UnitTrainBuilder {
        private String division;
        private float loadedMiles;
        private float locomotiveDaysOnline;
        private float carDaysOnline;
        private int numberOfTrainStarts;
        private boolean carHiredOrDailyRate;
        private boolean avgJointFacilityOrHaulageOrLease;
        private boolean specializedFacilitySvcs;

        UnitTrainBuilder() {
        }

        public UnitTrain.UnitTrainBuilder division(String division) {
            this.division = division;
            return this;
        }

        public UnitTrain.UnitTrainBuilder loadedMiles(float loadedMiles) {
            this.loadedMiles = loadedMiles;
            return this;
        }

        public UnitTrain.UnitTrainBuilder locomotiveDaysOnline(float locomotiveDaysOnline) {
            this.locomotiveDaysOnline = locomotiveDaysOnline;
            return this;
        }

        public UnitTrain.UnitTrainBuilder carDaysOnline(float carDaysOnline) {
            this.carDaysOnline = carDaysOnline;
            return this;
        }

        public UnitTrain.UnitTrainBuilder numberOfTrainStarts(int numberOfTrainStarts) {
            this.numberOfTrainStarts = numberOfTrainStarts;
            return this;
        }

        public UnitTrain.UnitTrainBuilder carHiredOrDailyRate(boolean carHiredOrDailyRate) {
            this.carHiredOrDailyRate = carHiredOrDailyRate;
            return this;
        }

        public UnitTrain.UnitTrainBuilder avgJointFacilityOrHaulageOrLease(boolean avgJointFacilityOrHaulageOrLease) {
            this.avgJointFacilityOrHaulageOrLease = avgJointFacilityOrHaulageOrLease;
            return this;
        }

        public UnitTrain.UnitTrainBuilder specializedFacilitySvcs(boolean specializedFacilitySvcs) {
            this.specializedFacilitySvcs = specializedFacilitySvcs;
            return this;
        }

        public UnitTrain build() {
            return new UnitTrain(division, loadedMiles, locomotiveDaysOnline, carDaysOnline, numberOfTrainStarts, carHiredOrDailyRate, avgJointFacilityOrHaulageOrLease, specializedFacilitySvcs);
        }

        public String toString() {
            return "UnitTrain.UnitTrainBuilder(division=" + this.division + ", loadedMiles=" + this.loadedMiles + ", locomotiveDaysOnline=" + this.locomotiveDaysOnline + ", carDaysOnline=" + this.carDaysOnline + ", numberOfTrainStarts=" + this.numberOfTrainStarts + ", carHiredOrDailyRate=" + this.carHiredOrDailyRate + ", avgJointFacilityOrHaulageOrLease=" + this.avgJointFacilityOrHaulageOrLease + ", specializedFacilitySvcs=" + this.specializedFacilitySvcs + ")";
        }
    }
}
