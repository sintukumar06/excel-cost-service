package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TRAIN_DATA")
public class TrainData {
    @Id
    @Column(name = "TRAIN_TYPE")
    private String trainType;
    @Column(name = "TRAIN_COST")
    private double trainCost;
    @Column(name = "TAXI_COST")
    private double taxiCost;
    @Column(name = "TRAIN_START_COUNT")
    private double trainStartCount;
    @Column(name = "TRAIN_START_COST")
    private double trainStartCost;

    public TrainData() {
    }

    public String getTrainType() {
        return this.trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public double getTrainCost() {
        return this.trainCost;
    }

    public void setTrainCost(double trainCost) {
        this.trainCost = trainCost;
    }

    public double getTaxiCost() {
        return this.taxiCost;
    }

    public void setTaxiCost(double taxiCost) {
        this.taxiCost = taxiCost;
    }

    public double getTrainStartCount() {
        return this.trainStartCount;
    }

    public void setTrainStartCount(double trainStartCount) {
        this.trainStartCount = trainStartCount;
    }

    public double getTrainStartCost() {
        return this.trainStartCost;
    }

    public void setTrainStartCost(double trainStartCost) {
        this.trainStartCost = trainStartCost;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TrainData)) return false;
        final TrainData other = (TrainData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$trainType = this.getTrainType();
        final Object other$trainType = other.getTrainType();
        if (this$trainType == null ? other$trainType != null : !this$trainType.equals(other$trainType)) return false;
        if (Double.compare(this.getTrainCost(), other.getTrainCost()) != 0) return false;
        if (Double.compare(this.getTaxiCost(), other.getTaxiCost()) != 0) return false;
        if (Double.compare(this.getTrainStartCount(), other.getTrainStartCount()) != 0) return false;
        if (Double.compare(this.getTrainStartCost(), other.getTrainStartCost()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TrainData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $trainType = this.getTrainType();
        result = result * PRIME + ($trainType == null ? 43 : $trainType.hashCode());
        final long $trainCost = Double.doubleToLongBits(this.getTrainCost());
        result = result * PRIME + (int) ($trainCost >>> 32 ^ $trainCost);
        final long $taxiCost = Double.doubleToLongBits(this.getTaxiCost());
        result = result * PRIME + (int) ($taxiCost >>> 32 ^ $taxiCost);
        final long $trainStartCount = Double.doubleToLongBits(this.getTrainStartCount());
        result = result * PRIME + (int) ($trainStartCount >>> 32 ^ $trainStartCount);
        final long $trainStartCost = Double.doubleToLongBits(this.getTrainStartCost());
        result = result * PRIME + (int) ($trainStartCost >>> 32 ^ $trainStartCost);
        return result;
    }

    public String toString() {
        return "TrainData(trainType=" + this.getTrainType() + ", trainCost=" + this.getTrainCost() + ", taxiCost=" + this.getTaxiCost() + ", trainStartCount=" + this.getTrainStartCount() + ", trainStartCost=" + this.getTrainStartCost() + ")";
    }

//    public double getTrainStartCost() {
//        return (getTrainCost() + getTaxiCost()) / getTrainStartCount();
//    }
}
