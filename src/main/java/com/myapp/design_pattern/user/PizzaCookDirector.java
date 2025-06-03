package com.myapp.design_pattern.user;

public class PizzaCookDirector {
    public Pizza makeHawaiianPizza(Pizza.PizzaBuilder builder) {
        return builder.dough("thick crust")
                .topping("pineapple")
                .cheese(true)
                .pepperoni(true)
                .build();
    }

    public Pizza makeVegetarianPizza(Pizza.PizzaBuilder builder) {
        return builder.dough("whole wheat")
                .topping("vegetables")
                .cheese(true)
                .mushrooms(true)
                .build();
    }
}
