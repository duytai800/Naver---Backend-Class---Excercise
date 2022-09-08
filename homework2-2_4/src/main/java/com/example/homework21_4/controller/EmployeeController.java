package com.example.homework21_4.controller;

import com.example.homework21_4.entity.Employee;
import com.example.homework21_4.repository.EmployeeRepository;
import com.example.homework21_4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("")
    public ResponseEntity<?> getAllEmployees ( ){
        return ResponseEntity.ok(employeeService.getAllEmployees());
    }

    @GetMapping("{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable long id){
        return ResponseEntity.ok(employeeService.getEmployeeById(id));
    }

    @PostMapping("")
    public ResponseEntity<?> createEmployee (@RequestBody Employee employee){
        return ResponseEntity.ok(employeeService.createEmployee(employee));
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployee(id);
    }

    @GetMapping("/{id}/info")
    public ResponseEntity<?> getInfoById(@PathVariable Long id) {
        return ResponseEntity.ok(employeeService.getInfoById(id));
    }

}
