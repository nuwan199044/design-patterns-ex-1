package com.myapp.design_pattern;

import java.util.ArrayList;
import java.util.List;

public class Car implements Vehicle{

    private String model;
    private String color;
    private List<String> features;

    public Car(String model, String color, List<String> features) {
        this.model = model;
        this.color = color;
        this.features = features;
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        // Perform a deep copy
        return new Car(this.model, this.color, new ArrayList<>(this.features));
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Features: " + String.join(", ", features));
        System.out.println();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void addFeature(String feature) {
        this.features.add(feature);
    }
}
