package com.nscorp.cost.calculator.db;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "GENERAL_ADMIN")
public class GeneralAdmin {
    @Id
    @Column(name = "MAJOR_GRP")
    private String majorGroup;
    @Column(name = "CARLOAD_ORIGS_ONNET")
    private double carloadOrigOnnet;
    @Column(name = "GA_ADMIN")
    private double adminCost;
    @Column(name = "GA_CUSTOMER_SERVICE")
    private double customerServiceCost;
    @Column(name = "GA_MARKETING")
    private double marketingCost;
    @Column(name = "TAXES")
    private double taxes;

    public double getAdminCostByCarload() {
        return getAdminCost() / getCarloadOrigOnnet();
    }

    public double getGACustomerServiceByCarload() {
        return getCustomerServiceCost() / getCarloadOrigOnnet();
    }

    public double getGAMarketingByCarload() {
        return getMarketingCost() / getCarloadOrigOnnet();
    }

    public double getGATaxesByCarload() {
        return getTaxes() / getCarloadOrigOnnet();
    }
}
