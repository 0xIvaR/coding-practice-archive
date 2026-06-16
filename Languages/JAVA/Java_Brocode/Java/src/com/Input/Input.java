package com.Input;
import java.util.*;
import java.util.Scanner;

public class Input {
    public static void main(String[] arg){

        Scanner scanner = new Scanner(System.in); // scanner --> object

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("What is your GPA: ");
        float gpa = scanner.nextFloat();

        System.out.print("Are you a Student? (true/false): ");
        boolean isStudent = scanner.hasNext();


        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("Your GPA is: " + gpa);
        System.out.println("You are a Student: " + isStudent);

        if (isStudent){
            System.out.println("The Student is enrolled");
        }
        else {
            System.out.println("Not enrolled!");
        }
        scanner.close();
    }
}
