package com.myapp.design_pattern.order_process;

public class RegularOrder extends OrderProcessTemplate {

    @Override
    protected void selectItem() {
        System.out.println("Item selected from store.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Payment made by credit card.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Item delivered via courier.");
    }
}
