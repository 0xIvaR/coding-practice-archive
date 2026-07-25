package com.MiniProjects;

import java.util.Scanner;

public class MiniGame_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double convert = 0.00;

        System.out.print("Enter raw temperature scalar value: ");
        double rawInput = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Convert to (C)elsius or (F)ahrenheit?: ");
        String unit = scanner.nextLine().toUpperCase();

        System.out.println("[Diagnostic Scan Complete]");

        if (unit.equals("C")){
            convert = (rawInput - 32) * 5/9;
            System.out.printf("Conversions Logged: %.1f°F maps directly out to %.1f°C", rawInput, convert);
        } else if (unit.equals("F")) {
            convert = (rawInput * 9/5) + 32;
            System.out.printf("Conversions Logged: %.1f°C maps directly out to %.1f°F", rawInput, convert);
        } else {
            System.out.println("Error: System selection out-of-bounds. Enter 'C' or 'F' exclusively.");
        }

        scanner.close();
    }
}
