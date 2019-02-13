package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TY_SWITCH_TYPE")
public class TySwitchType {
    @Id
    @Column(name = "SWITCH_TYPE")
    private String switchType;

    public TySwitchType() {
    }

    public String getSwitchType() {
        return this.switchType;
    }

    public void setSwitchType(String switchType) {
        this.switchType = switchType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof TySwitchType)) return false;
        final TySwitchType other = (TySwitchType) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$switchType = this.getSwitchType();
        final Object other$switchType = other.getSwitchType();
        if (this$switchType == null ? other$switchType != null : !this$switchType.equals(other$switchType))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof TySwitchType;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $switchType = this.getSwitchType();
        result = result * PRIME + ($switchType == null ? 43 : $switchType.hashCode());
        return result;
    }

    public String toString() {
        return "TySwitchType(switchType=" + this.getSwitchType() + ")";
    }
}
