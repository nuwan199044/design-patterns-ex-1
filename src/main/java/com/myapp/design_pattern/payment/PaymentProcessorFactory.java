package com.myapp.design_pattern.payment;

public abstract class PaymentProcessorFactory {
    // The factory method
    public abstract PaymentProcessor createProcessor();

    // Can include common processing logic
    public void process(double amount) {
        PaymentProcessor processor = createProcessor();
        processor.processPayment(amount);
    }
}
