package com.pizzeria.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class PizzeriaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(PizzeriaApplication.class, args);
		Menu menu = context.getBean(Menu.class);
		System.out.println("Pizzeria da Totò - Menu:");
		System.out.println(menu);
	}
}