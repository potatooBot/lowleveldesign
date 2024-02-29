package StrategyPattern;

public class DebitCardPaymentStrategy implements PaymentStrategy{
    @Override
    public void processPayment(double amount) {
        System.out.println(" Processing Debit Card Payment"+amount);
    }
}
