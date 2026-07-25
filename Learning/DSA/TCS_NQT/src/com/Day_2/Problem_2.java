package com.Day_2;

import java.util.Arrays;

public class Problem_2 {
    public static void main(String[] args) {

        int[] nums = {5, 7, 11, 15, 39, 5, 9, 6, 2};
        int target = 9;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // 1. Create the result array holding our two index positions
                    int[] result = new int[]{i, j};

                    // 2. Print the array using Arrays.toString so it formats nicely like [0, 1]
                    System.out.println("Indices found: " + Arrays.toString(result));

                    // 3. Stop the program completely since we found the one and only solution
                    return;
                }
            }
        }
    }
}