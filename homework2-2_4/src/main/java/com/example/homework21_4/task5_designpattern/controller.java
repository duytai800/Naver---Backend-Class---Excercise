package com.example.homework21_4.task5_designpattern;

import com.example.homework21_4.task5_designpattern.factory.factory;
import com.example.homework21_4.task5_designpattern.supperclass.computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class controller {
    @Autowired
    factory factory;

    @GetMapping("/{something}")
    public String getPcOrServer(@PathVariable String something){
        computer computer = factory.getComputer(something);
        System.out.println("Type:"+ something);
        System.out.println(computer.getType());
        return computer.getType();
    }
}
