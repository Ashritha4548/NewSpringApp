package com.sql.accessingdatamysql.Controller;

import com.sql.accessingdatamysql.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sql.accessingdatamysql.Model.Employee;


import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    private Employee employeeEntity = new Employee();

@PostMapping("/Employee")
    public String createEmployee(){
    employeeEntity.setEmpID(12);
    employeeEntity.setEmpName("Sravan");
    employeeEntity.setEmpAge(30);
    employeeEntity.setEmpDesignation("Manager");
    employeeRepository.save (employeeEntity);
    return "User Added Successfully";
    }

    @GetMapping("/Employee")
public List<Employee> getAllEmployee(){
    return employeeRepository.findAll();

}
}

