package com.T33_Search_An_Array;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] serialKeys = new String[5];

        // 1. Array Ingestion Loop
        for (int i = 0; i < serialKeys.length; i++){
            System.out.printf("Enter serial key for slot %d: ", i);
            serialKeys[i] = scanner.nextLine();
        }

        System.out.println();
        System.out.print("Enter Serial Key to scan: ");
        String serialKey = scanner.nextLine();

        System.out.println("\nVerifying credentials...");

        boolean isFound = false;

        // FIX 1: Loop bounds mapped to the array length, not the input text length
        for (int i = 0; i < serialKeys.length; i++){

            // FIX 2: Used .equals() for correct object-level String text value matching
            if (serialKey.equals(serialKeys[i])){
                System.out.printf("Access Authorized to Terminal slot: %d\n", i);
                isFound = true;
                break;
            }
        }

        if (!isFound){
            System.out.println("Access Denied: Serial key blacklisted.");
        }

        scanner.close();
    }
}