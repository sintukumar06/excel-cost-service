package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.DivisionData;
import com.nscorp.cost.calculator.db.GeneralAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralAdminRepository extends JpaRepository<GeneralAdmin, String> {
}
