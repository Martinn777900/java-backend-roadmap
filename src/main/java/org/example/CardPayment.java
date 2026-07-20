package org.example;

public class CardPayment extends Payment {

    private String cardNumber;

    public CardPayment(
            double amount,
            String transactionReference,
            String cardNumber
    ) {
        super(amount, transactionReference);
        this.cardNumber = cardNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    @Override
    public void processPayment() {
        System.out.println(
                "Processing card payment of $" + getAmount()
        );
    }

    @Override
    public void displayInformation() {
        super.displayInformation();
        System.out.println("Payment type: Card");
        System.out.println("Card ending: " + getLastFourDigits());
    }

    private String getLastFourDigits() {
        return cardNumber.substring(cardNumber.length() - 4);
    }
}