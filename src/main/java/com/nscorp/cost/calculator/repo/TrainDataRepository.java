package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.TrainData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainDataRepository extends JpaRepository<TrainData, String> {
}
