package com.Input;
import java.util.Scanner;


public class Q_1 {
    public static void main(String[] args) {

        // Calculate the area of rectangle

        double width = 0;
        double height = 0;
        double area = 0;

        Scanner rectangle = new Scanner(System.in);

        System.out.print("Enter the Width: ");
        width = rectangle.nextInt();

        System.out.print("Enter your Height: ");
        height = rectangle.nextInt();

        area = width * height;

        System.out.println("The area of the rectangle is: " + area + "cm²");

        rectangle.close();

    }
}
