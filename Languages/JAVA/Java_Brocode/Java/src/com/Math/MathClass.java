package com.Math;

public class MathClass {
    public static void main(String[] args) {

        // PI value
        System.out.println(Math.PI);

        // Euler's number
        System.out.println(Math.E);

        double result;

        // Power: 2^5
        result = Math.pow(2, 5);

        // Absolute value
        result = Math.abs(-5);

        // Square root
        result = Math.sqrt(9);

        // Round to nearest whole number
        result = Math.round(3.14);

        // Round up
        result = Math.ceil(3.14);

        // Round down
        result = Math.floor(3.99);

        // Largest value
        result = Math.max(10, 20);

        // Smallest value
        result = Math.min(10, 20);

        System.out.println(result);
    }
}
