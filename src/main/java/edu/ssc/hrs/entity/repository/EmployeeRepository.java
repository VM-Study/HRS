package edu.ssc.hrs.entity.repository;

import edu.ssc.hrs.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}