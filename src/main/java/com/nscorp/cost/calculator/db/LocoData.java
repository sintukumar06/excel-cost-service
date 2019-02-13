package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "LOCOMOTIVE_DATA")
public class LocoData {
    @Id
    @Column(name = "LINK_RATING")
    private String linkRating;
    @Column(name = "LOCOMOTIVE_ECONOMICS")
    private double locoEconomics;
    @Column(name = "ROAD_LOCO_ELAPSED_DAYS")
    private double roadLocoElapsedDays;
    @Column(name = "LOCO_ECON_FACTOR")
    private double locoEconomicsCostPerDays;

    public LocoData() {
    }

    public String getLinkRating() {
        return this.linkRating;
    }

    public void setLinkRating(String linkRating) {
        this.linkRating = linkRating;
    }

    public double getLocoEconomics() {
        return this.locoEconomics;
    }

    public void setLocoEconomics(double locoEconomics) {
        this.locoEconomics = locoEconomics;
    }

    public double getRoadLocoElapsedDays() {
        return this.roadLocoElapsedDays;
    }

    public void setRoadLocoElapsedDays(double roadLocoElapsedDays) {
        this.roadLocoElapsedDays = roadLocoElapsedDays;
    }

    public double getLocoEconomicsCostPerDays() {
        return this.locoEconomicsCostPerDays;
    }

    public void setLocoEconomicsCostPerDays(double locoEconomicsCostPerDays) {
        this.locoEconomicsCostPerDays = locoEconomicsCostPerDays;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof LocoData)) return false;
        final LocoData other = (LocoData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$linkRating = this.getLinkRating();
        final Object other$linkRating = other.getLinkRating();
        if (!Objects.equals(this$linkRating, other$linkRating))
            return false;
        if (Double.compare(this.getLocoEconomics(), other.getLocoEconomics()) != 0) return false;
        if (Double.compare(this.getRoadLocoElapsedDays(), other.getRoadLocoElapsedDays()) != 0) return false;
        if (Double.compare(this.getLocoEconomicsCostPerDays(), other.getLocoEconomicsCostPerDays()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof LocoData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $linkRating = this.getLinkRating();
        result = result * PRIME + ($linkRating == null ? 43 : $linkRating.hashCode());
        final long $locoEconomics = Double.doubleToLongBits(this.getLocoEconomics());
        result = result * PRIME + (int) ($locoEconomics >>> 32 ^ $locoEconomics);
        final long $roadLocoElapsedDays = Double.doubleToLongBits(this.getRoadLocoElapsedDays());
        result = result * PRIME + (int) ($roadLocoElapsedDays >>> 32 ^ $roadLocoElapsedDays);
        final long $locoEconomicsCostPerDays = Double.doubleToLongBits(this.getLocoEconomicsCostPerDays());
        result = result * PRIME + (int) ($locoEconomicsCostPerDays >>> 32 ^ $locoEconomicsCostPerDays);
        return result;
    }

    public String toString() {
        return "LocoData(linkRating=" + this.getLinkRating()
                + ", locoEconomics=" + this.getLocoEconomics()
                + ", roadLocoElapsedDays=" + this.getRoadLocoElapsedDays()
                + ", locoEconomicsCostPerDays=" + this.getLocoEconomicsCostPerDays() + ")";
    }

}
