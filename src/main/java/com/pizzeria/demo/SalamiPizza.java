package com.pizzeria.demo;

public class SalamiPizza extends Pizza {
    public SalamiPizza() {
        super("Salami Pizza", 5.99, 1160);
        addTopping("Salami", 0, 0); // Adjust price and calories if necessary
    }
}
