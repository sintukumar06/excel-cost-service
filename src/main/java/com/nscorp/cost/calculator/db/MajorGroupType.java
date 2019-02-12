package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "MKTG_MAJOR_GROUP")
public class MajorGroupType {
    @Id
    @Column(name = "MKTG_MAJOR_GROUP")
    private String majorGroupType;
}
