package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.LocoData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocoDataRepository extends JpaRepository<LocoData, String> {
}
