package com.pizzeria.demo.config;

import com.pizzeria.demo.model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Pizza margheritaPizza() {
        return new MargheritaPizza();
    }

    @Bean
    public Pizza hawaiianPizza() {
        return new HawaiianPizza();
    }

    @Bean
    public Pizza salamiPizza() {
        return new SalamiPizza();
    }

    @Bean
    public Topping cheeseTopping() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping hamTopping() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Topping onionTopping() {
        return new Topping("Onions", 0.69, 22);
    }

    @Bean
    public Topping pineappleTopping() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    public Topping salamiTopping() {
        return new Topping("Salami", 0.99, 86);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33l)", 1.29, 128);
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5l)", 1.29, 0);
    }

    @Bean
    public Drink wine() {
        return new Drink("Wine (0.751, 13%)", 7.49, 607);
    }

    @Bean
    public Menu menu() {
        List<Pizza> pizzas = Arrays.asList(margheritaPizza(), hawaiianPizza(), salamiPizza());
        List<Topping> toppings = Arrays.asList(cheeseTopping(), hamTopping(), onionTopping(), pineappleTopping(), salamiTopping());
        List<Drink> drinks = Arrays.asList(lemonade(), water(), wine());
        return new Menu(pizzas, toppings, drinks);
    }
}