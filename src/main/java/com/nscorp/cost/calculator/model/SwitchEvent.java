package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.City;
import com.nscorp.cost.calculator.validation.constraints.SwitchType;

public class SwitchEvent {
    @SwitchType
    private String switchType;
    @City
    private String cityAndState;

    @java.beans.ConstructorProperties({"switchType", "cityAndState"})
    public SwitchEvent(String switchType, String cityAndState) {
        this.switchType = switchType;
        this.cityAndState = cityAndState;
    }

    public SwitchEvent() {
    }

    public static SwitchEventBuilder builder() {
        return new SwitchEventBuilder();
    }

    public String getSwitchType() {
        return this.switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public String getCityAndState() {
        return this.cityAndState;
    }

    public void setCityAndState(String cityAndState) {
        this.cityAndState = cityAndState;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof SwitchEvent)) return false;
        final SwitchEvent other = (SwitchEvent) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$switchType = this.getSwitchType();
        final Object other$switchType = other.getSwitchType();
        if (this$switchType == null ? other$switchType != null : !this$switchType.equals(other$switchType))
            return false;
        final Object this$cityAndState = this.getCityAndState();
        final Object other$cityAndState = other.getCityAndState();
        if (this$cityAndState == null ? other$cityAndState != null : !this$cityAndState.equals(other$cityAndState))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof SwitchEvent;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $switchType = this.getSwitchType();
        result = result * PRIME + ($switchType == null ? 43 : $switchType.hashCode());
        final Object $cityAndState = this.getCityAndState();
        result = result * PRIME + ($cityAndState == null ? 43 : $cityAndState.hashCode());
        return result;
    }

    public String toString() {
        return "SwitchEvent(switchType=" + this.getSwitchType() + ", cityAndState=" + this.getCityAndState() + ")";
    }

    public static class SwitchEventBuilder {
        private String switchType;
        private String cityAndState;

        SwitchEventBuilder() {
        }

        public SwitchEvent.SwitchEventBuilder switchType(String switchType) {
            this.switchType = switchType;
            return this;
        }

        public SwitchEvent.SwitchEventBuilder cityAndState(String cityAndState) {
            this.cityAndState = cityAndState;
            return this;
        }

        public SwitchEvent build() {
            return new SwitchEvent(switchType, cityAndState);
        }

        public String toString() {
            return "SwitchEvent.SwitchEventBuilder(switchType=" + this.switchType + ", cityAndState=" + this.cityAndState + ")";
        }
    }
}
