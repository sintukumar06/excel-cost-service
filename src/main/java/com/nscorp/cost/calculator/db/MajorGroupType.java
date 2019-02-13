package com.nscorp.cost.calculator.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "MKTG_MAJOR_GROUP")
public class MajorGroupType {
    @Id
    @Column(name = "MKTG_MAJOR_GROUP")
    private String majorGroupType;

    public MajorGroupType() {
    }

    public String getMajorGroupType() {
        return this.majorGroupType;
    }

    public void setMajorGroupType(String majorGroupType) {
        this.majorGroupType = majorGroupType;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MajorGroupType)) return false;
        final MajorGroupType other = (MajorGroupType) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$majorGroupType = this.getMajorGroupType();
        final Object other$majorGroupType = other.getMajorGroupType();
        if (!Objects.equals(this$majorGroupType, other$majorGroupType))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MajorGroupType;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $majorGroupType = this.getMajorGroupType();
        result = result * PRIME + ($majorGroupType == null ? 43 : $majorGroupType.hashCode());
        return result;
    }

    public String toString() {
        return "MajorGroupType(majorGroupType=" + this.getMajorGroupType() + ")";
    }
}
