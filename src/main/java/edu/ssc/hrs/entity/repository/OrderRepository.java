package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}