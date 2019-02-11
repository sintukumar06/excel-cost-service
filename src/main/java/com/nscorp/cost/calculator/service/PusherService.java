package com.nscorp.cost.calculator.service;

import com.nscorp.cost.calculator.model.PushersInfo;
import com.nscorp.cost.calculator.model.SummaryData;
import com.nscorp.cost.calculator.model.UnitTrainInputs;
import com.nscorp.cost.calculator.repo.DivisionDataRepository;
import com.nscorp.cost.calculator.repo.LocoDataRepository;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class PusherService {
    public static final String SUPER_CORE_LINK_RATING = "A";
    private static final String NONE_DIVISION = "NONE";
    @Autowired
    private DivisionDataRepository gtmRepository;
    @Autowired
    private LocoDataRepository locoRepository;

    protected List<PushersInfo> getPusherData(final UnitTrainInputs inputs) {
        return IntStream.range(0, ListUtils.emptyIfNull(inputs.getPushers()).size())
                .mapToObj(i -> isValidDivision(inputs, i) ? getDummyPusherData() : getPusherData(inputs, i))
                .collect(Collectors.toList());
    }

    private PushersInfo getPusherData(UnitTrainInputs inputs, int i) {
        PushersInfo pusher = inputs.getPushers().get(i);
        double pusherCostPerTrain = createSummaryData(inputs, pusher).getPusherCost();
        return pusher.toBuilder()
                .pusherCostPerTrain(pusherCostPerTrain)
                .pusherCostPerCar(pusherCostPerTrain / inputs.getNumberOfCars())
                .build();
    }

    private PushersInfo getDummyPusherData() {
        return PushersInfo.builder().build();
    }

    private boolean isValidDivision(UnitTrainInputs inputs, int i) {
        return NONE_DIVISION.equalsIgnoreCase(inputs.getPushers().get(i).getDivision());
    }

    private SummaryData createSummaryData(final UnitTrainInputs inputs, final PushersInfo pusher) {
        return SummaryData.builder()
//                .trainStartCost(trainService.getTrainStartCost(inputs, i))
                .locomotiveEconomicCost(getLocoEconomicsCost(pusher))
                .gaMechanicalCost(getGAMechanicalCost(inputs, pusher))
                .gaTransportationCost(getGATransportationCost(pusher))
                .gaEngineeringCost(getGAEngineeringCost(inputs, pusher))
                .networkEconomicCost(getNetworkEconomicCost(inputs, pusher))
                .fuelingLocomotivesCost(getFuelingLocomotiveCost(inputs, pusher))
                .communicationAndSignalCost(getCommunicationAndSignalCost(pusher))
                .locoOpsAndMaintenanceCost(getLocoOpsAndMaintenanceCost(inputs, pusher))
                .bridgeAndTrackMaintenanceCost(getBridgeAndTrackMaintenanceCost(inputs, pusher))
                .build();
    }

    private double getLocoEconomicsCost(PushersInfo pusher) {
        return pusher.getNumberOfPushers() * pusher.getPusherDaysOnline() * getLocoEconomicsCostPerDays();
    }

    private double getNetworkEconomicCost(UnitTrainInputs inputs, PushersInfo pusher) {
        return calculateCost(inputs, pusher, getNetworkEconomicByGTM(pusher));
    }

    private double getGATransportationCost(PushersInfo pusher) {
        return pusher.getLoadedMiles() * getGaTransportByCW(pusher);
    }

    private double getGAMechanicalCost(UnitTrainInputs inputs, PushersInfo pusher) {
        return calculateCost(inputs, pusher, getGaMechanicalByGTM(pusher));
    }

    private double getGAEngineeringCost(UnitTrainInputs inputs, PushersInfo pusher) {
        return calculateCost(inputs, pusher, getGaEngineeringByGTM(pusher));
    }

    private double getFuelingLocomotiveCost(UnitTrainInputs inputs, PushersInfo pusher) {
        return calculateCost(inputs, pusher, getFuelingLocomotiveByGTM(pusher));
    }

    private double getCommunicationAndSignalCost(PushersInfo pusher) {
        return pusher.getLoadedMiles() * pusher.getNumberOfPushers() * getCommunicationAndSignalByCM(pusher);
    }

    private double getLocoEconomicsCostPerDays() {
        return locoRepository.findOne(SUPER_CORE_LINK_RATING).getLocoEconomicsCostPerDays();
    }

    private double getGaTransportByCW(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getGATransportbyCW();
    }

    private double getGaMechanicalByGTM(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getGAMechanicalByGTM();
    }

    private double getNetworkEconomicByGTM(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getNetworkEconomicByGTM();
    }

    private double getLocoOpsAndMaintenanceCost(UnitTrainInputs inputs, PushersInfo pusher) {
        return calculateCost(inputs, pusher, getLocoOpsMaintenanceByGTM(pusher));
    }

    private double getLocoOpsMaintenanceByGTM(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getLocoOpsMaintenanceByGTM();
    }

    private double getBridgeAndTrackMaintenanceCost(UnitTrainInputs inputs, PushersInfo pusher) {
        return calculateCost(inputs, pusher, getBridgeAndTrackMaintenanceByGTM(pusher));
    }

    private double calculateCost(UnitTrainInputs inputs, PushersInfo pusher, double fuelingLocomotiveByGTM) {
        return pusher.getLoadedMiles() * pusher.getNumberOfPushers()
                * getLocoWeight(inputs) * fuelingLocomotiveByGTM;
    }

    private double getBridgeAndTrackMaintenanceByGTM(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getBridgeAndTrackMaintenanceByGTM();
    }

    private double getCommunicationAndSignalByCM(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getCommunicationAndSignalByCM();
    }

    private float getLocoWeight(UnitTrainInputs inputs) {
        return isManualLocoWeightPresent(inputs) ? inputs.getManualInput().getLocoWeight() : 0f;
    }

    private boolean isManualLocoWeightPresent(UnitTrainInputs inputs) {
        return !Objects.isNull(inputs.getManualInput()) && inputs.getManualInput().getLocoWeight() > 0;
    }

    private double getGaEngineeringByGTM(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getGAEngineeringByGTM();
    }

    private double getFuelingLocomotiveByGTM(PushersInfo pusher) {
        return gtmRepository.getOne(pusher.getDivision().toUpperCase()).getFuelingLocomotiveByGTM();
    }
}
