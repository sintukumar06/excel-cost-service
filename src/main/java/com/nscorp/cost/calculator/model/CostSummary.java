package com.nscorp.cost.calculator.model;

public class CostSummary {
    private double perCarCost;
    private double perTonCost;
    private double perTrainCost;

    @java.beans.ConstructorProperties({"perCarCost", "perTonCost", "perTrainCost"})
    public CostSummary(double perCarCost, double perTonCost, double perTrainCost) {
        this.perCarCost = perCarCost;
        this.perTonCost = perTonCost;
        this.perTrainCost = perTrainCost;
    }

    public CostSummary() {
    }

    public static CostSummaryBuilder builder() {
        return new CostSummaryBuilder();
    }

    public double getPerCarCost() {
        return this.perCarCost;
    }

    public void setPerCarCost(double perCarCost) {
        this.perCarCost = perCarCost;
    }

    public double getPerTonCost() {
        return this.perTonCost;
    }

    public void setPerTonCost(double perTonCost) {
        this.perTonCost = perTonCost;
    }

    public double getPerTrainCost() {
        return this.perTrainCost;
    }

    public void setPerTrainCost(double perTrainCost) {
        this.perTrainCost = perTrainCost;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof CostSummary)) return false;
        final CostSummary other = (CostSummary) o;
        if (!other.canEqual((Object) this)) return false;
        if (Double.compare(this.getPerCarCost(), other.getPerCarCost()) != 0) return false;
        if (Double.compare(this.getPerTonCost(), other.getPerTonCost()) != 0) return false;
        if (Double.compare(this.getPerTrainCost(), other.getPerTrainCost()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof CostSummary;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final long $perCarCost = Double.doubleToLongBits(this.getPerCarCost());
        result = result * PRIME + (int) ($perCarCost >>> 32 ^ $perCarCost);
        final long $perTonCost = Double.doubleToLongBits(this.getPerTonCost());
        result = result * PRIME + (int) ($perTonCost >>> 32 ^ $perTonCost);
        final long $perTrainCost = Double.doubleToLongBits(this.getPerTrainCost());
        result = result * PRIME + (int) ($perTrainCost >>> 32 ^ $perTrainCost);
        return result;
    }

    public String toString() {
        return "CostSummary(perCarCost=" + this.getPerCarCost() + ", perTonCost=" + this.getPerTonCost() + ", perTrainCost=" + this.getPerTrainCost() + ")";
    }

    public static class CostSummaryBuilder {
        private double perCarCost;
        private double perTonCost;
        private double perTrainCost;

        CostSummaryBuilder() {
        }

        public CostSummary.CostSummaryBuilder perCarCost(double perCarCost) {
            this.perCarCost = perCarCost;
            return this;
        }

        public CostSummary.CostSummaryBuilder perTonCost(double perTonCost) {
            this.perTonCost = perTonCost;
            return this;
        }

        public CostSummary.CostSummaryBuilder perTrainCost(double perTrainCost) {
            this.perTrainCost = perTrainCost;
            return this;
        }

        public CostSummary build() {
            return new CostSummary(perCarCost, perTonCost, perTrainCost);
        }

        public String toString() {
            return "CostSummary.CostSummaryBuilder(perCarCost=" + this.perCarCost + ", perTonCost=" + this.perTonCost + ", perTrainCost=" + this.perTrainCost + ")";
        }
    }
}
