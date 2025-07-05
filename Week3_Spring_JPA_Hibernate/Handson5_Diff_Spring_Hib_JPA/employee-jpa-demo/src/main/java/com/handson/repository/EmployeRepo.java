package com.handson.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.handson.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
}
