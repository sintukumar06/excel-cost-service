package com.nscorp.cost.calculator.model;

import com.nscorp.cost.calculator.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
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
}
