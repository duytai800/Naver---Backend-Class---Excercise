package com.example.homework21_4.task5_designpattern.subclass;

import com.example.homework21_4.task5_designpattern.supperclass.computer;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class pc implements computer {
    @Override
    public String getType() {
        return "Pc";
    }
}
