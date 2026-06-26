package com.Day_1;

public class MinMax {
    public static void main(String[] args) {

        int[] array = {3, 7, 1, 9, 4};
        int maxVal = array[0];
        int minVal = array[0];

        for (int i = 1; i < array.length ; i++){
            if (array[i] > maxVal) {
                maxVal = array[i];
            }
            if (array[i] < minVal) {
                minVal = array[i];
            }

            System.out.println("Max = " + maxVal + ", Min = " + minVal);
        }
    }
}
