package com.myapp.design_pattern.payment;

public class CryptoProcessor implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing cryptocurrency payment: $" + amount);
    }
}
