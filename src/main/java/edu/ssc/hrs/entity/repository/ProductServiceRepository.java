package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.ProductService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductServiceRepository extends JpaRepository<ProductService, Long> {
}