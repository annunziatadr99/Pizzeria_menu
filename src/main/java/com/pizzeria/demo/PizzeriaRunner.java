package com.pizzeria.demo;

import com.pizzeria.demo.model.*;
import com.pizzeria.demo.service.MenuService;
import com.pizzeria.demo.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;

@Component
public class PizzeriaRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(PizzeriaRunner.class);

    @Autowired
    private MenuService menuService;

    @Autowired
    private OrderService orderService;

    @Value("${cover.cost}")
    private double coverCost;

    @Override
    public void run(String... args) throws Exception {
        // Initialize menu
        menuService.addPizza(new MargheritaPizza());
        menuService.addPizza(new HawaiianPizza());
        menuService.addPizza(new SalamiPizza());
        menuService.addTopping(new Topping("Cheese", 0.69, 92));
        menuService.addTopping(new Topping("Ham", 0.99, 35));
        menuService.addTopping(new Topping("Onions", 0.69, 22));
        menuService.addTopping(new Topping("Pineapple", 0.79, 24));
        menuService.addTopping(new Topping("Salami", 0.99, 86));
        menuService.addDrink(new Drink("Lemonade (0.33l)", 1.29, 128));
        menuService.addDrink(new Drink("Water (0.5l)", 1.29, 0));
        menuService.addDrink(new Drink("Wine (0.751, 13%)", 7.49, 607));

        // Create an order
        Order order = orderService.createOrder(1, 2, coverCost);
        order.addItem(menuService.getMenu().getPizzas().get(0)); // Adding Margherita Pizza
        order.addItem(menuService.getMenu().getDrinks().get(1)); // Adding Water

        // Print menu and order
        logger.info("Example menu:");
        logger.info(menuService.getMenu().toString());
        logger.info("Order details:");
        logger.info(order.toString());
    }
}
