package com.nscorp.cost.calculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
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
}
