package org.example;

public class Product {

    String name;
    double price;
    int stockQuantity;

    public void displayInformation() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Stock: " + stockQuantity);
    }
    public void reduceStock(int quantity) {
        stockQuantity = stockQuantity - quantity;
    }
}