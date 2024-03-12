package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}