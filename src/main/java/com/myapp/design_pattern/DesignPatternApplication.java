package com.myapp.design_pattern;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternApplication.class, args);
	}

	private static Logger getChainOfLoggers() {
		Logger errorLogger = new ErrorLogger(Logger.ERROR);
		Logger infoLogger = new InfoLogger(Logger.DEBUG);
		Logger debugLogger = new DebugLogger(Logger.INFO);

		errorLogger.setNextLogger(debugLogger);
		debugLogger.setNextLogger(infoLogger);

		return errorLogger;
	}

	@Override
	public void run(String... args) throws Exception {
		Logger loggerChain = getChainOfLoggers();

		System.out.println("--- Logging INFO level message ---");
		loggerChain.logMessage(Logger.INFO, "This is an information.");

		System.out.println("\n--- Logging DEBUG level message ---");
		loggerChain.logMessage(Logger.DEBUG, "This is a debug level information.");

		System.out.println("\n--- Logging ERROR level message ---");
		loggerChain.logMessage(Logger.ERROR, "This is an error information.");
	}
}
