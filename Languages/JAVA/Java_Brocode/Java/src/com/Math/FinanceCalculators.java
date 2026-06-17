package com.Math;

public class FinanceCalculators {
    public static void main(String[] args) {

        double principal = 10000;
        double rate = 5;
        double time = 2;

        // Simple Interest
        double si =
                (principal * rate * time) / 100;

        // Compound Amount
        double amount =
                principal * Math.pow(
                        (1 + rate / 100),
                        time
                );

        // Compound Interest
        double ci = amount - principal;

        System.out.println("Simple Interest = " + si);
        System.out.println("Compound Interest = " + ci);
    }
}