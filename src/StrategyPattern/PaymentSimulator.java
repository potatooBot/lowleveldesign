package StrategyPattern;

public class PaymentSimulator {
    public static void main(String[] args) {
        PaymentStrategy creditCardPaymentStrategy=new CreditCardPaymentStrategy();
        PaymentProcessor creditCardPaymentProcessor =new PaymentProcessor(creditCardPaymentStrategy);
        creditCardPaymentStrategy.processPayment(100080.0);


    }
}
