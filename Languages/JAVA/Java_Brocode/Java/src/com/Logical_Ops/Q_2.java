package com.Logical_Ops;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Matching prompt formats exactly
        System.out.print("Has boarding pass? (true/false): ");
        boolean hasBoardingPass = scanner.nextBoolean();

        System.out.print("Has valid passport? (true/false): ");
        boolean hasValidPassport = scanner.nextBoolean();

        System.out.print("Is aircrew member? (true/false): ");
        boolean isAircrewMember = scanner.nextBoolean();

        // Exact boolean conditional logic evaluation
        boolean accessGranted = (hasBoardingPass && hasValidPassport) || isAircrewMember;

        // Output match conditions exactly
        if (accessGranted) {
            System.out.println("Security Clearance: GRANTED");
        } else {
            System.out.println("Security Clearance: DENIED");
        }

        scanner.close();
    }
}
