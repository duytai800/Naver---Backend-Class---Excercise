package com.example.homework21_4.dto;

import com.example.homework21_4.entity.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeInfoDto {
    EmployeeDto employeeDto;
    Department departmentDto;
}
