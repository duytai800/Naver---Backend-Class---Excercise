package com.example.homework21_4.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
@Data
@Setter
@Getter
@Component
public class Employee {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private Date birthDay;
    private String gender;
    @ManyToOne
    @JoinColumn(name = "departmentId", referencedColumnName = "departmentId")
    private Department department;

//    @Id
//    @GeneratedValue
//    @Column(name = "employeeId", nullable = false)
//    private int employee_Id;
//
//    @Column(name = "name", nullable = false)
//    private String employeeName;
//
//    @Temporal(TemporalType.DATE)
//    @Column(name = "birth_date")
//    private Date employeeBirthDate;
//
//    @Column(name = "gender", nullable = false)
//    private String employeeGender;
//
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "department_id", nullable = false)
//    @EqualsAndHashCode.Exclude
//    @ToString.Exclude
//    @JsonIgnore
//    private Department department;

}
