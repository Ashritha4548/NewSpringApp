package com.sql.accessingdatamysql.Repository;

import com.sql.accessingdatamysql.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
