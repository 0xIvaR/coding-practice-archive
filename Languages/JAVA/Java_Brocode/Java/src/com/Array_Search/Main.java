package com.Array_Search;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int targetNum;
        String targetFruit;

        int[] numbers = {1, 6, 3, 2, 5, 2, 6, 8, 2};
        String[] fruits = {"Apple", "Pineapple", "Banana", "Orange"};

        System.out.print("Enter the target number: ");
        targetNum = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter the target fruit: ");
        targetFruit = scanner.nextLine();

        // 1. NUMBER SEARCH
        boolean isFound = false;
        for (int i = 0; i < numbers.length ; i++) {
            if ( targetNum == numbers[i]) {
                System.out.println("Element found in index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in index");
        }

        // 2. FRUIT SEARCH
        boolean isFruitFound = false;
        for (int i = 0; i < fruits.length; i++) {
            // Use .equalsIgnoreCase() to ignore capitalization issues (e.g., "apple" vs "Apple")
            if (targetFruit.equalsIgnoreCase(fruits[i])) {
                System.out.println("Fruit found at index: " + i);
                isFruitFound = true;
                break;
            }
        }
        if (!isFruitFound) {
            System.out.println("Fruit not found in array");
        }


    }
}
