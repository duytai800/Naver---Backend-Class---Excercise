package com.example.homework32_1.service.impl;

import com.example.homework32_1.dto.DepartmentDto;
import com.example.homework32_1.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {
    private Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Override
    public DepartmentDto getDepartmentDto (DepartmentDto departmentDto){
        logger.info("Input: {}", departmentDto.toString());
        return departmentDto;
    }
}
