package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.TySwitchType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TySwitchTypeRepository extends JpaRepository<TySwitchType, String> {
}
