package com.MiniProjects;

import java.util.Scanner;

public class MiniGame_6_Adv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double accountBalance = 0.00;
        int choice;

        System.out.println("=== Core Core Bank Terminal Initialized ===");

        do {
            System.out.println("\n--------------------------------");
            System.out.println("1. Check Account Balance");
            System.out.println("2. Deposit Financial Assets");
            System.out.println("3. Withdraw Financial Assets");
            System.out.println("4. Terminate Secure Session (Exit)");
            System.out.print("Enter your target operation node (1-4): ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showBalance(accountBalance);
                    break;
                case 2:
                    double depositAmount = deposit(scanner);
                    accountBalance += depositAmount;
                    System.out.printf("System Notice: Successfully deposited $%.2f%n", depositAmount);
                    break;
                case 3:
                    double withdrawalAmount = withdraw(accountBalance, scanner);
                    accountBalance -= withdrawalAmount;
                    System.out.printf("System Notice: Successfully withdrew $%.2f%n", withdrawalAmount);
                    break;
                case 4:
                    System.out.println("\nSecure session terminating. Thank you for banking with us.");
                    break;
                default:
                    System.out.println("Error Code: Invalid selection criteria. Please retry.");
            }
        } while (choice != 4);

        scanner.close();
    }

    public static void showBalance(double balance){
        System.out.printf("Current Audited Account Balance: $%.2f%n", balance);
    }
    public static double deposit(Scanner scanner) {
        System.out.print("Enter structural deposit payload amount: $");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Transaction Rejected: Negative deposit parameters are banned.");
            return 0;
        }
        return amount;
    }

    public static double withdraw(double balance, Scanner scanner) {
        System.out.print("Enter structural withdrawal deduction amount: $");
        double amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("Transaction Rejected: Negative withdrawal parameters are banned.");
            return 0;
        }
        if (amount > balance) {
            System.out.println("Transaction Overdraft Alert: Insufficient liquid reserves available.");
            return 0;
        }
        return amount;
    }
}

