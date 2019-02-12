package com.nscorp.cost.calculator.validation;

import com.nscorp.cost.calculator.db.*;
import com.nscorp.cost.calculator.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class LookUpUtils {
    private final Set<String> carOwnerTypeList = new HashSet<>();
    private final Set<String> majorGroupTypeList = new HashSet<>();
    private final Set<String> carTypeList = new HashSet<>(100);
    private final Set<String> divisionList = new HashSet<>(20);
    private final Set<String> switchTypeList = new HashSet<>(5);
    private final Set<String> trainTypeList = new HashSet<>(25);
    private final Set<String> dumpingCityList = new HashSet<>(3000);
    @Autowired
    private CityRepository cityRepository;
    @Autowired
    private TrainDataRepository tdRepository;
    @Autowired
    private MktgCarRepository mktgCarRepository;
    @Autowired
    private TySwitchTypeRepository stRepository;
    @Autowired
    private DumpingChargeRepository dcRepository;
    @Autowired
    private DivisionRepository divisionRepository;
    @Autowired
    private MajorGroupTypeRepository mgtRepository;

    public boolean isValidTrainType(String value) {
        return trainTypeList.contains(value.trim().toUpperCase()) || refreshAndTestTrainTypeList(value);
    }

    public boolean isValidCarType(String carType) {
        return carTypeList.contains(carType.trim().toUpperCase()) || refreshAndTestCarTypeList(carType);
    }

    public boolean isValidCarOwner(String carOwner) {
        return carOwnerTypeList.contains(carOwner.trim().toUpperCase()) || refreshAndTestCarOwnerList(carOwner);
    }

    public boolean isValidDivision(String division) {
        return divisionList.contains(division.trim().toUpperCase()) || refreshAndTestDivisionList(division);
    }

    public boolean isValidCity(String city) {
        return dumpingCityList.contains(city.trim().toUpperCase()) || refreshAndTestDumpingCityList(city);
    }

    public boolean isValidSwitchType(String switchType) {
        return switchTypeList.contains(switchType.trim().toUpperCase()) || refreshAndTestSwitchTypeList(switchType);
    }

    public boolean isValidMajorGroupType(String value) {
        return majorGroupTypeList.contains(value.trim().toUpperCase()) || refreshAndTestMajorGroupTypeList(value);
    }

    private boolean refreshAndTestTrainTypeList(String value) {
        trainTypeList.clear();
        trainTypeList.addAll(tdRepository.getDistinctTrainType());
        return trainTypeList.contains(value.trim().toUpperCase());
    }

    private boolean refreshAndTestCarTypeList(String value) {
        carTypeList.clear();
        carTypeList.addAll(mktgCarRepository.getDistinctByMarketingCarType());
        return carTypeList.contains(value.trim().toUpperCase());
    }

    private boolean refreshAndTestCarOwnerList(String value) {
        carOwnerTypeList.clear();
        carOwnerTypeList.addAll(mktgCarRepository.getDistinctByCarOwnerType());
        return carOwnerTypeList.contains(value.trim().toUpperCase());
    }

    private boolean refreshAndTestMajorGroupTypeList(String value) {
        majorGroupTypeList.clear();
        majorGroupTypeList.addAll(getAllMajorGroupType());
        return majorGroupTypeList.contains(value.trim().toUpperCase());
    }

    private Set<String> getAllMajorGroupType() {
        return mgtRepository.findAll().parallelStream().map(MajorGroupType::getMajorGroupType).collect(Collectors.toSet());
    }

    private boolean refreshAndTestSwitchTypeList(String value) {
        switchTypeList.clear();
        switchTypeList.addAll(getAllSwitchType());
        return switchTypeList.contains(value.trim().toUpperCase());
    }

    private boolean refreshAndTestDivisionList(String value) {
        divisionList.clear();
        divisionList.addAll(getAllDivisionList());
        return divisionList.contains(value.trim().toUpperCase());
    }

    private boolean refreshAndTestDumpingCityList(String city) {
        dumpingCityList.clear();
        dumpingCityList.addAll(getAllCityList());
        dumpingCityList.addAll(getDumpingCityList());
        return dumpingCityList.contains(city.trim().toUpperCase());
    }

    private Set<String> getDumpingCityList() {
        return dcRepository.findAll().parallelStream().map(DumpingCharge::getCity).collect(Collectors.toSet());
    }

    private Set<String> getAllDivisionList() {
        return divisionRepository.findAll().parallelStream().map(Division::getDivision).collect(Collectors.toSet());
    }

    private Set<String> getAllSwitchType() {
        return stRepository.findAll().parallelStream().map(TySwitchType::getSwitchType).collect(Collectors.toSet());
    }

    private Set<String> getAllCityList() {
        return cityRepository.findAll().parallelStream().map(StateCity::getCityName).collect(Collectors.toSet());
    }
}
