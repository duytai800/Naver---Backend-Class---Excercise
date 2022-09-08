package com.example.homework32_1.dto;

import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;
@Data
public class DepartmentDto {
    private Long departmentId;
    @Size(min = 10, max = 50, message = "Name: 10-50 characters only")
    @NotBlank(message = "Name cannot be empty")
    private String departmentName;

    @NotBlank(message = "Discription cannot be empty")
    private String departmentDiscription;
    @Valid
    private List<EmployeeDto> employeeDtoList;

}
