package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.RateIndex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RateIndexRepository extends JpaRepository<RateIndex, Integer> {
}
