package com.nscorp.cost.calculator.model;

import java.util.List;

public class ResponseData {
    private CostSummary vec;
    private CostSummary vrc;
    private CostSummary coalDumping;
    private List<PushersInfo> pusherData;
    private List<SummaryData> summaryData;

    @java.beans.ConstructorProperties({"vec", "vrc", "coalDumping", "pusherData", "summaryData"})
    public ResponseData(CostSummary vec, CostSummary vrc, CostSummary coalDumping, List<PushersInfo> pusherData, List<SummaryData> summaryData) {
        this.vec = vec;
        this.vrc = vrc;
        this.coalDumping = coalDumping;
        this.pusherData = pusherData;
        this.summaryData = summaryData;
    }

    public ResponseData() {
    }

    public static ResponseDataBuilder builder() {
        return new ResponseDataBuilder();
    }

    public CostSummary getVec() {
        return this.vec;
    }

    public void setVec(CostSummary vec) {
        this.vec = vec;
    }

    public CostSummary getVrc() {
        return this.vrc;
    }

    public void setVrc(CostSummary vrc) {
        this.vrc = vrc;
    }

    public CostSummary getCoalDumping() {
        return this.coalDumping;
    }

    public void setCoalDumping(CostSummary coalDumping) {
        this.coalDumping = coalDumping;
    }

    public List<PushersInfo> getPusherData() {
        return this.pusherData;
    }

    public void setPusherData(List<PushersInfo> pusherData) {
        this.pusherData = pusherData;
    }

    public List<SummaryData> getSummaryData() {
        return this.summaryData;
    }

    public void setSummaryData(List<SummaryData> summaryData) {
        this.summaryData = summaryData;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof ResponseData)) return false;
        final ResponseData other = (ResponseData) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$vec = this.getVec();
        final Object other$vec = other.getVec();
        if (this$vec == null ? other$vec != null : !this$vec.equals(other$vec)) return false;
        final Object this$vrc = this.getVrc();
        final Object other$vrc = other.getVrc();
        if (this$vrc == null ? other$vrc != null : !this$vrc.equals(other$vrc)) return false;
        final Object this$coalDumping = this.getCoalDumping();
        final Object other$coalDumping = other.getCoalDumping();
        if (this$coalDumping == null ? other$coalDumping != null : !this$coalDumping.equals(other$coalDumping))
            return false;
        final Object this$pusherData = this.getPusherData();
        final Object other$pusherData = other.getPusherData();
        if (this$pusherData == null ? other$pusherData != null : !this$pusherData.equals(other$pusherData))
            return false;
        final Object this$summaryData = this.getSummaryData();
        final Object other$summaryData = other.getSummaryData();
        if (this$summaryData == null ? other$summaryData != null : !this$summaryData.equals(other$summaryData))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof ResponseData;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $vec = this.getVec();
        result = result * PRIME + ($vec == null ? 43 : $vec.hashCode());
        final Object $vrc = this.getVrc();
        result = result * PRIME + ($vrc == null ? 43 : $vrc.hashCode());
        final Object $coalDumping = this.getCoalDumping();
        result = result * PRIME + ($coalDumping == null ? 43 : $coalDumping.hashCode());
        final Object $pusherData = this.getPusherData();
        result = result * PRIME + ($pusherData == null ? 43 : $pusherData.hashCode());
        final Object $summaryData = this.getSummaryData();
        result = result * PRIME + ($summaryData == null ? 43 : $summaryData.hashCode());
        return result;
    }

    public String toString() {
        return "ResponseData(vec=" + this.getVec() + ", vrc=" + this.getVrc() + ", coalDumping=" + this.getCoalDumping() + ", pusherData=" + this.getPusherData() + ", summaryData=" + this.getSummaryData() + ")";
    }

    public static class ResponseDataBuilder {
        private CostSummary vec;
        private CostSummary vrc;
        private CostSummary coalDumping;
        private List<PushersInfo> pusherData;
        private List<SummaryData> summaryData;

        ResponseDataBuilder() {
        }

        public ResponseData.ResponseDataBuilder vec(CostSummary vec) {
            this.vec = vec;
            return this;
        }

        public ResponseData.ResponseDataBuilder vrc(CostSummary vrc) {
            this.vrc = vrc;
            return this;
        }

        public ResponseData.ResponseDataBuilder coalDumping(CostSummary coalDumping) {
            this.coalDumping = coalDumping;
            return this;
        }

        public ResponseData.ResponseDataBuilder pusherData(List<PushersInfo> pusherData) {
            this.pusherData = pusherData;
            return this;
        }

        public ResponseData.ResponseDataBuilder summaryData(List<SummaryData> summaryData) {
            this.summaryData = summaryData;
            return this;
        }

        public ResponseData build() {
            return new ResponseData(vec, vrc, coalDumping, pusherData, summaryData);
        }

        public String toString() {
            return "ResponseData.ResponseDataBuilder(vec=" + this.vec + ", vrc=" + this.vrc + ", coalDumping=" + this.coalDumping + ", pusherData=" + this.pusherData + ", summaryData=" + this.summaryData + ")";
        }
    }
}
