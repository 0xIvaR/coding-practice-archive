package com.Overloaded_Methods;
import java.util.Scanner;

public class Main_2 {
    public static void main(String[] args) {

        // INPUT
        Scanner scanner = new Scanner(System.in);
        String bread;
        String cheese;

        // STATEMENTS
        System.out.print("Enter the Bread type: ");
        bread = scanner.nextLine();
        System.out.print("Enter the Cheese type: ");
        cheese = scanner.nextLine();
        // METHODS
        String pizza = bakePizza(bread, cheese);
        System.out.println(pizza);
    }
    // METHODS OPERATIONS

    static String bakePizza (String bread){
    return bread + " pizza";
    }
    static String bakePizza (String bread, String cheese) {
        return cheese + " " + bread + " pizza";
    }
}
