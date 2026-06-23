package com.Methods;

public class Methods_2 {
    public static void main(String[] args) {

        int age = 9;

        if (ageCheck(age)){
            System.out.println("You are eligible");
        } else {
            System.out.println("You are not");
        }


    }
    public static boolean ageCheck(int age) {
        return age >= 18;
    }
}
