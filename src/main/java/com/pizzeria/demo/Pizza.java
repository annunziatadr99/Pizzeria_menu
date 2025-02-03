package com.pizzeria.demo;




import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void addTopping(String topping, double price, int calories) {
        ingredients.add(topping);
        this.price += price;
        this.calories += calories;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", ingredients=" + ingredients +
                ", price=" + price +
                ", calories=" + calories +
                '}';
    }
}