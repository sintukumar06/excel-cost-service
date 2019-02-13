package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "DIVISION")
public class Division {
    @Id
    @Column(name = "DIVISION")
    private String division;

    public Division() {
    }

    public String getDivision() {
        return this.division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Division)) return false;
        final Division other = (Division) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$division = this.getDivision();
        final Object other$division = other.getDivision();
        if (!Objects.equals(this$division, other$division)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Division;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $division = this.getDivision();
        result = result * PRIME + ($division == null ? 43 : $division.hashCode());
        return result;
    }

    public String toString() {
        return "Division(division=" + this.getDivision() + ")";
    }
}
