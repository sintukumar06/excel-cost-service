package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "LOCOMOTIVE_DATA")
public class LocoData {
    @Id
    @Column(name = "LINK_RATING")
    private String linkRating;
    @Column(name = "LOCOMOTIVE_ECONOMICS")
    private double locoEconomics;
    @Column(name = "ROAD_LOCO_ELAPSED_DAYS")
    private double roadLocoElapsedDays;

    public double getLocoEconomicsCostPerDays() {
        return getLocoEconomics() / getRoadLocoElapsedDays();
    }
}
