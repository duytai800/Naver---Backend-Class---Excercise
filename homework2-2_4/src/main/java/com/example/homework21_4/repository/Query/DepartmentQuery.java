package com.example.homework21_4.repository.Query;
import com.example.homework21_4.entity.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
@Mapper
public interface DepartmentQuery {
    @Select("SELECT count(EMPLOYEE.employeeId) FROM EMPLOYEE WHERE EMPLOYEE.employeeId=#{id}")
    Long count(Long id);

    @Select("SELECT * FROM DEPARTMENT WHERE id=#{id}")
    Department findDepartmentById(Long id);
}
