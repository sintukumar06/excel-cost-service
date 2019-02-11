package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DUMPING_CHARGE")
public class DumpingCharge {
    @Id
    @Column(name = "CITY")
    private String city;
    @Column(name = "DUMPING_CHARGE")
    private double dumpingCharge;
}
