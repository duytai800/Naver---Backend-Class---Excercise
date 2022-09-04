package com.example.homework21_4.service.impl;

import com.example.homework21_4.entity.Employee;
import com.example.homework21_4.repository.DepartmentRepository;
import com.example.homework21_4.repository.EmployeeRepository;
import com.example.homework21_4.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee){
        employeeRepository.save(employee);
        return employee;
    }

    @Override
    public void deleteEmployee(long id){
        employeeRepository.deleteById(id);
    }
    @Override
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }
//    @Override
//    public Employee updateEmployee(Long id, Employee employee){
//
//    }
    @Override
    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
    }

}
