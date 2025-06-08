package com.myapp.design_pattern.text_editor;

public class DeleteCommand implements Command {
    private TextEditor editor;
    private int charsToDelete;
    private String deletedText;

    public DeleteCommand(TextEditor editor, int charsToDelete) {
        this.editor = editor;
        this.charsToDelete = charsToDelete;
    }

    @Override
    public void execute() {
        deletedText = editor.deleteLastChars(charsToDelete);
    }

    @Override
    public void undo() {
        if (deletedText != null) {
            editor.addText(deletedText);
        }
    }
}
