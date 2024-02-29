package StrategyPattern;

public class PaypalPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println("Paypal Procesing "+amount);
    }
}
