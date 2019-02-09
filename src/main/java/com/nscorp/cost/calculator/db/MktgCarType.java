package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "MKTG_CAR_TYPE_DATA")
public class MktgCarType {
    @EmbeddedId
    private MktgCarTypeId mktgCarTypeId;

    @Column(name = "TARE")
    private int tare;
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
}
