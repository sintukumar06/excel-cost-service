package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public RateIndex() {
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public double getAgriculture() {
        return this.agriculture;
    }

    public void setAgriculture(double agriculture) {
        this.agriculture = agriculture;
    }

    public double getAutomotive() {
        return this.automotive;
    }

    public void setAutomotive(double automotive) {
        this.automotive = automotive;
    }

    public double getChemical() {
        return this.chemical;
    }

    public void setChemical(double chemical) {
        this.chemical = chemical;
    }

    public double getCoal() {
        return this.coal;
    }

    public void setCoal(double coal) {
        this.coal = coal;
    }

    public double getIntermodal() {
        return this.intermodal;
    }

    public void setIntermodal(double intermodal) {
        this.intermodal = intermodal;
    }

    public double getMetals() {
        return this.metals;
    }

    public void setMetals(double metals) {
        this.metals = metals;
    }

    public double getPaper() {
        return this.paper;
    }

    public void setPaper(double paper) {
        this.paper = paper;
    }

    public double getCompositeNS() {
        return this.compositeNS;
    }

    public void setCompositeNS(double compositeNS) {
        this.compositeNS = compositeNS;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RateIndex)) return false;
        final RateIndex other = (RateIndex) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$year = this.getYear();
        final Object other$year = other.getYear();
        if (this$year == null ? other$year != null : !this$year.equals(other$year)) return false;
        if (Double.compare(this.getAgriculture(), other.getAgriculture()) != 0) return false;
        if (Double.compare(this.getAutomotive(), other.getAutomotive()) != 0) return false;
        if (Double.compare(this.getChemical(), other.getChemical()) != 0) return false;
        if (Double.compare(this.getCoal(), other.getCoal()) != 0) return false;
        if (Double.compare(this.getIntermodal(), other.getIntermodal()) != 0) return false;
        if (Double.compare(this.getMetals(), other.getMetals()) != 0) return false;
        if (Double.compare(this.getPaper(), other.getPaper()) != 0) return false;
        if (Double.compare(this.getCompositeNS(), other.getCompositeNS()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RateIndex;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $year = this.getYear();
        result = result * PRIME + ($year == null ? 43 : $year.hashCode());
        final long $agriculture = Double.doubleToLongBits(this.getAgriculture());
        result = result * PRIME + (int) ($agriculture >>> 32 ^ $agriculture);
        final long $automotive = Double.doubleToLongBits(this.getAutomotive());
        result = result * PRIME + (int) ($automotive >>> 32 ^ $automotive);
        final long $chemical = Double.doubleToLongBits(this.getChemical());
        result = result * PRIME + (int) ($chemical >>> 32 ^ $chemical);
        final long $coal = Double.doubleToLongBits(this.getCoal());
        result = result * PRIME + (int) ($coal >>> 32 ^ $coal);
        final long $intermodal = Double.doubleToLongBits(this.getIntermodal());
        result = result * PRIME + (int) ($intermodal >>> 32 ^ $intermodal);
        final long $metals = Double.doubleToLongBits(this.getMetals());
        result = result * PRIME + (int) ($metals >>> 32 ^ $metals);
        final long $paper = Double.doubleToLongBits(this.getPaper());
        result = result * PRIME + (int) ($paper >>> 32 ^ $paper);
        final long $compositeNS = Double.doubleToLongBits(this.getCompositeNS());
        result = result * PRIME + (int) ($compositeNS >>> 32 ^ $compositeNS);
        return result;
    }

    public String toString() {
        return "RateIndex(year=" + this.getYear() + ", agriculture=" + this.getAgriculture() + ", automotive=" + this.getAutomotive() + ", chemical=" + this.getChemical() + ", coal=" + this.getCoal() + ", intermodal=" + this.getIntermodal() + ", metals=" + this.getMetals() + ", paper=" + this.getPaper() + ", compositeNS=" + this.getCompositeNS() + ")";
    }
}
