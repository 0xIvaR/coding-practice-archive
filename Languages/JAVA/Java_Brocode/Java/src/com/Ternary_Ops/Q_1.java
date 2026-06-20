package com.Ternary_Ops;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int marks;

        System.out.print("Enter your exam marks (0-100): ");
        marks = scanner.nextInt();

        String passOrFail = (marks < 0 || marks > 100) ? "Invalid Score!" : (marks >= 40) ? "Passed" : "Failed";
        System.out.println("Result: " + passOrFail);

        scanner.close();
    }
}
