package com.example.homework21_4.controller;

import com.example.homework21_4.entity.Department;
import com.example.homework21_4.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping ("")
    public ResponseEntity<?>getAllDepartments(){
        return ResponseEntity.ok(departmentService.getAllDepartments());
    }

    @GetMapping("{id}")
    public ResponseEntity<?>findDepartments(@PathVariable long id){
        return ResponseEntity.ok(departmentService.getDepartmentById(id));
    }

    @PostMapping("")
    public ResponseEntity<?> createDepartment(@RequestBody Department department){
        return ResponseEntity.ok(departmentService.createDepartment(department));
    }

    @DeleteMapping("/{id}")
    public void deleteDepartment(@PathVariable long id ){
         departmentService.deleteDepartment(id);
    }

    @GetMapping("/{id}/countEmployee")
    public ResponseEntity<?> getDepartmentWithCount(@PathVariable Long id){
        return ResponseEntity.ok(departmentService.getDepartmentWithCountEmployee(id));
    }
}
