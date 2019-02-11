package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.DumpingCharge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DumpingChargeRepository extends JpaRepository<DumpingCharge, String> {
}
