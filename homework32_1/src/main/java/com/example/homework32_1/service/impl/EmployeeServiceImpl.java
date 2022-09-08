package com.example.homework32_1.service.impl;

import com.example.homework32_1.dto.DepartmentDto;
import com.example.homework32_1.dto.EmployeeDto;
import com.example.homework32_1.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);
    @Override
    public EmployeeDto getEmployeeDto (EmployeeDto employeeDto){
            logger.info("Input: {}", employeeDto.toString());
            return employeeDto;
    }
}
