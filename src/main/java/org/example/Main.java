package org.example;

public class Main {
    public static int square(int number) {
        return number * number;
    }

    public static void adult(int number) {
        if (number > 18) {
            System.out.println("is an adult");
        }
    }

    public static int minimum(int number1, int number2) {
        if (number1 > number2) {
            return number2;
        } else {
            return number1;
        }

    }

    public static double ctof(double number) {
        return (number * (9.0 / 5.0)) + 32;

    }

    public static int sum100() {
        int sum = 0;
        for (int number = 0; number <= 100; number++) {
            sum = sum + number;

        }
        return sum;
    }

    public static void main(String[] args) {


            // Call square()
            int squareResult = square(5);
            System.out.println("Square: " + squareResult);

            // Call adult()
            adult(20);

            // Call minimum()
            int minimumResult = minimum(10, 4);
            System.out.println("Minimum: " + minimumResult);

            // Call celsiusToFahrenheit()
            double fahrenheitResult = ctof(20);
            System.out.println("Fahrenheit: " + fahrenheitResult);

            // Call sum100()
            int sumResult = sum100();
            System.out.println("Sum from 1 to 100: " + sumResult);
        }


    }