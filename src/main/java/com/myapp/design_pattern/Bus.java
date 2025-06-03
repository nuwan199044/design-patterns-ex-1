package com.myapp.design_pattern;

public class Bus implements Vehicle {

    private String type;
    private String color;
    private int capacity;

    public Bus(String type, String color, int capacity) {
        this.type = type;
        this.color = color;
        this.capacity = capacity;
    }

    @Override
    public Vehicle clone() throws CloneNotSupportedException {
        // Shallow copy is sufficient here as we only have primitive/String fields
        return new Bus(this.type, this.color, this.capacity);
    }

    @Override
    public void displayDetails() {
        System.out.println("Bus Type: " + type);
        System.out.println("Color: " + color);
        System.out.println("Passenger Capacity: " + capacity);
        System.out.println();
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
