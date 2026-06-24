package com.Array_Varargs;

import java.util.ArrayList;
import java.util.Scanner;

public class Main_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use an ArrayList because we don't know how many numbers the user will enter
        ArrayList<Double> inputList = new ArrayList<>();

        System.out.println("Enter numbers to average (type any letter or 'stop' to finish):");

        // Keep asking for numbers until the user types something that isn't a double
        while (scanner.hasNextDouble()) {
            double num = scanner.nextDouble();
            inputList.add(num);
        }

        // Convert our dynamic ArrayList into a primitive double array
        double[] numbersArray = new double[inputList.size()];
        for (int i = 0; i < inputList.size(); i++) {
            numbersArray[i] = inputList.get(i);
        }

        // Java automatically unpacks a regular array when passed into a Varargs (...) parameter!
        double result = add(numbersArray);

        System.out.println("The average is: " + result);
        scanner.close();
    }

    public static double add(double... numbers){
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}
