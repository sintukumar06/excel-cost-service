package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.StateCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<StateCity, String> {
}
