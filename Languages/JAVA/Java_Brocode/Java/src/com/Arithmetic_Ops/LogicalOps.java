package com.Arithmetic_Ops;

public class LogicalOps {
    public static void main(String[] args) {

        int age = 20;
        int marks = 75;

        // && = AND
        // Returns true only if BOTH conditions are true
        System.out.println("(age > 18 && marks > 50) : "
                + (age > 18 && marks > 50));

        // || = OR
        // Returns true if AT LEAST ONE condition is true
        System.out.println("(age > 18 || marks > 90) : "
                + (age > 18 || marks > 90));

        // ! = NOT
        // Reverses the result (true -> false, false -> true)
        System.out.println("!(age > 18) : "
                + !(age > 18));

    }
}