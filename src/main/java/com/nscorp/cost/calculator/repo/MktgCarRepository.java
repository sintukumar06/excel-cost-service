package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.MktgCarType;
import com.nscorp.cost.calculator.db.MktgCarTypeId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MktgCarRepository extends JpaRepository<MktgCarType, MktgCarTypeId> {
}
