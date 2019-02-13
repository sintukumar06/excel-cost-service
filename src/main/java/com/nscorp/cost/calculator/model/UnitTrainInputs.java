package com.nscorp.cost.calculator.model;

import java.util.List;
import java.util.Objects;

public class UnitTrainInputs {
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

    @java.beans.ConstructorProperties({"mktgMajorGroup", "numberOfCars", "ladingWeightPerCar", "numberOfLocomotives", "mktgCarType", "carOwner", "emptyReturnRatio", "trainType", "coalDumpingCity", "pushers", "switchEvents", "manualInput", "unitTrains"})
    public UnitTrainInputs(String mktgMajorGroup, int numberOfCars, float ladingWeightPerCar, int numberOfLocomotives, String mktgCarType, String carOwner, float emptyReturnRatio, String trainType, String coalDumpingCity, List<PushersInfo> pushers, List<SwitchEvent> switchEvents, ManualInput manualInput, List<UnitTrain> unitTrains) {
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
    }

    public UnitTrainInputs() {
    }

    public static UnitTrainInputsBuilder builder() {
        return new UnitTrainInputsBuilder();
    }

    public String getMktgMajorGroup() {
        return this.mktgMajorGroup;
    }

    public void setMktgMajorGroup(String mktgMajorGroup) {
        this.mktgMajorGroup = mktgMajorGroup;
    }

    public int getNumberOfCars() {
        return this.numberOfCars;
    }

    public void setNumberOfCars(int numberOfCars) {
        this.numberOfCars = numberOfCars;
    }

    public float getLadingWeightPerCar() {
        return this.ladingWeightPerCar;
    }

    public void setLadingWeightPerCar(float ladingWeightPerCar) {
        this.ladingWeightPerCar = ladingWeightPerCar;
    }

    public int getNumberOfLocomotives() {
        return this.numberOfLocomotives;
    }

    public void setNumberOfLocomotives(int numberOfLocomotives) {
        this.numberOfLocomotives = numberOfLocomotives;
    }

    public String getMktgCarType() {
        return this.mktgCarType;
    }

    public void setMktgCarType(String mktgCarType) {
        this.mktgCarType = mktgCarType;
    }

    public String getCarOwner() {
        return this.carOwner;
    }

    public void setCarOwner(String carOwner) {
        this.carOwner = carOwner;
    }

    public float getEmptyReturnRatio() {
        return this.emptyReturnRatio;
    }

    public void setEmptyReturnRatio(float emptyReturnRatio) {
        this.emptyReturnRatio = emptyReturnRatio;
    }

