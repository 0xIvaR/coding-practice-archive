package com.Math;

public class UtilityCalculators {

    public static double bmi(double weight, double height) {
        return weight / (height * height);
    }

    public static double percentage(double obtainedMarks, double totalMarks) {
        return (obtainedMarks * 100) / totalMarks;
    }

    public static double average(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static double speed(double distance, double time) {
        return distance / time;
    }

    public static double distance(double speed, double time) {
        return speed * time;
    }

    public static double time(double distance, double speed) {
        return distance / speed;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double celsiusToFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }
}
