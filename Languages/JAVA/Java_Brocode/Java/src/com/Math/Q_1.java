package com.Math;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        // Exercise 1: Hypotenuse Calculator (Pythagorean Theorem)**
        //
        //- **Task:** Create a program that evaluates the hypotenuse (c) of a right-angled triangle. Prompt the user to supply the lengths of side (**a)** and side (b) as `double` values via a `Scanner`. Apply the classic theorem formula
        //
        // c = \sqrt{a^2 + b^2}
        //
        //- *Hint:* Chain or nesting your `Math.pow()` methods inside a single overarching `Math.sqrt()` calculation block.

        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        double c;

        System.out.print("Give the length of the side (a): ");
        a = scanner.nextDouble();

        System.out.print("Give the length of the side (b): ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("The Hypotenuse (c) of a right-angled triangle: " + c);

        scanner.close();
    }
}
