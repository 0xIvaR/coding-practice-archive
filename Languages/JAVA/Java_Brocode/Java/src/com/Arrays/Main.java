package com.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. Declaring and initializing an array literal [05:04:00]
        String[] friendsList = {"Ankur", "Saurashis", "Jaitosri", "Oishiki"};

        // 2. Modifying an element directly at a specific zero-based index slot [05:05:15]
        friendsList[0] = "Ankur-Senior Developer";

        System.out.println("--- 3. Reading Single Elements ---");
        System.out.println("First Slot Element (Index 0): " + friendsList[0]);
        System.out.println("Third Slot Element (Index 2): " + friendsList[2]);

        System.out.println("\n--- 4. Iterating Through the Entire Array Array [05:06:10] ---");
        // Using the built-in '.length' property to scale dynamically [05:06:30]
        for (int i = 0; i < friendsList.length; i++) {
            System.out.println("Index position tracking [" + i + "] -> Member Name: " + friendsList[i]);
        }
    }
}