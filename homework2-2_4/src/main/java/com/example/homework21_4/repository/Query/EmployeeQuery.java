package com.example.homework21_4.repository.Query;

import com.example.homework21_4.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface EmployeeQuery {
    @Select("SELECT * FROM employee WHERE employeeId=#{id}")
    Employee findEmployeeById(Long id);
}
