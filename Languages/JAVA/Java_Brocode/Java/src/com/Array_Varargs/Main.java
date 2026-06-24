package com.Array_Varargs;

public class Main {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying # of arguments
        //           makes methods more flexible, no need for overloaded methods
        //           java will pack the arguments into an array
        //           ... (ellipsis)

        double numbers;
        System.out.println(add());


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
