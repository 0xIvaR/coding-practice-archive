package com.Math;

public class CircleFamily {
    public static void main(String[] args) {

        double radius = 7;
        double height = 10;

        // Circle Area
        double circleArea = Math.PI * radius * radius;

        // Circle Circumference
        double circumference = 2 * Math.PI * radius;

        // Circle Diameter
        double diameter = 2 * radius;

        // Sphere Volume
        double sphereVolume =
                (4.0 / 3) * Math.PI * Math.pow(radius, 3);

        // Sphere Surface Area
        double sphereSurfaceArea =
                4 * Math.PI * radius * radius;

        // Cylinder Volume
        double cylinderVolume =
                Math.PI * radius * radius * height;

        System.out.println("Circle Area = " + circleArea);
        System.out.println("Circumference = " + circumference);
        System.out.println("Diameter = " + diameter);

        System.out.println("Sphere Volume = " + sphereVolume);
        System.out.println("Sphere Surface Area = " + sphereSurfaceArea);

        System.out.println("Cylinder Volume = " + cylinderVolume);
    }
}
