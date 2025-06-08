package com.myapp.design_pattern.text_editor;

public class AddTextCommand implements Command {
    private TextEditor editor;
    private String text;

    public AddTextCommand(TextEditor editor, String text) {
        this.editor = editor;
        this.text = text;
    }

    @Override
    public void execute() {
        editor.addText(text);
    }

    @Override
    public void undo() {
        editor.deleteLastChars(text.length());
    }
}
