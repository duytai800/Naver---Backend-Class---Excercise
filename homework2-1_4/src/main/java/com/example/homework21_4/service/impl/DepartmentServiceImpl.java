package com.example.homework21_4.service.impl;

import com.example.homework21_4.entity.Department;
import com.example.homework21_4.repository.DepartmentRepository;
import com.example.homework21_4.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(Department department){
        departmentRepository.save(department);
        return department;
    }

    @Override
    public void deleteDepartment(long id){
        departmentRepository.deleteById(id);
    }

    @Override
    public List<Department> getAllDepartments(){
        return departmentRepository.findAll();
    }

    @Override
    public Optional<Department> getDepartmentById(Long id){
        return departmentRepository.findById(id);
    }
}
