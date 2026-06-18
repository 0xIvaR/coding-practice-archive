package com.Math;

import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        // **Exercise 2: Spherical Spatial Dimension Modeler**
        //
        //- **Task:** Write a tracking program that prompts a user to supply the radius ($r$) of a sphere as a `double`. Compute and output the **Volume** ($V$) of that sphere using the explicit scientific mathematical formula:
        //
        //V = {4}/{3} pi r^3
        //
        //- *Warning Trap:* Watch out for integer division when evaluating the fraction `4/3`! Ensure your computation retains floating-point decimal precision.

        double radius;
        double volume;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        volume = 4.0/3 * Math.PI * Math.pow(radius, 3);

        System.out.println("The volume (V) is : " + volume);

        scanner.close();
    }
}
