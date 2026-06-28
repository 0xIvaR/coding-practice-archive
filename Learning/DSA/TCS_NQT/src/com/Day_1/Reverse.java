package com.Day_1;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        int left = 0;
        int right = array.length - 1;

        while (left<right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }
}
