package com.sql.accessingdatamysql.Controller;

import com.sql.accessingdatamysql.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sql.accessingdatamysql.Model.Employee;


import java.sql.Timestamp;
import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    private Employee employeeEntity = new Employee();


   /*@PostMapping("/Employee")
    public String createEmployee() {
        employeeEntity.setEmpID(12);
        employeeEntity.setEmpName("Sravan");
        employeeEntity.setEmpAge(30);
        employeeEntity.setEmpDesignation("Manager");
        employeeRepository.save(employeeEntity);
        return "User Added Successfully";
    } */

    @GetMapping("/Employee")
    public @ResponseBody List<Employee> getAllEmployee() {
        System.out.println(employeeRepository.findAll());
        return employeeRepository.findAll();
    }
    @PostMapping("/employees")
    Employee newEmployee(@RequestBody Employee newEmployee) {
        return employeeRepository.save(newEmployee);
    }

    @DeleteMapping("employee/{EmpId}")
    public void deleteemployee(@PathVariable int EmpId) {

        employeeRepository.deleteById(EmpId);
    }
}