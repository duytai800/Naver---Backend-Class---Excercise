package com.example.homework21_4.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Department")
@Data
@Setter
@Getter
@Component
public class Department {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "department")
    private Set<Employee> employees;
//
//    @Id
//    @GeneratedValue
//    @Column(name="departmentId",nullable = false)
//    private int dept_Id;
//
//    @Column(name = "dept_name", nullable = false)
//    private String deptName;
//
//    @Column(name = "description", nullable = true)
//    private String deptDescription;
//
//    @OneToMany(mappedBy = "department", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    @JsonManagedReference
//    private Set<Employee> employees;
}
