package com.myapp.design_pattern.payment;

public class PaymentService {
    public void processPayment(String paymentMethod, double amount) {
        PaymentProcessorFactory factory;

        switch (paymentMethod.toLowerCase()) {
            case "creditcard":
                factory = new CreditCardProcessorFactory();
                break;
            case "paypal":
                factory = new PayPalProcessorFactory();
                break;
            case "crypto":
                factory = new CryptoProcessorFactory();
                break;
            default:
                throw new IllegalArgumentException("Unknown payment method");
        }

        factory.process(amount);
    }
}
