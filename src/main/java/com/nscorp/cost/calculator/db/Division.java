package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "DIVISION")
public class Division {
    @Id
    @Column(name = "DIVISION")
    private String division;
}
