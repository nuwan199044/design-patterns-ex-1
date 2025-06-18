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
		Store store = new Store();
		store.getNotificationService().subscribe(Event.NEW_ARRIVAL, new EmailMsgListener("david@gmail.com"));
		store.getNotificationService().subscribe(Event.NEW_ARRIVAL, new EmailMsgListener("bravo@gmail.com"));
		store.getNotificationService().subscribe(Event.NEW_ARRIVAL, new MobileMsgListener("+94719164900"));
		store.getNotificationService().subscribe(Event.SALE, new EmailMsgListener("david@gmail.com"));
		store.getNotificationService().subscribe(Event.SALE, new MobileMsgListener("+94714245557"));

		store.itemPromotion(Event.SALE);
	}
}
