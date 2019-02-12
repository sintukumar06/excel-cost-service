package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "TY_SWITCH_TYPE")
public class TySwitchType {
    @Id
    @Column(name = "SWITCH_TYPE")
    private String switchType;
}
