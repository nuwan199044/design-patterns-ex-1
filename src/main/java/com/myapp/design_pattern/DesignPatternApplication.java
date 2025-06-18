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
		TextEditor editor = new TextEditor();
		History history = new History();

		editor.type("This is the first sentence. ");
		history.save(editor.save());

		editor.type("This is the second sentence. ");
		history.save(editor.save());

		editor.type("Oops! Mistake made here.");

		System.out.println("Current Content: " + editor.getContent());

		// Undo once
		editor.restore(history.undo());
		System.out.println("After 1st Undo: " + editor.getContent());

		// Undo again
		editor.restore(history.undo());
		System.out.println("After 2nd Undo: " + editor.getContent());
	}
}