    public String getTrainType() {
        return this.trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public String getCoalDumpingCity() {
        return this.coalDumpingCity;
    }

    public void setCoalDumpingCity(String coalDumpingCity) {
        this.coalDumpingCity = coalDumpingCity;
    }

    public List<PushersInfo> getPushers() {
        return this.pushers;
    }

    public void setPushers(List<PushersInfo> pushers) {
        this.pushers = pushers;
    }

    public List<SwitchEvent> getSwitchEvents() {
        return this.switchEvents;
    }

    public void setSwitchEvents(List<SwitchEvent> switchEvents) {
        this.switchEvents = switchEvents;
    }

    public ManualInput getManualInput() {
        return this.manualInput;
    }

    public void setManualInput(ManualInput manualInput) {
        this.manualInput = manualInput;
    }

    public List<UnitTrain> getUnitTrains() {
        return this.unitTrains;
    }

    public void setUnitTrains(List<UnitTrain> unitTrains) {
        this.unitTrains = unitTrains;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof UnitTrainInputs)) return false;
        final UnitTrainInputs other = (UnitTrainInputs) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$mktgMajorGroup = this.getMktgMajorGroup();
        final Object other$mktgMajorGroup = other.getMktgMajorGroup();
        if (!Objects.equals(this$mktgMajorGroup, other$mktgMajorGroup))
            return false;
        if (this.getNumberOfCars() != other.getNumberOfCars()) return false;
        if (Float.compare(this.getLadingWeightPerCar(), other.getLadingWeightPerCar()) != 0) return false;
        if (this.getNumberOfLocomotives() != other.getNumberOfLocomotives()) return false;
        final Object this$mktgCarType = this.getMktgCarType();
        final Object other$mktgCarType = other.getMktgCarType();
        if (!Objects.equals(this$mktgCarType, other$mktgCarType))
            return false;
        final Object this$carOwner = this.getCarOwner();
        final Object other$carOwner = other.getCarOwner();
        if (!Objects.equals(this$carOwner, other$carOwner)) return false;
        if (Float.compare(this.getEmptyReturnRatio(), other.getEmptyReturnRatio()) != 0) return false;
        final Object this$trainType = this.getTrainType();
        final Object other$trainType = other.getTrainType();
        if (!Objects.equals(this$trainType, other$trainType)) return false;
        final Object this$coalDumpingCity = this.getCoalDumpingCity();
        final Object other$coalDumpingCity = other.getCoalDumpingCity();
        if (!Objects.equals(this$coalDumpingCity, other$coalDumpingCity))
            return false;
        final Object this$pushers = this.getPushers();
        final Object other$pushers = other.getPushers();
        if (!Objects.equals(this$pushers, other$pushers)) return false;
        final Object this$switchEvents = this.getSwitchEvents();
        final Object other$switchEvents = other.getSwitchEvents();
        if (!Objects.equals(this$switchEvents, other$switchEvents))
            return false;
        final Object this$manualInput = this.getManualInput();
        final Object other$manualInput = other.getManualInput();
        if (!Objects.equals(this$manualInput, other$manualInput))
            return false;
        final Object this$unitTrains = this.getUnitTrains();
        final Object other$unitTrains = other.getUnitTrains();
        if (!Objects.equals(this$unitTrains, other$unitTrains))
            return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UnitTrainInputs;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $mktgMajorGroup = this.getMktgMajorGroup();
        result = result * PRIME + ($mktgMajorGroup == null ? 43 : $mktgMajorGroup.hashCode());
        result = result * PRIME + this.getNumberOfCars();
        result = result * PRIME + Float.floatToIntBits(this.getLadingWeightPerCar());
        result = result * PRIME + this.getNumberOfLocomotives();
        final Object $mktgCarType = this.getMktgCarType();
        result = result * PRIME + ($mktgCarType == null ? 43 : $mktgCarType.hashCode());
        final Object $carOwner = this.getCarOwner();
        result = result * PRIME + ($carOwner == null ? 43 : $carOwner.hashCode());
        result = result * PRIME + Float.floatToIntBits(this.getEmptyReturnRatio());
        final Object $trainType = this.getTrainType();
        result = result * PRIME + ($trainType == null ? 43 : $trainType.hashCode());
        final Object $coalDumpingCity = this.getCoalDumpingCity();
        result = result * PRIME + ($coalDumpingCity == null ? 43 : $coalDumpingCity.hashCode());
        final Object $pushers = this.getPushers();
        result = result * PRIME + ($pushers == null ? 43 : $pushers.hashCode());
        final Object $switchEvents = this.getSwitchEvents();
        result = result * PRIME + ($switchEvents == null ? 43 : $switchEvents.hashCode());
        final Object $manualInput = this.getManualInput();
        result = result * PRIME + ($manualInput == null ? 43 : $manualInput.hashCode());
        final Object $unitTrains = this.getUnitTrains();
        result = result * PRIME + ($unitTrains == null ? 43 : $unitTrains.hashCode());
        return result;
    }

    public String toString() {
        return "UnitTrainInputs(mktgMajorGroup=" + this.getMktgMajorGroup() + ", numberOfCars=" + this.getNumberOfCars() + ", ladingWeightPerCar=" + this.getLadingWeightPerCar() + ", numberOfLocomotives=" + this.getNumberOfLocomotives() + ", mktgCarType=" + this.getMktgCarType() + ", carOwner=" + this.getCarOwner() + ", emptyReturnRatio=" + this.getEmptyReturnRatio() + ", trainType=" + this.getTrainType() + ", coalDumpingCity=" + this.getCoalDumpingCity() + ", pushers=" + this.getPushers() + ", switchEvents=" + this.getSwitchEvents() + ", manualInput=" + this.getManualInput() + ", unitTrains=" + this.getUnitTrains() + ")";
    }

    public UnitTrainInputsBuilder toBuilder() {
        return new UnitTrainInputsBuilder().mktgMajorGroup(this.mktgMajorGroup).numberOfCars(this.numberOfCars).ladingWeightPerCar(this.ladingWeightPerCar).numberOfLocomotives(this.numberOfLocomotives).mktgCarType(this.mktgCarType).carOwner(this.carOwner).emptyReturnRatio(this.emptyReturnRatio).trainType(this.trainType).coalDumpingCity(this.coalDumpingCity).pushers(this.pushers).switchEvents(this.switchEvents).manualInput(this.manualInput).unitTrains(this.unitTrains);
    }

    public static class UnitTrainInputsBuilder {
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

        UnitTrainInputsBuilder() {
        }

        public UnitTrainInputs.UnitTrainInputsBuilder mktgMajorGroup(String mktgMajorGroup) {
            this.mktgMajorGroup = mktgMajorGroup;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder numberOfCars(int numberOfCars) {
            this.numberOfCars = numberOfCars;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder ladingWeightPerCar(float ladingWeightPerCar) {
            this.ladingWeightPerCar = ladingWeightPerCar;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder numberOfLocomotives(int numberOfLocomotives) {
            this.numberOfLocomotives = numberOfLocomotives;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder mktgCarType(String mktgCarType) {
            this.mktgCarType = mktgCarType;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder carOwner(String carOwner) {
            this.carOwner = carOwner;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder emptyReturnRatio(float emptyReturnRatio) {
            this.emptyReturnRatio = emptyReturnRatio;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder trainType(String trainType) {
            this.trainType = trainType;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder coalDumpingCity(String coalDumpingCity) {
            this.coalDumpingCity = coalDumpingCity;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder pushers(List<PushersInfo> pushers) {
            this.pushers = pushers;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder switchEvents(List<SwitchEvent> switchEvents) {
            this.switchEvents = switchEvents;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder manualInput(ManualInput manualInput) {
            this.manualInput = manualInput;
            return this;
        }

        public UnitTrainInputs.UnitTrainInputsBuilder unitTrains(List<UnitTrain> unitTrains) {
            this.unitTrains = unitTrains;
            return this;
        }

        public UnitTrainInputs build() {
            return new UnitTrainInputs(mktgMajorGroup, numberOfCars, ladingWeightPerCar, numberOfLocomotives, mktgCarType, carOwner, emptyReturnRatio, trainType, coalDumpingCity, pushers, switchEvents, manualInput, unitTrains);
        }

        public String toString() {
            return "UnitTrainInputs.UnitTrainInputsBuilder(mktgMajorGroup=" + this.mktgMajorGroup + ", numberOfCars=" + this.numberOfCars + ", ladingWeightPerCar=" + this.ladingWeightPerCar + ", numberOfLocomotives=" + this.numberOfLocomotives + ", mktgCarType=" + this.mktgCarType + ", carOwner=" + this.carOwner + ", emptyReturnRatio=" + this.emptyReturnRatio + ", trainType=" + this.trainType + ", coalDumpingCity=" + this.coalDumpingCity + ", pushers=" + this.pushers + ", switchEvents=" + this.switchEvents + ", manualInput=" + this.manualInput + ", unitTrains=" + this.unitTrains + ")";
        }
    }
}
