package com.pizzeria.demo.model;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu() {
    }

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(List<Drink> drinks) {
        this.drinks = drinks;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pizzas\n");
        for (Pizza pizza : pizzas) {
            sb.append(pizza.getName()).append(" (").append(String.join(", ", pizza.getIngredients())).append(")\n");
        }
        sb.append("\nToppings\n");
        for (Topping topping : toppings) {
            sb.append(topping.getName()).append("\n");
        }
        sb.append("\nDrinks\n");
        for (Drink drink : drinks) {
            sb.append(drink.getName()).append("\n");
        }
        return sb.toString();
    }
}