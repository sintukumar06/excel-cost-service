package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
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
}
