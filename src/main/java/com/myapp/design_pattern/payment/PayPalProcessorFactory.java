package com.myapp.design_pattern.payment;

public class PayPalProcessorFactory extends PaymentProcessorFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }
}
