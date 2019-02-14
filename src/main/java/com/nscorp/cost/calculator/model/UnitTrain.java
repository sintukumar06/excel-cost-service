package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.Division;

public class UnitTrain {
    @Division
    private String division;
    private float loadedMiles;
    private float locomotiveDaysOnline;
    private float carDaysOnline;
    private int numberOfTrainStarts;
    private float networkEconomicFactor;

    @java.beans.ConstructorProperties({"division", "loadedMiles", "locomotiveDaysOnline", "carDaysOnline", "numberOfTrainStarts", "networkEconomicFactor"})
    public UnitTrain(String division, float loadedMiles, float locomotiveDaysOnline, float carDaysOnline, int numberOfTrainStarts, float networkEconomicFactor) {
        this.division = division;
        this.loadedMiles = loadedMiles;
        this.locomotiveDaysOnline = locomotiveDaysOnline;
        this.carDaysOnline = carDaysOnline;
        this.numberOfTrainStarts = numberOfTrainStarts;
        this.networkEconomicFactor = networkEconomicFactor;
    }

    public UnitTrain() {
    }

    public static UnitTrainBuilder builder() {
        return new UnitTrainBuilder();
    }

    public String getDivision() {
        return this.division;
    }

    public float getLoadedMiles() {
        return this.loadedMiles;
    }

    public float getLocomotiveDaysOnline() {
        return this.locomotiveDaysOnline;
    }

    public float getCarDaysOnline() {
        return this.carDaysOnline;
    }

    public int getNumberOfTrainStarts() {
        return this.numberOfTrainStarts;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public void setLoadedMiles(float loadedMiles) {
        this.loadedMiles = loadedMiles;
    }

    public void setLocomotiveDaysOnline(float locomotiveDaysOnline) {
        this.locomotiveDaysOnline = locomotiveDaysOnline;
    }

    public void setCarDaysOnline(float carDaysOnline) {
        this.carDaysOnline = carDaysOnline;
    }

    public void setNumberOfTrainStarts(int numberOfTrainStarts) {
        this.numberOfTrainStarts = numberOfTrainStarts;
    }

    public float getNetworkEconomicFactor() {
        return this.networkEconomicFactor;
    }

    public void setNetworkEconomicFactor(float networkEconomicFactor) {
        this.networkEconomicFactor = networkEconomicFactor;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UnitTrain)) return false;
        final UnitTrain other = (UnitTrain) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$division = this.division;
        final Object other$division = other.division;
        if (this$division == null ? other$division != null : !this$division.equals(other$division)) return false;
        if (Float.compare(this.loadedMiles, other.loadedMiles) != 0) return false;
        if (Float.compare(this.locomotiveDaysOnline, other.locomotiveDaysOnline) != 0) return false;
        if (Float.compare(this.carDaysOnline, other.carDaysOnline) != 0) return false;
        if (this.numberOfTrainStarts != other.numberOfTrainStarts) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UnitTrain;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $division = this.division;
        result = result * PRIME + ($division == null ? 43 : $division.hashCode());
        result = result * PRIME + Float.floatToIntBits(this.loadedMiles);
        result = result * PRIME + Float.floatToIntBits(this.locomotiveDaysOnline);
        result = result * PRIME + Float.floatToIntBits(this.carDaysOnline);
        result = result * PRIME + this.numberOfTrainStarts;
        return result;
    }

    public static class UnitTrainBuilder {
        private String division;
        private float loadedMiles;
        private float locomotiveDaysOnline;
        private float carDaysOnline;
        private int numberOfTrainStarts;
        private float networkEconomicFactor;

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

        public UnitTrain.UnitTrainBuilder networkEconomicFactor(float networkEconomicFactor) {
            this.networkEconomicFactor = networkEconomicFactor;
            return this;
        }

        public UnitTrain build() {
            return new UnitTrain(division, loadedMiles, locomotiveDaysOnline, carDaysOnline, numberOfTrainStarts, networkEconomicFactor);
        }

        public String toString() {
            return "UnitTrain.UnitTrainBuilder(division=" + this.division + ", loadedMiles=" + this.loadedMiles + ", locomotiveDaysOnline=" + this.locomotiveDaysOnline + ", carDaysOnline=" + this.carDaysOnline + ", numberOfTrainStarts=" + this.numberOfTrainStarts + ", networkEconomicFactor=" + this.networkEconomicFactor + ")";
        }
    }
}

