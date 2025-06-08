package com.myapp.design_pattern.text_editor;

public class TextEditor {
    private StringBuilder text = new StringBuilder();

    public void addText(String newText) {
        text.append(newText);
        System.out.println("Added text: " + newText);
        System.out.println("Current text: " + text);
    }

    public String deleteLastChars(int n) {
        if (text.length() >= n) {
            String deleted = text.substring(text.length() - n);
            text.setLength(text.length() - n);
            System.out.println("Deleted: " + deleted);
            System.out.println("Current text: " + text);
            return deleted;
        }
        return "";
    }

    public String getText() {
        return text.toString();
    }
}
