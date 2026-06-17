package com.Math;

public class UtilityCalculators {
    public static void main(String[] args) {

        // BMI
        double weight = 70;
        double height = 1.75;

        double bmi =
                weight / (height * height);

        // Percentage
        double obtainedMarks = 450;
        double totalMarks = 500;

        double percentage =
                (obtainedMarks * 100)
                        / totalMarks;

        // Average
        double a = 10;
        double b = 20;
        double c = 30;

        double average =
                (a + b + c) / 3;

        // Speed
        double distance = 120;
        double time = 2;

        double speed =
                distance / time;

        System.out.println("BMI = " + bmi);
        System.out.println("Percentage = " + percentage);
        System.out.println("Average = " + average);
        System.out.println("Speed = " + speed);
    }
}
