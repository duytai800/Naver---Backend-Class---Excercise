package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CurrencyModel {
    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private int port;
}
