package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount to convert:");
        double amount = scanner.nextDouble();

        System.out.println("Choose the target currency to convert to BRL:");
        System.out.println("1. EUR");
        System.out.println("2. USD");
        System.out.println("3. JPY");
        System.out.println("4. GBP");
        System.out.println("5. CHF");
        int choice = scanner.nextInt();

        String fromCurrency = "";
        switch (choice) {
            case 1:
                fromCurrency = "EUR";
                break;
            case 2:
                fromCurrency = "USD";
                break;
            case 3:
                fromCurrency = "JPY";
                break;
            case 4:
                fromCurrency = "GBP";
                break;
            case 5:
                fromCurrency = "CHF";
                break;
            default:
                System.out.println("Invalid choice.");
                scanner.close();
                return;
        }

        try {
            CurrencyConverter.performConversion(fromCurrency, "BRL", amount);
        } catch (Exception e) {
            System.out.println("Error during conversion: " + e.getMessage());
        }

        scanner.close();
    }
}
