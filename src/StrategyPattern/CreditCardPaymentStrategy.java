package StrategyPattern;

public class CreditCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CreditCard Payment "+amount);
    }
}
