package com.Experiments;

public class Exp_3 {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int num3 = 4;
        int num4 = 2;

        // 1. Calculate the total sum
        double sum = num1 + num2 + num3 + num4;

        // 2. Calculate average without modifying the sum variable
        double avg = sum / 4;

        System.out.println("Sum: " + sum); // Output: 17.0
        System.out.println("Avg: " + avg); // Output: 4.25
    }
}
