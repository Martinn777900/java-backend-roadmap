package org.example;

public class Main {

    public static void main(String[] args) {

        CashPayment cashPayment =
                new CashPayment(50, "TXN-002");

        cashPayment.displayInformation();
        cashPayment.processPayment();




    }
}