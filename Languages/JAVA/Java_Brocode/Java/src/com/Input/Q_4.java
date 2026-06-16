package com.Input;

import java.util.Scanner;

public class Q_4 {
    public static void main(String[] args) {

        //Exercise 3: Character Profiler
        //Task: The Scanner class does not have a native nextChar() method. Research or discover how to capture a single char from user input by combining scanner.next() with a String manipulation method (e.g., extracting the first character). Write a program that takes a single character letter grade or symbol input from the user and reprints it.

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text: ");
        char text = input.next().charAt(0);

        System.out.println("The character is: " + text);

    }
}
