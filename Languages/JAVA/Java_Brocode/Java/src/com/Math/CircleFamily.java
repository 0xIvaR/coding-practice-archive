package com.Math;

public class CircleFamily {

    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double circleDiameter(double radius) {
        return 2 * radius;
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3) * Math.PI * Math.pow(radius, 3);
    }

    public static double sphereSurfaceArea(double radius) {
        return 4 * Math.PI * radius * radius;
    }

    public static double cylinderVolume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    public static double cylinderCurvedSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * height;
    }

    public static double cylinderTotalSurfaceArea(double radius, double height) {
        return 2 * Math.PI * radius * (radius + height);
    }

    public static double coneSlantHeight(double radius, double height) {
        return Math.sqrt(radius * radius + height * height);
    }

    public static double coneVolume(double radius, double height) {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    public static double coneCurvedSurfaceArea(double radius, double height) {
        double slantHeight = coneSlantHeight(radius, height);
        return Math.PI * radius * slantHeight;
    }

    public static double coneTotalSurfaceArea(double radius, double height) {
        double slantHeight = coneSlantHeight(radius, height);
        return Math.PI * radius * (radius + slantHeight);
    }
}
