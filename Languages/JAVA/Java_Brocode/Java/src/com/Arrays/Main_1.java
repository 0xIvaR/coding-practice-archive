package com.Arrays;

import java.util.Arrays;

public class Main_1 {
    public static void main(String[] args) {

        String[] fruits = {"Apple", "Orange", "Banana", "Coconut"};

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        Arrays.fill(fruits, "pineapple");


        //========= LOOP =========

        /*
        for (int i = 0; i < fruits.length; i++){
            System.out.print(fruits[i] + " ");
        }
         */


        //========= LOOP - Sorted =========


        for (String fruit : fruits){
            System.out.println(fruit);
        }



        }
    }
