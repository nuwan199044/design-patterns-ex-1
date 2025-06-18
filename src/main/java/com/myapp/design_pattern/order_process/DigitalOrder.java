package com.myapp.design_pattern.order_process;

public class DigitalOrder extends OrderProcessTemplate {
    @Override
    protected void selectItem() {
        System.out.println("Item selected from online.");
    }

    @Override
    protected void makePayment() {
        System.out.println("Payment made by paypal.");
    }

    @Override
    protected void deliverItem() {
        System.out.println("Item delivered via shipment.");
    }
}
