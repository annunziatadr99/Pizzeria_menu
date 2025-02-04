package com.pizzeria.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;



    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = new ArrayList<>(pizzas);
        this.toppings = new ArrayList<>(toppings);
        this.drinks = new ArrayList<>(drinks);
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