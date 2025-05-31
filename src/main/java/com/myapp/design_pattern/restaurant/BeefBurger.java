package com.myapp.design_pattern.restaurant;

public class BeefBurger implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing BeefBurger");
    }
}
