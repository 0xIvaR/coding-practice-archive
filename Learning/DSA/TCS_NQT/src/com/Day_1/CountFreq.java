package com.Day_1;

import java.util.HashMap;

public class CountFreq {
    public static void main(String[] args) {

        int[] array = {1, 2, 2, 3, 3, 3};

        // 1. Initialize the HashMap structure
        // The first Integer represents the Key (the number from the array)
        // The second Integer represents the Value (how many times it shows up)
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // 2. Loop through every element using our enhanced for-each loop
        for (int num : array) {

            // Check if the number is already written on our notepad (map)
            if (frequencyMap.containsKey(num)) {
                // If it exists, get the current count, add 1, and save it back
                int currentCount = frequencyMap.get(num);
                frequencyMap.put(num, currentCount + 1);
            } else {
                // If it doesn't exist, this is the first time seeing it. Start count at 1.
                frequencyMap.put(num, 1);
            }
        }

        // 3. Print out the final completed notepad summary
        System.out.println("Element Frequencies: " + frequencyMap);
    }
}
