package com.MiniProjects;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MiniGame_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double convertedWeight =0;
        String unit;
        String unit1 = "L";
        String unit2 = "K";
        String outputUnit1 =" ";
        String outputUnit2 =" ";

        // FIRST OUTPUT

        System.out.println("=================================================");
        System.out.println(" 🏋️ METRIC / IMPERIAL WEIGHT CONVERTER 🏋️ ");
        System.out.println("=================================================");
        System.out.println(" ");

        System.out.print("Enter your current weight value: ");
        weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Select the input unit tier (L for lbs / K for kgs): ");
        unit = scanner.nextLine();
        System.out.println("\n");
        System.out.println("Processing weight transformation matrix...");
        System.out.println(" ");

        // MAIN

        if (unit.equalsIgnoreCase(unit1)) {
            convertedWeight = weight * 0.453592;
            outputUnit1 = "lbs";
            outputUnit2 = "kgs";
        } else if (unit.equalsIgnoreCase(unit2)) {
            convertedWeight = weight * 2.20462;
            outputUnit1 = "kgs";
            outputUnit2 = "lbs";
        } else {
            System.out.println("Enter a valid unit!");
            scanner.close();
            return;
        }

        // FINAL OUTPUT

        System.out.println("-------------------------------------------------");
        System.out.println(" 📊 WEIGHT CONVERSION INVOICE 📊 ");
        System.out.println("-------------------------------------------------");
        System.out.printf("Input Measurement :%.2f %s\n", weight,outputUnit1);
        System.out.println(" ");
        System.out.printf(" 🌟 Converted Weight Payload: %.2f %s\n", convertedWeight,outputUnit2);
        System.out.println("-------------------------------------------------");

    }
}
