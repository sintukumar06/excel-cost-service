package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "RATE_INDEX")
public class RateIndex {
    @Id
    @Column(name = "YEAR")
    private Integer year;
    @Column(name = "AGRICULTURE")
    private double agriculture;
    @Column(name = "AUTOMOTIVE")
    private double automotive;
    @Column(name = "CHEMICALS")
    private double chemical;
    @Column(name = "COAL")
    private double coal;
    @Column(name = "INTERMODAL")
    private double intermodal;
    @Column(name = "METALS")
    private double metals;
    @Column(name = "PAPER")
    private double paper;
    @Column(name = "COMPOSITE_NS")
    private double compositeNS;
}
