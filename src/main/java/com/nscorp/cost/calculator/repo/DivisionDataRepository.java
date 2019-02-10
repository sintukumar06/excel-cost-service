package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.DivisionData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionDataRepository extends JpaRepository<DivisionData, String> {
}
