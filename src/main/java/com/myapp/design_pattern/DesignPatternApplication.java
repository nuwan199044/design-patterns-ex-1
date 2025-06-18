package com.myapp.design_pattern;

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
		ATCMediator mediator = new ATCMediatorImpl();

		Flight flight1 = new FlightImpl("AI-202", mediator);
		Flight flight2 = new FlightImpl("EK-404", mediator);

		mediator.setLandingStatus(true); // runway is free

		flight1.requestLanding(); // should land
		flight2.requestLanding(); // should be denied
	}
}
