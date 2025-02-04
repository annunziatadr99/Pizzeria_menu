package com.pizzeria.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Drink implements MenuItem {
    private String name;
    private double price;
    private int calories;

}