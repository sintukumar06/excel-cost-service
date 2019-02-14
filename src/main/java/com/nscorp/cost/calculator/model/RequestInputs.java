package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.*;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

public class RequestInputs {
    @MajorGroupType
    private String mktgMajorGroup;
    @Min(value = 1)
    private int numberOfCars;
    private float ladingWeightPerCar;
    private int numberOfLocomotives;
    @CarType
    private String mktgCarType;
    @CarOwner
    private String carOwner;
    private float emptyReturnRatio;
    @TrainType
    private String trainType;
    @City
    private String coalDumpingCity;
    @Valid
    private List<PushersInfo> pushers;
    @Valid
    private List<SwitchEvent> switchEvents;
    private ManualInput manualInput;
    @Valid
    @NotNull
    @NotEmpty
    private List<UnitTrain> unitTrains;
    private boolean carHiredOrDailyRate = true;
    private boolean avgJointFacilityOrHaulageOrLease = false;
    private boolean specializedFacilitySvcs = false;

    @java.beans.ConstructorProperties({"mktgMajorGroup", "numberOfCars", "ladingWeightPerCar", "numberOfLocomotives", "mktgCarType", "carOwner", "emptyReturnRatio", "trainType", "coalDumpingCity", "pushers", "switchEvents", "manualInput", "unitTrains", "carHiredOrDailyRate", "avgJointFacilityOrHaulageOrLease", "specializedFacilitySvcs"})
    public RequestInputs(String mktgMajorGroup, int numberOfCars, float ladingWeightPerCar, int numberOfLocomotives, String mktgCarType, String carOwner, float emptyReturnRatio, String trainType, String coalDumpingCity, List<PushersInfo> pushers, List<SwitchEvent> switchEvents, ManualInput manualInput, List<UnitTrain> unitTrains, boolean carHiredOrDailyRate, boolean avgJointFacilityOrHaulageOrLease, boolean specializedFacilitySvcs) {
        this.mktgMajorGroup = mktgMajorGroup;
        this.numberOfCars = numberOfCars;
        this.ladingWeightPerCar = ladingWeightPerCar;
        this.numberOfLocomotives = numberOfLocomotives;
        this.mktgCarType = mktgCarType;
        this.carOwner = carOwner;
        this.emptyReturnRatio = emptyReturnRatio;
        this.trainType = trainType;
        this.coalDumpingCity = coalDumpingCity;
        this.pushers = pushers;
        this.switchEvents = switchEvents;
        this.manualInput = manualInput;
        this.unitTrains = unitTrains;
        this.carHiredOrDailyRate = carHiredOrDailyRate;
        this.avgJointFacilityOrHaulageOrLease = avgJointFacilityOrHaulageOrLease;
        this.specializedFacilitySvcs = specializedFacilitySvcs;
    }

    public RequestInputs() {
    }

    public static RequestInputsBuilder builder() {
        return new RequestInputsBuilder();
    }

    public String getMktgMajorGroup() {
        return this.mktgMajorGroup;
    }

    public int getNumberOfCars() {
        return this.numberOfCars;
    }

    public float getLadingWeightPerCar() {
        return this.ladingWeightPerCar;
    }

    public int getNumberOfLocomotives() {
        return this.numberOfLocomotives;
    }

    public String getMktgCarType() {
        return this.mktgCarType;
    }

    public String getCarOwner() {
        return this.carOwner;
    }

    public float getEmptyReturnRatio() {
        return this.emptyReturnRatio;
    }

    public String getTrainType() {
        return this.trainType;
    }

    public String getCoalDumpingCity() {
        return this.coalDumpingCity;
    }

    public List<PushersInfo> getPushers() {
        return this.pushers;
    }

    public List<SwitchEvent> getSwitchEvents() {
        return this.switchEvents;
    }

    public ManualInput getManualInput() {
        return this.manualInput;
    }

    public List<UnitTrain> getUnitTrains() {
        return this.unitTrains;
    }

    public boolean isCarHiredOrDailyRate() {
        return this.carHiredOrDailyRate;
    }

    public void setCarHiredOrDailyRate(boolean carHiredOrDailyRate) {
        this.carHiredOrDailyRate = carHiredOrDailyRate;
    }

    public boolean isAvgJointFacilityOrHaulageOrLease() {
        return this.avgJointFacilityOrHaulageOrLease;
    }

