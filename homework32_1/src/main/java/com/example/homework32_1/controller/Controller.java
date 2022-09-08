package com.example.homework32_1.controller;

import com.example.homework32_1.dto.DepartmentDto;
import com.example.homework32_1.dto.EmployeeDto;
import com.example.homework32_1.service.impl.DepartmentServiceImpl;
import com.example.homework32_1.service.impl.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/likelion")
public class Controller {
    @Autowired
    DepartmentServiceImpl departmentService;

    @Autowired
    EmployeeServiceImpl employeeService;

    @GetMapping("") public String Test(){
        return "Test port, template, trace";
    }

    @GetMapping("/testdepartment")
    public ResponseEntity<?> testDepartment(@RequestBody @Valid DepartmentDto departmentDto) {
        return ResponseEntity.ok(departmentService.getDepartmentDto(departmentDto));
    }
    @GetMapping("/testemployee")
    public ResponseEntity<?> testEmployee(@RequestBody @Valid EmployeeDto employeeDto){
        return ResponseEntity.ok(employeeService.getEmployeeDto(employeeDto));
    }

}
