package com.myapp.design_pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<String> carFeatures = new ArrayList<>();
		carFeatures.add("GPS");
		carFeatures.add("Sunroof");
		Vehicle carPrototype = new Car("Tesla Model 3", "Red", carFeatures);

		Vehicle busPrototype = new Bus("School Bus", "Yellow", 30);

		System.out.println("Original Prototypes:");
		carPrototype.displayDetails();
		busPrototype.displayDetails();

		// Clone and modify vehicles
		Vehicle car1 = carPrototype.clone();
		car1.setColor("Blue");
		((Car) car1).addFeature("Autopilot");

		Vehicle car2 = carPrototype.clone();
		car2.setColor("Black");

		Vehicle bus1 = busPrototype.clone();
		bus1.setColor("White");
		((Bus) bus1).setCapacity(45);

		System.out.println("Cloned Vehicles:");
		car1.displayDetails();
		car2.displayDetails();
		bus1.displayDetails();

		System.out.println("Original Prototypes (unchanged):");
		carPrototype.displayDetails();
		busPrototype.displayDetails();
	}
}
