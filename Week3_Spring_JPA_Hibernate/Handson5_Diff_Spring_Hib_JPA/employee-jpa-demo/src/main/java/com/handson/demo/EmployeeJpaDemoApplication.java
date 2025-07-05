package com.handson.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.handson.model.Employee;
import com.handson.service.EmployeeService;

@SpringBootApplication
public class EmployeeJpaDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(EmployeeJpaDemoApplication.class, args);

        EmployeService service = context.getBean(EmployeService.class);

        Employee emp = new Employee();
        emp.setName("John");
        emp.setDepartment("HR");

        service.addEmployee(emp);
        System.out.println("Employee saved!");
    }
}
