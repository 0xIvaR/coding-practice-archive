package com.Math;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        //HYPOTENUSE c = Math.sqrt(a² + b²)

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Enter the value of a: ");
        a = scanner.nextDouble();

        System.out.print("Enter the value of b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The value of c: " + c);

    }
}
