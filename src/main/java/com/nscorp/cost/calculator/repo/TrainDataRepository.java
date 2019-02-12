package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.TrainData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface TrainDataRepository extends JpaRepository<TrainData, String> {

    @Query(value = "SELECT DISTINCT TRAIN_TYPE FROM TRAIN_DATA", nativeQuery = true)
    Set<String> getDistinctTrainType();
}
