package com.Variables;

public class Variable {
    public static void main(String[] args) {
        //      Two types of Variables
        //      1. Primitive || 2. Reference
        //      Primitive: int, double, char, boolean
        //      Reference: string, array, object

        //      Steps to create a Variable
        //      --------------------------
        //      1. declaration
        //      2. assignment

        //      Primitive Datatypes
        //      -------------------
        // int
        int age = 30;
        int year = 2025;

        // double
        double price = 1666.99;
        double gpa = 3.5;
        double temperature = -56.2;

        // char
        char grade = 'A';
        char symbol = '&';
        char currency = '$';

        // boolean
        boolean isStudent = false;
        boolean forSale = false;
        boolean isOnline = true;

        //      Reference Datatypes
        //      -------------------
        // String

        String name = "Soham";
        String email = "sohamkundu4012@gmail.com";
        String car = "Mustang";
        String colour = "Red";

        System.out.println("Hello " + name);
        System.out.println("Your age is: "+ age);
        System.out.println("Your current GPA is "+ gpa + " in the year of ");

        System.out.println("Your choice is a "+ colour + " " + year + " " + car);
        System.out.println("The price is "+ currency + price);

        if (forSale){
            System.out.println("There is a " + car + " for sale");
        }
        else {
            System.out.println("The " + car+ " is not for sale.");
        }

    }
}
