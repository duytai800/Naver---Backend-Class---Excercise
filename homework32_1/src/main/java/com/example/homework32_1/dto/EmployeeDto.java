package com.example.homework32_1.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Date;
@Data
public class EmployeeDto {
    private Long employeeId;
    @Size(min = 10, max = 50, message = "Name: 10-50 characters only")
    @NotBlank(message = "Name cannot be empty")
    private String name;
    private Date birthDay;
    private String gender;
    @Email(regexp = "([a-zA-Z0-9]+)([\\.{1}])?([a-zA-Z0-9]+)\\@gmail([\\.])com", message = "Gmail: Wrong validation")
    @NotBlank(message = "Email cannot be empty")
    private String email;

}
