package com.myapp.design_pattern;

import com.myapp.design_pattern.payment.PaymentService;
import com.myapp.design_pattern.restaurant.BeefBurgerRestaurant;
import com.myapp.design_pattern.restaurant.Burger;
import com.myapp.design_pattern.restaurant.Restaurant;
import com.myapp.design_pattern.restaurant.VeggieBurgerRestaurant;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		Restaurant beefBurgerRestaurant = new BeefBurgerRestaurant();
		Burger beefBurger = beefBurgerRestaurant.orderBurger();

		Restaurant veggieBurgerRestaurant = new VeggieBurgerRestaurant();
		Burger veggieBurger = veggieBurgerRestaurant.orderBurger();

		PaymentService paymentService = new PaymentService();
		paymentService.processPayment("crypto", 2000);
	}
}
