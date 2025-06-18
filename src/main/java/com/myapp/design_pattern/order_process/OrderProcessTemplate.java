package com.myapp.design_pattern.order_process;

public abstract class OrderProcessTemplate {
    protected abstract void selectItem();

    protected abstract void makePayment();

    // Hook method (optional override)
    protected void deliverItem() {
        System.out.println("Default delivery process.");
    }

    public final void processOrder() {
        selectItem();
        makePayment();
        deliverItem();
    }

}
