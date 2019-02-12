package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "STATE_CITY")
public class StateCity {
    @Id
    @Column(name = "CITY")
    private String cityName;
}
