package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.MajorGroupType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MajorGroupTypeRepository extends JpaRepository<MajorGroupType, String> {
}
