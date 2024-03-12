package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.Conference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}