package com.pizzeria.demo;

import com.pizzeria.demo.model.*;
import com.pizzeria.demo.service.MenuService;
import com.pizzeria.demo.service.OrderService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private MenuService menuService;

	@Autowired
	private OrderService orderService;

	@Autowired
	private Menu menu;

	@Value("${cover.cost}")
	private double coverCost;

	private Order order;

	@BeforeEach
	public void setUp() {
		order = orderService.createOrder(1, 2, coverCost);
	}

	@Test
	void contextLoads() {
		// This can be used to check if the context loads successfully
	}

	@Test
	void testMenuInitialization() {
		assertEquals(3,menu.getPizzas().size(), "Number of pizzas should be 6");
		assertEquals(5, menu.getToppings().size(), "Number of toppings should be 5");
		assertEquals(3, menu.getDrinks().size(), "Number of drinks should be 3");
	}

	@Test
	void testAddPizza() {
		Pizza newPizza = new SalamiPizza();
		menuService.addPizza(newPizza);
		assertEquals(4, menu.getPizzas().size(), "Number of pizzas should be 4 after adding a new pizza");
	}

	@Test
	void testOrderCalculation() {
		order.addItem(menuService.getMenu().getPizzas().get(0)); // Adding Margherita Pizza
		order.addItem(menuService.getMenu().getDrinks().get(1)); // Adding Water

		double expectedTotal = menuService.getMenu().getPizzas().get(0).getPrice() +
				menuService.getMenu().getDrinks().get(1).getPrice() +
				2 * coverCost;

		assertEquals(expectedTotal, order.getTotalAmount(), 0.01, "Total amount should be calculated correctly");
	}

	@ParameterizedTest
	@CsvSource({
			"Cheese, 0.69",
			"Ham, 0.99",
			"Onions, 0.69",
			"Pineapple, 0.79",
			"Salami, 0.99"
	})
	void testToppingPrices(String toppingName, double expectedPrice) {
		Topping topping = new Topping(toppingName, expectedPrice, 0);
		assertEquals(expectedPrice, topping.getPrice(), 0.01, "Topping price should be correct");
	}

	@Test
	void testOrderStatusUpdate() {
		orderService.updateOrderStatus(order, "ready");
		assertEquals("ready", order.getStatus(), "Order status should be updated to 'ready'");
	}
}