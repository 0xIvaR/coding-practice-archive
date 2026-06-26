package com.Logical_Ops;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int exp;
        double score;

        System.out.print("Enter years of programming experience: ");
        exp = scanner.nextInt();
        System.out.print("Enter structural assessment exam score (0-100): ");
        score = scanner.nextDouble();

        // Inline assignment directly evaluates the conditions to true or false
        boolean isShortlisted = exp >= 3 && score >= 75.0;

        // Print it out in a single formatted string
        System.out.println("Candidate Shortlisted: " + isShortlisted);

        scanner.close();
    }
}
