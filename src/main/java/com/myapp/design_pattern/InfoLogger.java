package com.myapp.design_pattern;

public class InfoLogger extends Logger {
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("INFO Logger: " + message);
    }
}
