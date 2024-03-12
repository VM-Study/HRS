package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}