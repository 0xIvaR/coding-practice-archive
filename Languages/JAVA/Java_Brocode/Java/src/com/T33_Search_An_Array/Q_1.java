package com.T33_Search_An_Array;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] classScores = {45, 78, 92, 64, 88, 100};

        System.out.print("Enter a target score to look up: ");
        int targetNum = scanner.nextInt();

        System.out.println("\nSearching data registry...");

        boolean isFound = false;
        for (int i = 0; i < classScores.length; i++) {
            if (targetNum == classScores[i]) {
                // Modified to echo back the exact score found
                System.out.printf("Score %d found at index position: %d\n", targetNum, i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            // Modified to specify which exact score was missing
            System.out.printf("Score %d was not found in the records.\n", targetNum);
        }

        scanner.close();
    }
}