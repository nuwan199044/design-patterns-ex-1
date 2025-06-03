package com.myapp.design_pattern;

public interface Vehicle extends Cloneable {
    Vehicle clone() throws CloneNotSupportedException;
    void displayDetails();
    void setColor(String color);
}
