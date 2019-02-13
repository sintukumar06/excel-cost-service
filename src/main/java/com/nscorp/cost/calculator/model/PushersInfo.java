package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.Division;

public class PushersInfo {
    @Division
    private String division;
    private float loadedMiles;
    private float pusherDaysOnline;
    private float numberOfPushers;
    private int numberOfPusherStarts;
    private double pusherCostPerCar;
    private double pusherCostPerTrain;

    @java.beans.ConstructorProperties({"division", "loadedMiles", "pusherDaysOnline", "numberOfPushers", "numberOfPusherStarts", "pusherCostPerCar", "pusherCostPerTrain"})
    public PushersInfo(String division, float loadedMiles, float pusherDaysOnline, float numberOfPushers, int numberOfPusherStarts, double pusherCostPerCar, double pusherCostPerTrain) {
        this.division = division;
        this.loadedMiles = loadedMiles;
        this.pusherDaysOnline = pusherDaysOnline;
        this.numberOfPushers = numberOfPushers;
        this.numberOfPusherStarts = numberOfPusherStarts;
        this.pusherCostPerCar = pusherCostPerCar;
        this.pusherCostPerTrain = pusherCostPerTrain;
    }

    public PushersInfo() {
    }

    public static PushersInfoBuilder builder() {
        return new PushersInfoBuilder();
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

    public float getPusherDaysOnline() {
        return this.pusherDaysOnline;
    }

    public void setPusherDaysOnline(float pusherDaysOnline) {
        this.pusherDaysOnline = pusherDaysOnline;
    }

    public float getNumberOfPushers() {
        return this.numberOfPushers;
    }

    public void setNumberOfPushers(float numberOfPushers) {
        this.numberOfPushers = numberOfPushers;
    }

    public int getNumberOfPusherStarts() {
        return this.numberOfPusherStarts;
    }

    public void setNumberOfPusherStarts(int numberOfPusherStarts) {
        this.numberOfPusherStarts = numberOfPusherStarts;
    }

    public double getPusherCostPerCar() {
        return this.pusherCostPerCar;
    }

    public void setPusherCostPerCar(double pusherCostPerCar) {
        this.pusherCostPerCar = pusherCostPerCar;
    }

    public double getPusherCostPerTrain() {
        return this.pusherCostPerTrain;
    }

    public void setPusherCostPerTrain(double pusherCostPerTrain) {
        this.pusherCostPerTrain = pusherCostPerTrain;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof PushersInfo)) return false;
        final PushersInfo other = (PushersInfo) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$division = this.getDivision();
        final Object other$division = other.getDivision();
        if (this$division == null ? other$division != null : !this$division.equals(other$division)) return false;
        if (Float.compare(this.getLoadedMiles(), other.getLoadedMiles()) != 0) return false;
        if (Float.compare(this.getPusherDaysOnline(), other.getPusherDaysOnline()) != 0) return false;
        if (Float.compare(this.getNumberOfPushers(), other.getNumberOfPushers()) != 0) return false;
        if (this.getNumberOfPusherStarts() != other.getNumberOfPusherStarts()) return false;
        if (Double.compare(this.getPusherCostPerCar(), other.getPusherCostPerCar()) != 0) return false;
        if (Double.compare(this.getPusherCostPerTrain(), other.getPusherCostPerTrain()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof PushersInfo;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $division = this.getDivision();
        result = result * PRIME + ($division == null ? 43 : $division.hashCode());
        result = result * PRIME + Float.floatToIntBits(this.getLoadedMiles());
        result = result * PRIME + Float.floatToIntBits(this.getPusherDaysOnline());
        result = result * PRIME + Float.floatToIntBits(this.getNumberOfPushers());
        result = result * PRIME + this.getNumberOfPusherStarts();
        final long $pusherCostPerCar = Double.doubleToLongBits(this.getPusherCostPerCar());
        result = result * PRIME + (int) ($pusherCostPerCar >>> 32 ^ $pusherCostPerCar);
        final long $pusherCostPerTrain = Double.doubleToLongBits(this.getPusherCostPerTrain());
        result = result * PRIME + (int) ($pusherCostPerTrain >>> 32 ^ $pusherCostPerTrain);
        return result;
    }

    public String toString() {
        return "PushersInfo(division=" + this.getDivision() + ", loadedMiles=" + this.getLoadedMiles() + ", pusherDaysOnline=" + this.getPusherDaysOnline() + ", numberOfPushers=" + this.getNumberOfPushers() + ", numberOfPusherStarts=" + this.getNumberOfPusherStarts() + ", pusherCostPerCar=" + this.getPusherCostPerCar() + ", pusherCostPerTrain=" + this.getPusherCostPerTrain() + ")";
    }

    public PushersInfoBuilder toBuilder() {
        return new PushersInfoBuilder().division(this.division).loadedMiles(this.loadedMiles).pusherDaysOnline(this.pusherDaysOnline).numberOfPushers(this.numberOfPushers).numberOfPusherStarts(this.numberOfPusherStarts).pusherCostPerCar(this.pusherCostPerCar).pusherCostPerTrain(this.pusherCostPerTrain);
    }

    public static class PushersInfoBuilder {
        private String division;
        private float loadedMiles;
        private float pusherDaysOnline;
        private float numberOfPushers;
        private int numberOfPusherStarts;
        private double pusherCostPerCar;
        private double pusherCostPerTrain;

        PushersInfoBuilder() {
        }

        public PushersInfo.PushersInfoBuilder division(String division) {
            this.division = division;
            return this;
        }

        public PushersInfo.PushersInfoBuilder loadedMiles(float loadedMiles) {
            this.loadedMiles = loadedMiles;
            return this;
        }

        public PushersInfo.PushersInfoBuilder pusherDaysOnline(float pusherDaysOnline) {
            this.pusherDaysOnline = pusherDaysOnline;
            return this;
        }

        public PushersInfo.PushersInfoBuilder numberOfPushers(float numberOfPushers) {
            this.numberOfPushers = numberOfPushers;
            return this;
        }

        public PushersInfo.PushersInfoBuilder numberOfPusherStarts(int numberOfPusherStarts) {
            this.numberOfPusherStarts = numberOfPusherStarts;
            return this;
        }

        public PushersInfo.PushersInfoBuilder pusherCostPerCar(double pusherCostPerCar) {
            this.pusherCostPerCar = pusherCostPerCar;
            return this;
        }

        public PushersInfo.PushersInfoBuilder pusherCostPerTrain(double pusherCostPerTrain) {
            this.pusherCostPerTrain = pusherCostPerTrain;
            return this;
        }

        public PushersInfo build() {
            return new PushersInfo(division, loadedMiles, pusherDaysOnline, numberOfPushers, numberOfPusherStarts, pusherCostPerCar, pusherCostPerTrain);
        }

        public String toString() {
            return "PushersInfo.PushersInfoBuilder(division=" + this.division + ", loadedMiles=" + this.loadedMiles + ", pusherDaysOnline=" + this.pusherDaysOnline + ", numberOfPushers=" + this.numberOfPushers + ", numberOfPusherStarts=" + this.numberOfPusherStarts + ", pusherCostPerCar=" + this.pusherCostPerCar + ", pusherCostPerTrain=" + this.pusherCostPerTrain + ")";
        }
    }
}
