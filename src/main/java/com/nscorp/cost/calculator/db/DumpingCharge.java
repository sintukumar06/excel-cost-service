package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "DUMPING_CHARGE")
public class DumpingCharge {
    @Id
    @Column(name = "CITY")
    private String city;
    @Column(name = "DUMPING_CHARGE")
    private double dumpingCharge;

    public DumpingCharge() {
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getDumpingCharge() {
        return this.dumpingCharge;
    }

    public void setDumpingCharge(double dumpingCharge) {
        this.dumpingCharge = dumpingCharge;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof DumpingCharge)) return false;
        final DumpingCharge other = (DumpingCharge) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (!Objects.equals(this$city, other$city)) return false;
        if (Double.compare(this.getDumpingCharge(), other.getDumpingCharge()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof DumpingCharge;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final long $dumpingCharge = Double.doubleToLongBits(this.getDumpingCharge());
        result = result * PRIME + (int) ($dumpingCharge >>> 32 ^ $dumpingCharge);
        return result;
    }

    public String toString() {
        return "DumpingCharge(city=" + this.getCity() + ", dumpingCharge=" + this.getDumpingCharge() + ")";
    }
}
