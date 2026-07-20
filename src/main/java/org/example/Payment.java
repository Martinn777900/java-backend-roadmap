package org.example;

public class Payment {

    private double amount;
    private String transactionReference;

    public Payment(double amount, String transactionReference) {
        this.amount = amount;
        this.transactionReference = transactionReference;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionReference() {
        return transactionReference;
    }

    public void displayInformation() {
        System.out.println("Transaction: " + transactionReference);
        System.out.println("Amount: $" + amount);
    }

    public void processPayment() {
        System.out.println("Processing a general payment...");
    }
}