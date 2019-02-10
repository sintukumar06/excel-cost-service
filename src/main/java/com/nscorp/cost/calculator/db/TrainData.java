package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
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

    public double getTrainStartCost() {
        return (getTrainCost() + getTaxiCost()) / getTrainStartCount();
    }
}
