package com.myapp.design_pattern;

import java.util.Stack;

public class History {
    private Stack<TextMemento> history = new Stack<>();

    public void save(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento undo() {
        return history.pop();
    }
}
