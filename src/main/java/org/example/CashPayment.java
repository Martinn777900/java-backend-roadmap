package org.example;

public class CashPayment extends Payment {
    public CashPayment(double amount, String transactionReference) {
        super(amount, transactionReference);


    }


    @Override
    public void processPayment() {
        System.out.println("Processing cash payment of" + getAmount());
    }


}
