package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DivisionRepository extends JpaRepository<Division, String> {
}
