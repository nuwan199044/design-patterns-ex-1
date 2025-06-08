package com.myapp.design_pattern;

import com.myapp.design_pattern.smart_home.Command;
import com.myapp.design_pattern.smart_home.Light;
import com.myapp.design_pattern.smart_home.LightOffCommand;
import com.myapp.design_pattern.smart_home.LightOnCommand;
import com.myapp.design_pattern.smart_home.RemoteControl;
import com.myapp.design_pattern.text_editor.AddTextCommand;
import com.myapp.design_pattern.text_editor.DeleteCommand;
import com.myapp.design_pattern.text_editor.TextEditor;
import com.myapp.design_pattern.text_editor.TextEditorInvoker;
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
//		smartHomeDemo();
		textEditorDemo();
	}

	public static void smartHomeDemo() {
		Light livingRoomLight = new Light();

		Command lightOn = new LightOnCommand(livingRoomLight);
		Command lightOff = new LightOffCommand(livingRoomLight);

		RemoteControl remote = new RemoteControl();

		remote.setCommand(lightOn);
		remote.pressButton();  // Output: Light is ON

		remote.setCommand(lightOff);
		remote.pressButton();  // Output: Light is OFF
	}

	public static void textEditorDemo() {
		TextEditor editor = new TextEditor();
		TextEditorInvoker invoker = new TextEditorInvoker();

		// Add some text
		invoker.setCommand(new AddTextCommand(editor, "Hello "));
		invoker.executeCommand();

		// Add more text
		invoker.setCommand(new AddTextCommand(editor, "World!"));
		invoker.executeCommand();

		// Delete last 3 characters
		invoker.setCommand(new DeleteCommand(editor, 3));
		invoker.executeCommand();

		System.out.println("\n--- Undoing last command ---");
		invoker.undoLastCommand();

		System.out.println("\n--- Undoing another command ---");
		invoker.undoLastCommand();

		System.out.println("\nFinal text: " + editor.getText());
	}
}
