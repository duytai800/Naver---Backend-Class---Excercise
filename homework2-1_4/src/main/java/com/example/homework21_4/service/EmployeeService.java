package com.example.homework21_4.service;

import com.example.homework21_4.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    public Employee createEmployee(Employee employee);
    public void deleteEmployee(long id);
    public List<Employee> getAllEmployees();
    //public Employee updateEmployee(Long id, Employee employee);
    public Optional<Employee> getEmployeeById(Long id);
}
