package com.pizzeria.demo.model;

public class HawaiianPizza extends Pizza {
    public HawaiianPizza() {
        super("Hawaiian Pizza", 6.49, 1024);
        addTopping("Ham", 0, 0); // Adjust price and calories if necessary
        addTopping("Pineapple", 0, 0); // Adjust price and calories if necessary
    }
}