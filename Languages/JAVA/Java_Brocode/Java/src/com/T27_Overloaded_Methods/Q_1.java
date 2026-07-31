package com.T27_Overloaded_Methods;

import java.util.Scanner;

public class Q_1 {
    public static double calculateArea (double radius){
        double circle = Math.PI * radius * radius;
        return circle;
    }
    public static double calculateArea (double width, double height) {
        double rectangle = width * height;
        return  rectangle;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose (1) Circle or (2) Rectangle: " );
        int choice = scanner.nextInt();

        if (choice == 1 || choice == 2){
            if (choice == 1){
                System.out.println("Enter radius: ");
                double radius = scanner.nextDouble();
                double value1 = calculateArea(radius);

                System.out.println("Circle: " + value1);
            }else if (choice == 2){
                System.out.print("Enter Width: ");
                double width1 = scanner.nextDouble();
                System.out.print("Enter Height: ");
                double height1 = scanner.nextDouble();

                double value2 = calculateArea(width1, height1);

                System.out.println("Rectangle: " + value2);
            }
            else {
                System.out.println("Enter a valid number!");
            }
        }

        scanner.close();
    }
}

