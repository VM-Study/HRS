package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
}