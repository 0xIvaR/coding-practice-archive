package com.T20_Logical_Operators;

import java.util.Scanner;

public class Q_1_Prac {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int years;
        double score;
        boolean shortlisted = true;

        System.out.print("Enter programming experience in years: ");
        years = scanner.nextInt();
        System.out.print("Enter structural assessment exam score: ");
        score = scanner.nextDouble();

        if (years >= 3 && score >= 75.0 ) {
            System.out.println("Candidate Shortlisted: " + shortlisted);
        } else {
            shortlisted = false;
            System.out.println("Candidate Shortlisted: " + shortlisted);
        }
    }
}

