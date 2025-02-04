package com.pizzeria.demo.service;

import com.pizzeria.demo.model.Menu;
import com.pizzeria.demo.model.Pizza;
import com.pizzeria.demo.model.Topping;
import com.pizzeria.demo.model.Drink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MenuService {

    @Autowired
    private Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void addPizza(Pizza pizza) {
        menu.getPizzas().add(pizza);
    }

    public void addTopping(Topping topping) {
        menu.getToppings().add(topping);
    }

    public void addDrink(Drink drink) {
        menu.getDrinks().add(drink);
    }
}