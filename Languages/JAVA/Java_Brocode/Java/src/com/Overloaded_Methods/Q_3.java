package com.Overloaded_Methods;

import java.util.Scanner;

public class Q_3 {

    // --- VERSION 1: Basic Markdown ---
    // Signature: applyDiscount(double, int)
    public static double applyDiscount(double rawPrice, int discountPercentage) {
        // Dividing by 100.0 forces Java to perform double division instead of dropping decimals
        double discountRatio = discountPercentage / 100.0;
        double markdownAmount = rawPrice * discountRatio;
        return rawPrice - markdownAmount;
    }

    // --- VERSION 2: Stacked Coupon Markdown ---
    // Signature: applyDiscount(double, int, String)
    public static double applyDiscount(double rawPrice, int discountPercentage, String couponCode) {
        // Code Reuse: Call Version 1 to handle the initial percentage calculation
        double baseDiscountedPrice = applyDiscount(rawPrice, discountPercentage);

        // Check for the premium VIP reward token
        if (couponCode.equalsIgnoreCase("VIP_REWARD")) {
            baseDiscountedPrice -= 10.00; // Deduct the extra $10 flat cash reward
        }

        return baseDiscountedPrice;
    }

    // --- EXECUTION BLOCK ---
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Gather baseline retail data
        System.out.print("Enter product raw price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter standard discount percentage (e.g., 15): ");
        int percentage = scanner.nextInt();
        scanner.nextLine(); // Clear the hidden newline buffer character

        System.out.print("Enter promotional coupon code (or press Enter to skip): ");
        String coupon = scanner.nextLine();

        System.out.println("\n--- Price Mutation Summary ---");

        // Route 1: Trigger standard calculation path
        double standardPrice = applyDiscount(price, percentage);
        System.out.printf("Standard Markdown Price: $%.2f\n", standardPrice);

        // Route 2: Trigger alternative coupon path
        double couponPrice = applyDiscount(price, percentage, coupon);
        System.out.printf("Coupon Applied Final Price: $%.2f\n", couponPrice);

        scanner.close();
    }
}