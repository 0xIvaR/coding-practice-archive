package com.RandomNumbers;

import java.util.Random;

public class RandomNums {
    public static void main(String[] args) {

        Random random = new Random();

        // int
        int number1;
        int number2;
        int number3;

        // double
        double number4;
        double number5;
        double number6;

        // boolean
        boolean number7;
        boolean number8;
        boolean number9;



        // numbers

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);

        number4 = random.nextDouble(1, 101);
        number5 = random.nextDouble(1, 101);
        number6 = random.nextDouble(1, 101);

        number7 = random.nextBoolean();
        number8 = random.nextBoolean();
        number9 = random.nextBoolean();

        // output

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);

        System.out.println(number7);
        System.out.println(number8);
        System.out.println(number9);
    }
}
