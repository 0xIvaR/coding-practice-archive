package com.Variables;

public class Homework {
    public static void main(String[] args) {
        String name = "BroCode";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = true;

        System.out.println("The YouTuber who own GTA " + gta + ". His name is " + name + ". He also knows the value of PI " + pi + ". His gender is " + gender);
        if(isAdmin){
            System.out.println("He is a YouTuber.");
        }
        else{
            System.out.println("He is not.");
        }
    }
}
