package com.Arithmetic_Ops;

public class Q_2 {
    public static void main(String[] args) {

        //Exercise 2: Average Grade Calculator (The Type Casting Trap)
        //Task: Create three int variables representing test scores: score1 = 85, score2 = 93, and score3 = 90. Calculate the average score. Ensure the final printed output displays as a precise double decimal point average (e.g., 89.333...) rather than a truncated whole number.

        int score1 = 85;
        int score2 = 93;
        int score3 = 90;

//        double average = (double) (score1 + score2 + score3) /3;
        double average = (score1+score2+score3) / 3.0;

        System.out.println("The average is: " + average);
    }
}
