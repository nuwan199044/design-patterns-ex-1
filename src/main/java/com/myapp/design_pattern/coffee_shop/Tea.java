package com.myapp.design_pattern.coffee_shop;

public class Tea extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding ginger");
    }
}
