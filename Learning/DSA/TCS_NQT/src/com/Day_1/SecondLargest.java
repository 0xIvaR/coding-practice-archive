package com.Day_1;

public class SecondLargest {
    public static void main(String[] args) {

        int[] array = {3, 1, 5, 5, 2};

        int largest = array[0];
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 1 ; i < array.length; i++) {
            
            if (array[i] > largest){
                secondLargest = largest;
                largest = array[i];
            } else if (array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }

        System.out.println("Second Largest : " + secondLargest);

    }
}
