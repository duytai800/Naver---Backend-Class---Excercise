package com.example.homework21_4.service;

import com.example.homework21_4.entity.Department;
import com.example.homework21_4.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface DepartmentService {
    public Department createDepartment(Department department);
    public void deleteDepartment(long id);
    public List<Department> getAllDepartments();
    public Optional<Department> getDepartmentById(Long id);
    //public Department updateDepartment(Long id, Department department);
}
