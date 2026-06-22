package com.Logical_Ops;

public class Main {
    public static void main(String[] args) {

        // && = AND
        // || = OR
        // ! = NOT

        double temp = 20;
        boolean isSunny = false;

        if (temp < 30 && temp >0 && isSunny) {
            System.out.println("Weather is good, Sunny ");
        } else if (temp < 30 && temp > 0 && !isSunny) {
            System.out.println("Weather is good,not Sunny ");
        } else if (temp > 30 || temp < 0) {
            System.out.println("weather is not good");
        }

    }
}
