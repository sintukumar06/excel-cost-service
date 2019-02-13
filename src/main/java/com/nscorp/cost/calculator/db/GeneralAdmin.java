package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

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
    @Column(name = "GA_CUST_SERV_BY_CARLOAD_ORIG")
    private double gaCustomerServiceByCarload;
    @Column(name = "ADMIN_COST_BY_CARLOAD")
    private double adminCostByCarload;
    @Column(name = "GA_MKTG_BY_CARLOAD")
    private double gaMarketingByCarload;
    @Column(name = "TAXES_BY_CARLOAD")
    private double gaTaxesByCarload;

    public GeneralAdmin() {
    }

    public String getMajorGroup() {
        return this.majorGroup;
    }

    public void setMajorGroup(String majorGroup) {
        this.majorGroup = majorGroup;
    }

    public double getCarloadOrigOnnet() {
        return this.carloadOrigOnnet;
    }

    public void setCarloadOrigOnnet(double carloadOrigOnnet) {
        this.carloadOrigOnnet = carloadOrigOnnet;
    }

    public double getAdminCost() {
        return this.adminCost;
    }

    public void setAdminCost(double adminCost) {
        this.adminCost = adminCost;
    }

    public double getCustomerServiceCost() {
        return this.customerServiceCost;
    }

    public void setCustomerServiceCost(double customerServiceCost) {
        this.customerServiceCost = customerServiceCost;
    }

    public double getMarketingCost() {
        return this.marketingCost;
    }

    public void setMarketingCost(double marketingCost) {
        this.marketingCost = marketingCost;
    }

    public double getTaxes() {
        return this.taxes;
    }

    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getGaCustomerServiceByCarload() {
        return this.gaCustomerServiceByCarload;
    }

    public void setGaCustomerServiceByCarload(double gaCustomerServiceByCarload) {
        this.gaCustomerServiceByCarload = gaCustomerServiceByCarload;
    }

    public double getAdminCostByCarload() {
        return this.adminCostByCarload;
    }

    public void setAdminCostByCarload(double adminCostByCarload) {
        this.adminCostByCarload = adminCostByCarload;
    }

    public double getGaMarketingByCarload() {
        return this.gaMarketingByCarload;
    }

    public void setGaMarketingByCarload(double gaMarketingByCarload) {
        this.gaMarketingByCarload = gaMarketingByCarload;
    }

    public double getGaTaxesByCarload() {
        return this.gaTaxesByCarload;
    }

    public void setGaTaxesByCarload(double gaTaxesByCarload) {
        this.gaTaxesByCarload = gaTaxesByCarload;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GeneralAdmin)) return false;
        final GeneralAdmin other = (GeneralAdmin) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$majorGroup = this.getMajorGroup();
        final Object other$majorGroup = other.getMajorGroup();
        if (!Objects.equals(this$majorGroup, other$majorGroup))
            return false;
        if (Double.compare(this.getCarloadOrigOnnet(), other.getCarloadOrigOnnet()) != 0) return false;
        if (Double.compare(this.getAdminCost(), other.getAdminCost()) != 0) return false;
        if (Double.compare(this.getCustomerServiceCost(), other.getCustomerServiceCost()) != 0) return false;
        if (Double.compare(this.getMarketingCost(), other.getMarketingCost()) != 0) return false;
        if (Double.compare(this.getTaxes(), other.getTaxes()) != 0) return false;
        if (Double.compare(this.getGaCustomerServiceByCarload(), other.getGaCustomerServiceByCarload()) != 0)
            return false;
        if (Double.compare(this.getAdminCostByCarload(), other.getAdminCostByCarload()) != 0) return false;
        if (Double.compare(this.getGaMarketingByCarload(), other.getGaMarketingByCarload()) != 0) return false;
        if (Double.compare(this.getGaTaxesByCarload(), other.getGaTaxesByCarload()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GeneralAdmin;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $majorGroup = this.getMajorGroup();
        result = result * PRIME + ($majorGroup == null ? 43 : $majorGroup.hashCode());
        final long $carloadOrigOnnet = Double.doubleToLongBits(this.getCarloadOrigOnnet());
        result = result * PRIME + (int) ($carloadOrigOnnet >>> 32 ^ $carloadOrigOnnet);
        final long $adminCost = Double.doubleToLongBits(this.getAdminCost());
        result = result * PRIME + (int) ($adminCost >>> 32 ^ $adminCost);
        final long $customerServiceCost = Double.doubleToLongBits(this.getCustomerServiceCost());
        result = result * PRIME + (int) ($customerServiceCost >>> 32 ^ $customerServiceCost);
        final long $marketingCost = Double.doubleToLongBits(this.getMarketingCost());
        result = result * PRIME + (int) ($marketingCost >>> 32 ^ $marketingCost);
        final long $taxes = Double.doubleToLongBits(this.getTaxes());
        result = result * PRIME + (int) ($taxes >>> 32 ^ $taxes);
        final long $gaCustomerServiceByCarload = Double.doubleToLongBits(this.getGaCustomerServiceByCarload());
        result = result * PRIME + (int) ($gaCustomerServiceByCarload >>> 32 ^ $gaCustomerServiceByCarload);
        final long $adminCostByCarload = Double.doubleToLongBits(this.getAdminCostByCarload());
        result = result * PRIME + (int) ($adminCostByCarload >>> 32 ^ $adminCostByCarload);
        final long $gaMarketingByCarload = Double.doubleToLongBits(this.getGaMarketingByCarload());
        result = result * PRIME + (int) ($gaMarketingByCarload >>> 32 ^ $gaMarketingByCarload);
        final long $gaTaxesByCarload = Double.doubleToLongBits(this.getGaTaxesByCarload());
        result = result * PRIME + (int) ($gaTaxesByCarload >>> 32 ^ $gaTaxesByCarload);
        return result;
    }

    public String toString() {
        return "GeneralAdmin(majorGroup=" + this.getMajorGroup()
                + ", carloadOrigOnnet=" + this.getCarloadOrigOnnet()
                + ", adminCost=" + this.getAdminCost()
                + ", customerServiceCost=" + this.getCustomerServiceCost()
                + ", marketingCost=" + this.getMarketingCost()
                + ", taxes=" + this.getTaxes()
                + ", gaCustomerServiceByCarload=" + this.getGaCustomerServiceByCarload()
                + ", adminCostByCarload=" + this.getAdminCostByCarload()
                + ", gaMarketingByCarload=" + this.getGaMarketingByCarload()
                + ", gaTaxesByCarload=" + this.getGaTaxesByCarload() + ")";
    }

}
