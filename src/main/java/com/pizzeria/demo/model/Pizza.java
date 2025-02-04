package com.pizzeria.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
public abstract class Pizza implements MenuItem {

    protected String name;
    protected List<String> ingredients = new ArrayList<>();
    protected double price;
    protected int calories;

    public Pizza(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
        ingredients.add("Tomato");
        ingredients.add("Cheese");
    }



    public void addTopping(String topping, double price, int calories) {
        ingredients.add(topping);
        this.price += price;
        this.calories += calories;
    }


}