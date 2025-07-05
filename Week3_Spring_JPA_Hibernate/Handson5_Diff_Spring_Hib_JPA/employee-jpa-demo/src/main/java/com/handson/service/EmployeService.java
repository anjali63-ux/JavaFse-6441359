package com.handson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.handson.model.Employee;
import com.handson.repository.EmployeeRepo;

@Service
public class EmployeService {

    @Autowired
    private EmployeRepo employeeRepository;

    @Transactional
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
}
