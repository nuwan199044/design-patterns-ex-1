package com.myapp.design_pattern;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class DesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Singleton instance1 = Singleton.getInstance("Hello");
		log.info("data from instance 1: {}", instance1.getData());

		Singleton instance2 = Singleton.getInstance("Hi");
		log.info("data from instance 2: {}", instance2.getData());

		AppConfig config = AppConfig.INSTANCE;
		config.printConfig();

		AppConfig anotherConfig = AppConfig.INSTANCE;
		anotherConfig.printConfig();

		System.out.println(anotherConfig.getConfigName());

	}

}
