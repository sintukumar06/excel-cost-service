package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.TerminalYard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TerminalYardRepository extends JpaRepository<TerminalYard, String> {
}
