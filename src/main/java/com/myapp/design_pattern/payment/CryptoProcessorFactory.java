package com.myapp.design_pattern.payment;

public class CryptoProcessorFactory extends PaymentProcessorFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new CryptoProcessor();
    }
}
