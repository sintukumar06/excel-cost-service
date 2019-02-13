package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "STATE_CITY")
public class StateCity {
    @Id
    @Column(name = "CITY")
    private String cityName;

    public StateCity() {
    }

    public String getCityName() {
        return this.cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof StateCity)) return false;
        final StateCity other = (StateCity) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$cityName = this.getCityName();
        final Object other$cityName = other.getCityName();
        if (this$cityName == null ? other$cityName != null : !this$cityName.equals(other$cityName)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof StateCity;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $cityName = this.getCityName();
        result = result * PRIME + ($cityName == null ? 43 : $cityName.hashCode());
        return result;
    }

    public String toString() {
        return "StateCity(cityName=" + this.getCityName() + ")";
    }
}
