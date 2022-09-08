package com.example.homework21_4.task5_designpattern.factory;

import com.example.homework21_4.task5_designpattern.subclass.pc;
import com.example.homework21_4.task5_designpattern.subclass.server;
import com.example.homework21_4.task5_designpattern.supperclass.computer;

import java.util.Locale;

public class factory {
    public computer getComputer(String computer){
        computer = computer.toUpperCase();
        if(computer.equals("PC")){
            return new pc();
        }
        else return new server();
    }

}
