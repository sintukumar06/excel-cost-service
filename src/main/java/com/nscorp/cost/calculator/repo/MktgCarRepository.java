package com.nscorp.cost.calculator.repo;

import com.nscorp.cost.calculator.db.MktgCarType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface MktgCarRepository extends JpaRepository<MktgCarType, String> {

    @Query(value = "SELECT DISTINCT MARKETING_CAR_TYPE FROM MKTG_CAR_TYPE_DATA ", nativeQuery = true)
    Set<String> getDistinctByMarketingCarType();

    @Query(value = "SELECT DISTINCT CAR_OWNER FROM MKTG_CAR_TYPE_DATA ", nativeQuery = true)
    Set<String> getDistinctByCarOwnerType();
}
