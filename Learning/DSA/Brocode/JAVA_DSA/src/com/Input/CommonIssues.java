package com.Input;

import java.util.Scanner;

public class CommonIssues {
    public static void main(String[] args) {
        Scanner issue = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = issue.nextInt();
        issue.nextLine();

        System.out.print("Enter your fav colour: ");
        String color = issue.nextLine();

        System.out.println("Your age is : " + age);
        System.out.println("Fav colour is : " + color);

        issue.close();
    }
}
