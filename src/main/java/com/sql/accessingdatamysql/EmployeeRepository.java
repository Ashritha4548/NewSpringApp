package com.sql.accessingdatamysql;

import com.sql.accessingdatamysql.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
