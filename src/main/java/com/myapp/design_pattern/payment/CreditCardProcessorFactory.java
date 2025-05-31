package com.myapp.design_pattern.payment;

public class CreditCardProcessorFactory extends PaymentProcessorFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new CreditCardProcessor();
    }
}