    public void setAvgJointFacilityOrHaulageOrLease(boolean avgJointFacilityOrHaulageOrLease) {
        this.avgJointFacilityOrHaulageOrLease = avgJointFacilityOrHaulageOrLease;
    }

    public boolean isSpecializedFacilitySvcs() {
        return this.specializedFacilitySvcs;
    }

    public void setSpecializedFacilitySvcs(boolean specializedFacilitySvcs) {
        this.specializedFacilitySvcs = specializedFacilitySvcs;
    }

    public void setMktgMajorGroup(String mktgMajorGroup) {
        this.mktgMajorGroup = mktgMajorGroup;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public void setLadingWeightPerCar(float ladingWeightPerCar) {
        this.ladingWeightPerCar = ladingWeightPerCar;
    }

    public void setNumberOfLocomotives(int numberOfLocomotives) {
        this.numberOfLocomotives = numberOfLocomotives;
    }

    public void setMktgCarType(String mktgCarType) {
        this.mktgCarType = mktgCarType;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public void setEmptyReturnRatio(float emptyReturnRatio) {
        this.emptyReturnRatio = emptyReturnRatio;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public void setCoalDumpingCity(String coalDumpingCity) {
        this.coalDumpingCity = coalDumpingCity;
    }

    public void setUnitTrains(List<UnitTrain> unitTrains) {
        this.unitTrains = unitTrains;
    }

    public void setPushers(List<PushersInfo> pushers) {
        this.pushers = pushers;
    }

    public void setSwitchEvents(List<SwitchEvent> switchEvents) {
        this.switchEvents = switchEvents;
    }

    public void setManualInput(ManualInput manualInput) {
        this.manualInput = manualInput;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof RequestInputs)) return false;
        final RequestInputs other = (RequestInputs) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$mktgMajorGroup = this.mktgMajorGroup;
        final Object other$mktgMajorGroup = other.mktgMajorGroup;
        if (this$mktgMajorGroup == null ? other$mktgMajorGroup != null : !this$mktgMajorGroup.equals(other$mktgMajorGroup))
            return false;
        if (this.numberOfCars != other.numberOfCars) return false;
        if (Float.compare(this.ladingWeightPerCar, other.ladingWeightPerCar) != 0) return false;
        if (this.numberOfLocomotives != other.numberOfLocomotives) return false;
        final Object this$mktgCarType = this.mktgCarType;
        final Object other$mktgCarType = other.mktgCarType;
        if (this$mktgCarType == null ? other$mktgCarType != null : !this$mktgCarType.equals(other$mktgCarType))
            return false;
        final Object this$carOwner = this.carOwner;
        final Object other$carOwner = other.carOwner;
        if (this$carOwner == null ? other$carOwner != null : !this$carOwner.equals(other$carOwner)) return false;
        if (Float.compare(this.emptyReturnRatio, other.emptyReturnRatio) != 0) return false;
        final Object this$trainType = this.trainType;
        final Object other$trainType = other.trainType;
        if (this$trainType == null ? other$trainType != null : !this$trainType.equals(other$trainType)) return false;
        final Object this$coalDumpingCity = this.coalDumpingCity;
        final Object other$coalDumpingCity = other.coalDumpingCity;
        if (this$coalDumpingCity == null ? other$coalDumpingCity != null : !this$coalDumpingCity.equals(other$coalDumpingCity))
            return false;
        final Object this$pushers = this.pushers;
        final Object other$pushers = other.pushers;
        if (this$pushers == null ? other$pushers != null : !this$pushers.equals(other$pushers)) return false;
        final Object this$switchEvents = this.switchEvents;
        final Object other$switchEvents = other.switchEvents;
        if (this$switchEvents == null ? other$switchEvents != null : !this$switchEvents.equals(other$switchEvents))
            return false;
        final Object this$manualInput = this.manualInput;
        final Object other$manualInput = other.manualInput;
        if (this$manualInput == null ? other$manualInput != null : !this$manualInput.equals(other$manualInput))
            return false;
        final Object this$unitTrains = this.unitTrains;
        final Object other$unitTrains = other.unitTrains;
        if (this$unitTrains == null ? other$unitTrains != null : !this$unitTrains.equals(other$unitTrains))
            return false;
        if (this.carHiredOrDailyRate != other.carHiredOrDailyRate) return false;
        if (this.avgJointFacilityOrHaulageOrLease != other.avgJointFacilityOrHaulageOrLease) return false;
        if (this.specializedFacilitySvcs != other.specializedFacilitySvcs) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof RequestInputs;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mktgMajorGroup = this.mktgMajorGroup;
        result = result * PRIME + ($mktgMajorGroup == null ? 43 : $mktgMajorGroup.hashCode());
        result = result * PRIME + this.numberOfCars;
        result = result * PRIME + Float.floatToIntBits(this.ladingWeightPerCar);
        result = result * PRIME + this.numberOfLocomotives;
        final Object $mktgCarType = this.mktgCarType;
        result = result * PRIME + ($mktgCarType == null ? 43 : $mktgCarType.hashCode());
        final Object $carOwner = this.carOwner;
        result = result * PRIME + ($carOwner == null ? 43 : $carOwner.hashCode());
        result = result * PRIME + Float.floatToIntBits(this.emptyReturnRatio);
        final Object $trainType = this.trainType;
        result = result * PRIME + ($trainType == null ? 43 : $trainType.hashCode());
        final Object $coalDumpingCity = this.coalDumpingCity;
        result = result * PRIME + ($coalDumpingCity == null ? 43 : $coalDumpingCity.hashCode());
        final Object $pushers = this.pushers;
        result = result * PRIME + ($pushers == null ? 43 : $pushers.hashCode());
        final Object $switchEvents = this.switchEvents;
        result = result * PRIME + ($switchEvents == null ? 43 : $switchEvents.hashCode());
        final Object $manualInput = this.manualInput;
        result = result * PRIME + ($manualInput == null ? 43 : $manualInput.hashCode());
        final Object $unitTrains = this.unitTrains;
        result = result * PRIME + ($unitTrains == null ? 43 : $unitTrains.hashCode());
        result = result * PRIME + (this.carHiredOrDailyRate ? 79 : 97);
        result = result * PRIME + (this.avgJointFacilityOrHaulageOrLease ? 79 : 97);
        result = result * PRIME + (this.specializedFacilitySvcs ? 79 : 97);
        return result;
    }

    public String toString() {
        return "RequestInputs(mktgMajorGroup=" + this.mktgMajorGroup + ", numberOfCars=" + this.numberOfCars + ", ladingWeightPerCar=" + this.ladingWeightPerCar + ", numberOfLocomotives=" + this.numberOfLocomotives + ", mktgCarType=" + this.mktgCarType + ", carOwner=" + this.carOwner + ", emptyReturnRatio=" + this.emptyReturnRatio + ", trainType=" + this.trainType + ", coalDumpingCity=" + this.coalDumpingCity + ", pushers=" + this.pushers + ", switchEvents=" + this.switchEvents + ", manualInput=" + this.manualInput + ", unitTrains=" + this.unitTrains + ", carHiredOrDailyRate=" + this.carHiredOrDailyRate + ", avgJointFacilityOrHaulageOrLease=" + this.avgJointFacilityOrHaulageOrLease + ", specializedFacilitySvcs=" + this.specializedFacilitySvcs + ")";
    }

    public RequestInputsBuilder toBuilder() {
        return new RequestInputsBuilder().mktgMajorGroup(this.mktgMajorGroup).numberOfCars(this.numberOfCars).ladingWeightPerCar(this.ladingWeightPerCar).numberOfLocomotives(this.numberOfLocomotives).mktgCarType(this.mktgCarType).carOwner(this.carOwner).emptyReturnRatio(this.emptyReturnRatio).trainType(this.trainType).coalDumpingCity(this.coalDumpingCity).pushers(this.pushers).switchEvents(this.switchEvents).manualInput(this.manualInput).unitTrains(this.unitTrains).carHiredOrDailyRate(this.carHiredOrDailyRate).avgJointFacilityOrHaulageOrLease(this.avgJointFacilityOrHaulageOrLease).specializedFacilitySvcs(this.specializedFacilitySvcs);
    }

    public static class RequestInputsBuilder {
        private String mktgMajorGroup;
        private int numberOfCars;
        private float ladingWeightPerCar;
        private int numberOfLocomotives;
        private String mktgCarType;
        private String carOwner;
        private float emptyReturnRatio;
        private String trainType;
        private String coalDumpingCity;
        private List<PushersInfo> pushers;
        private List<SwitchEvent> switchEvents;
        private ManualInput manualInput;
        private List<UnitTrain> unitTrains;
        private boolean carHiredOrDailyRate;
        private boolean avgJointFacilityOrHaulageOrLease;
        private boolean specializedFacilitySvcs;

        RequestInputsBuilder() {
        }

        public RequestInputs.RequestInputsBuilder mktgMajorGroup(String mktgMajorGroup) {
            this.mktgMajorGroup = mktgMajorGroup;
            return this;
        }

        public RequestInputs.RequestInputsBuilder numberOfCars(int numberOfCars) {
            this.numberOfCars = numberOfCars;
            return this;
        }

        public RequestInputs.RequestInputsBuilder ladingWeightPerCar(float ladingWeightPerCar) {
            this.ladingWeightPerCar = ladingWeightPerCar;
            return this;
        }

        public RequestInputs.RequestInputsBuilder numberOfLocomotives(int numberOfLocomotives) {
            this.numberOfLocomotives = numberOfLocomotives;
            return this;
        }

        public RequestInputs.RequestInputsBuilder mktgCarType(String mktgCarType) {
            this.mktgCarType = mktgCarType;
            return this;
        }

        public RequestInputs.RequestInputsBuilder carOwner(String carOwner) {
            this.carOwner = carOwner;
            return this;
        }

        public RequestInputs.RequestInputsBuilder emptyReturnRatio(float emptyReturnRatio) {
            this.emptyReturnRatio = emptyReturnRatio;
            return this;
        }

        public RequestInputs.RequestInputsBuilder trainType(String trainType) {
            this.trainType = trainType;
            return this;
        }

        public RequestInputs.RequestInputsBuilder coalDumpingCity(String coalDumpingCity) {
            this.coalDumpingCity = coalDumpingCity;
            return this;
        }

        public RequestInputs.RequestInputsBuilder pushers(List<PushersInfo> pushers) {
            this.pushers = pushers;
            return this;
        }

        public RequestInputs.RequestInputsBuilder switchEvents(List<SwitchEvent> switchEvents) {
            this.switchEvents = switchEvents;
            return this;
        }

        public RequestInputs.RequestInputsBuilder manualInput(ManualInput manualInput) {
            this.manualInput = manualInput;
            return this;
        }

        public RequestInputs.RequestInputsBuilder unitTrains(List<UnitTrain> unitTrains) {
            this.unitTrains = unitTrains;
            return this;
        }

        public RequestInputs.RequestInputsBuilder carHiredOrDailyRate(boolean carHiredOrDailyRate) {
            this.carHiredOrDailyRate = carHiredOrDailyRate;
            return this;
        }

        public RequestInputs.RequestInputsBuilder avgJointFacilityOrHaulageOrLease(boolean avgJointFacilityOrHaulageOrLease) {
            this.avgJointFacilityOrHaulageOrLease = avgJointFacilityOrHaulageOrLease;
            return this;
        }

        public RequestInputs.RequestInputsBuilder specializedFacilitySvcs(boolean specializedFacilitySvcs) {
            this.specializedFacilitySvcs = specializedFacilitySvcs;
            return this;
        }

        public RequestInputs build() {
            return new RequestInputs(mktgMajorGroup, numberOfCars, ladingWeightPerCar, numberOfLocomotives, mktgCarType, carOwner, emptyReturnRatio, trainType, coalDumpingCity, pushers, switchEvents, manualInput, unitTrains, carHiredOrDailyRate, avgJointFacilityOrHaulageOrLease, specializedFacilitySvcs);
        }

        public String toString() {
            return "RequestInputs.RequestInputsBuilder(mktgMajorGroup=" + this.mktgMajorGroup + ", numberOfCars=" + this.numberOfCars + ", ladingWeightPerCar=" + this.ladingWeightPerCar + ", numberOfLocomotives=" + this.numberOfLocomotives + ", mktgCarType=" + this.mktgCarType + ", carOwner=" + this.carOwner + ", emptyReturnRatio=" + this.emptyReturnRatio + ", trainType=" + this.trainType + ", coalDumpingCity=" + this.coalDumpingCity + ", pushers=" + this.pushers + ", switchEvents=" + this.switchEvents + ", manualInput=" + this.manualInput + ", unitTrains=" + this.unitTrains + ", carHiredOrDailyRate=" + this.carHiredOrDailyRate + ", avgJointFacilityOrHaulageOrLease=" + this.avgJointFacilityOrHaulageOrLease + ", specializedFacilitySvcs=" + this.specializedFacilitySvcs + ")";
        }
    }
}

