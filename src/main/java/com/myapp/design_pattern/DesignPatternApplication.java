package com.myapp.design_pattern;

import com.myapp.design_pattern.coffee_shop.Beverage;
import com.myapp.design_pattern.coffee_shop.Coffee;
import com.myapp.design_pattern.coffee_shop.Tea;
import com.myapp.design_pattern.order_process.DigitalOrder;
import com.myapp.design_pattern.order_process.OrderProcessTemplate;
import com.myapp.design_pattern.order_process.RegularOrder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	private void coffeeShop() {
		System.out.println("Preparing Coffee...");
		Beverage coffee = new Coffee();
		coffee.prepareBeverage();
		System.out.println();

		System.out.println("Preparing Tea...");
		Beverage tea = new Tea();
		tea.prepareBeverage();
		System.out.println();
	}

	private void orderProcess() {
		System.out.println("Processing regular order:");
		OrderProcessTemplate regularOrder = new RegularOrder();
		regularOrder.processOrder();
		System.out.println();

		System.out.println("Processing digital order:");
		OrderProcessTemplate digitalOrder = new DigitalOrder();
		digitalOrder.processOrder();
		System.out.println();
	}

	@Override
	public void run(String... args) throws Exception {
		coffeeShop();
		orderProcess();
	}
}
