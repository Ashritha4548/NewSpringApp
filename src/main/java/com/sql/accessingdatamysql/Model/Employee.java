package com.sql.accessingdatamysql.Model;

import jakarta.persistence.*;

import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.annotations.CreationTimestamp;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.sql.Timestamp;


@Entity
@EntityListeners(AuditingEntityListener.class)
@Data
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer EmpID;
    //private String EmpID = String.format("%04d", random.nextInt(10000));

    private String EmpName;
    private Integer EmpAge;
    private String EmpDesignation;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Timestamp CreatedDate;

    @UpdateTimestamp
    @Column(nullable = false)
    private Timestamp LastModifiedDate;



}