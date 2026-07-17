package org.example;

public class Main {

    public static void main(String[] args) {

        Product laptop = new Product();

        laptop.name = "Lenovo Laptop";
        laptop.price = 1200.0;
        laptop.stockQuantity = 8;

        System.out.println("Product: " + laptop.name);
        System.out.println("Price: $" + laptop.price);
        System.out.println("Stock: " + laptop.stockQuantity);
        laptop.displayInformation();

        laptop.reduceStock(2);
        System.out.println("After selling two laptops:");

        laptop.displayInformation();
    }

}