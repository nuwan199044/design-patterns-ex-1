package com.myapp.design_pattern.coffee_shop;

public abstract class Beverage {

    // Abstract methods to be implemented by subclasses
    protected abstract void brew();
    protected abstract void addCondiments();

    // Common methods with default implementation
    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    // Hook method - subclasses can override if needed
    protected boolean customerWantsCondiments() {
        return true;
    }

    // This is the template method - it defines the algorithm structure
    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }
}
