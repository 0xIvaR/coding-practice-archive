package com.Day_1;

import java.util.Arrays;

public class MoveZero {
    public static void main(String[] args) {

        int[] array = {0, 1, 0, 3, 12};

        // 1. Initialize the write pointer to track where the next non-zero goes
        int writePointer = 0;

        // 2. The Read Loop: Scan the entire array from left to right
        for (int readPointer = 0; readPointer < array.length; readPointer++) {
            // If we find a non-zero element, shift it forward
            if (array[readPointer] != 0) {
                array[writePointer] = array[readPointer];
                writePointer++; // Move the write placement indicator forward
            }
        }

        // 3. The Fill Loop: Put zeros in all the remaining slots at the end
        while (writePointer < array.length) {
            array[writePointer] = 0;
            writePointer++;
        }

        System.out.println("Modified Array: " + Arrays.toString(array));
    }
}
