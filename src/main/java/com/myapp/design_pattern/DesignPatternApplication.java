package com.myapp.design_pattern;

import com.myapp.design_pattern.user.Pizza;
import com.myapp.design_pattern.user.PizzaCookDirector;
import com.myapp.design_pattern.user.User;
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
		User user = new User.UserBuilder("Alice", "Johnson")
				.age(28)
				.email("alice@example.com")
				.build();

		System.out.println(user);

		// Using builder directly
		Pizza margherita = new Pizza.PizzaBuilder()
				.dough("thin crust")
				.topping("tomato")
				.cheese(true)
				.build();

		System.out.println("Margherita Pizza:");
		System.out.println(margherita);

		//Using Director
		PizzaCookDirector cook = new PizzaCookDirector();
		Pizza hawaiian = cook.makeHawaiianPizza(
				new Pizza.PizzaBuilder());

		System.out.println("\nHawaiian Pizza:");
		System.out.println(hawaiian);

		Pizza vegetarian = cook.makeVegetarianPizza(
				new Pizza.PizzaBuilder());

		System.out.println("\nVegetarian Pizza:");
		System.out.println(vegetarian);
	}
}
