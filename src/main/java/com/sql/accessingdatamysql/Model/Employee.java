package com.sql.accessingdatamysql.Model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer EmpID;
    private String EmpName;
    private Integer EmpAge;
    private String EmpDesignation;


}