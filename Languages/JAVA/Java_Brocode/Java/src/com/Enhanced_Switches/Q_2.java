package com.Enhanced_Switches;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month;
        double unit;

        System.out.print("Enter the current month: ");
        month = scanner.nextLine();
        System.out.print("Enter power consumption (kWh): ");
        unit = scanner.nextDouble();

        String switchCheck = month.toLowerCase();

        double cost = switch (switchCheck) {
            case "december", "january", "february" -> unit * 1.5;
            case "june", "july", "august" -> unit * 1.8;
            case "march", "april", "may", "september", "october", "november" -> unit * 1;
            default -> 0;
        };

        if (cost != 0){
            System.out.printf("Final Electricity Cost: $%.2f", cost);
        } else {
            System.out.println("Enter valid month!");
        }

    }
}
