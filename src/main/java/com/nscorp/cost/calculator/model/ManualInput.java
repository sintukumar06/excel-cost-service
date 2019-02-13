package com.nscorp.cost.calculator.model;

public class ManualInput {
    private float carHireDailyRate;
    private float carHirePerMile;
    private float bhrrFactorPerCar;
    private float tasdPerCar;
    private float tareWeightAdjust;
    private float locoWeight;
    private float networkEconomicFactor;

    @java.beans.ConstructorProperties({"carHireDailyRate", "carHirePerMile", "bhrrFactorPerCar", "tasdPerCar", "tareWeightAdjust", "locoWeight", "networkEconomicFactor"})
    public ManualInput(float carHireDailyRate, float carHirePerMile, float bhrrFactorPerCar, float tasdPerCar, float tareWeightAdjust, float locoWeight, float networkEconomicFactor) {
        this.carHireDailyRate = carHireDailyRate;
        this.carHirePerMile = carHirePerMile;
        this.bhrrFactorPerCar = bhrrFactorPerCar;
        this.tasdPerCar = tasdPerCar;
        this.tareWeightAdjust = tareWeightAdjust;
        this.locoWeight = locoWeight;
        this.networkEconomicFactor = networkEconomicFactor;
    }

    public ManualInput() {
    }

    public static ManualInputBuilder builder() {
        return new ManualInputBuilder();
    }

    public float getCarHireDailyRate() {
        return this.carHireDailyRate;
    }

    public void setCarHireDailyRate(float carHireDailyRate) {
        this.carHireDailyRate = carHireDailyRate;
    }

    public float getCarHirePerMile() {
        return this.carHirePerMile;
    }

    public void setCarHirePerMile(float carHirePerMile) {
        this.carHirePerMile = carHirePerMile;
    }

    public float getBhrrFactorPerCar() {
        return this.bhrrFactorPerCar;
    }

    public void setBhrrFactorPerCar(float bhrrFactorPerCar) {
        this.bhrrFactorPerCar = bhrrFactorPerCar;
    }

    public float getTasdPerCar() {
        return this.tasdPerCar;
    }

    public void setTasdPerCar(float tasdPerCar) {
        this.tasdPerCar = tasdPerCar;
    }

    public float getTareWeightAdjust() {
        return this.tareWeightAdjust;
    }

    public void setTareWeightAdjust(float tareWeightAdjust) {
        this.tareWeightAdjust = tareWeightAdjust;
    }

    public float getLocoWeight() {
        return this.locoWeight;
    }

    public void setLocoWeight(float locoWeight) {
        this.locoWeight = locoWeight;
    }

    public float getNetworkEconomicFactor() {
        return this.networkEconomicFactor;
    }

    public void setNetworkEconomicFactor(float networkEconomicFactor) {
        this.networkEconomicFactor = networkEconomicFactor;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ManualInput)) return false;
        final ManualInput other = (ManualInput) o;
        if (!other.canEqual((Object) this)) return false;
        if (Float.compare(this.getCarHireDailyRate(), other.getCarHireDailyRate()) != 0) return false;
        if (Float.compare(this.getCarHirePerMile(), other.getCarHirePerMile()) != 0) return false;
        if (Float.compare(this.getBhrrFactorPerCar(), other.getBhrrFactorPerCar()) != 0) return false;
        if (Float.compare(this.getTasdPerCar(), other.getTasdPerCar()) != 0) return false;
        if (Float.compare(this.getTareWeightAdjust(), other.getTareWeightAdjust()) != 0) return false;
        if (Float.compare(this.getLocoWeight(), other.getLocoWeight()) != 0) return false;
        if (Float.compare(this.getNetworkEconomicFactor(), other.getNetworkEconomicFactor()) != 0) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ManualInput;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + Float.floatToIntBits(this.getCarHireDailyRate());
        result = result * PRIME + Float.floatToIntBits(this.getCarHirePerMile());
        result = result * PRIME + Float.floatToIntBits(this.getBhrrFactorPerCar());
        result = result * PRIME + Float.floatToIntBits(this.getTasdPerCar());
        result = result * PRIME + Float.floatToIntBits(this.getTareWeightAdjust());
        result = result * PRIME + Float.floatToIntBits(this.getLocoWeight());
        result = result * PRIME + Float.floatToIntBits(this.getNetworkEconomicFactor());
        return result;
    }

    public String toString() {
        return "ManualInput(carHireDailyRate=" + this.getCarHireDailyRate() + ", carHirePerMile=" + this.getCarHirePerMile() + ", bhrrFactorPerCar=" + this.getBhrrFactorPerCar() + ", tasdPerCar=" + this.getTasdPerCar() + ", tareWeightAdjust=" + this.getTareWeightAdjust() + ", locoWeight=" + this.getLocoWeight() + ", networkEconomicFactor=" + this.getNetworkEconomicFactor() + ")";
    }

    public static class ManualInputBuilder {
        private float carHireDailyRate;
        private float carHirePerMile;
        private float bhrrFactorPerCar;
        private float tasdPerCar;
        private float tareWeightAdjust;
        private float locoWeight;
        private float networkEconomicFactor;

        ManualInputBuilder() {
        }

        public ManualInput.ManualInputBuilder carHireDailyRate(float carHireDailyRate) {
            this.carHireDailyRate = carHireDailyRate;
            return this;
        }

        public ManualInput.ManualInputBuilder carHirePerMile(float carHirePerMile) {
            this.carHirePerMile = carHirePerMile;
            return this;
        }

        public ManualInput.ManualInputBuilder bhrrFactorPerCar(float bhrrFactorPerCar) {
            this.bhrrFactorPerCar = bhrrFactorPerCar;
            return this;
        }

        public ManualInput.ManualInputBuilder tasdPerCar(float tasdPerCar) {
            this.tasdPerCar = tasdPerCar;
            return this;
        }

        public ManualInput.ManualInputBuilder tareWeightAdjust(float tareWeightAdjust) {
            this.tareWeightAdjust = tareWeightAdjust;
            return this;
        }

        public ManualInput.ManualInputBuilder locoWeight(float locoWeight) {
            this.locoWeight = locoWeight;
            return this;
        }

        public ManualInput.ManualInputBuilder networkEconomicFactor(float networkEconomicFactor) {
            this.networkEconomicFactor = networkEconomicFactor;
            return this;
        }

        public ManualInput build() {
            return new ManualInput(carHireDailyRate, carHirePerMile, bhrrFactorPerCar, tasdPerCar, tareWeightAdjust, locoWeight, networkEconomicFactor);
        }

        public String toString() {
            return "ManualInput.ManualInputBuilder(carHireDailyRate=" + this.carHireDailyRate + ", carHirePerMile=" + this.carHirePerMile + ", bhrrFactorPerCar=" + this.bhrrFactorPerCar + ", tasdPerCar=" + this.tasdPerCar + ", tareWeightAdjust=" + this.tareWeightAdjust + ", locoWeight=" + this.locoWeight + ", networkEconomicFactor=" + this.networkEconomicFactor + ")";
        }
    }
}
