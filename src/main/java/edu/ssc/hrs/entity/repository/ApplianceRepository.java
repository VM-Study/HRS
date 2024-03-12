package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.Appliance;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplianceRepository extends JpaRepository<Appliance, Long> {
}