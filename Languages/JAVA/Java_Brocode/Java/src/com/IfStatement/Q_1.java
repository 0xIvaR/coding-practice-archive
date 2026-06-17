package com.IfStatement;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        // Exercise 1: Income Tax Bracket Estimator**
        //
        // Task:Write a program that prompts a user for their annual income as a `double`. Compute their estimated tax rate based on the following rules:
        //    - Income below $\$40,000$: Tax rate is `15%`
        //    - income equal to or above $\$40,000$: Tax rate is `25%`
        //- Print the calculated dollar amount of tax owed (`income * taxRate`).

        Scanner scanner = new Scanner(System.in);

        double income;

        System.out.print("Enter your income: ");
        income = scanner.nextDouble();

        if (income >= 40000) {
            System.out.println("Your tax rate is 25%, so the amount is $" + (income*0.25));
        } else {
            System.out.println("Your tax rate is 15%, so the amount is $" + (income*0.15));
        }

        scanner.close();
    }
}
