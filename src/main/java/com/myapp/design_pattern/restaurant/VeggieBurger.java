package com.myapp.design_pattern.restaurant;

public class VeggieBurger implements Burger {

    @Override
    public void prepare() {
        System.out.println("Preparing VeggieBurger");
    }
}
