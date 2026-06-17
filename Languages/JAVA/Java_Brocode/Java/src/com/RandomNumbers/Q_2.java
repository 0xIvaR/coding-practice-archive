package com.RandomNumbers;

import java.util.Random;

public class Q_2 {
    public static void main(String[] args) {

        // Exercise 2: RPG Combat Damage Simulator
        //Task: Simulating a critical hit mechanic inside a classic game structure:
        //
        //Generate a random damage payload integer value between 15 and 30 points.
        //
        //Perform a 50/50 randomized trigger event flag (using nextBoolean()).
        //
        //If the boolean event state is true, multiply the generated damage calculation payload by 2 to represent a "CRITICAL HIT!".
        //
        //Display the final calculated damage output cleanly to the user console.

        Random random = new Random();

        int baseDamage;
        boolean isLucky;

        baseDamage = random.nextInt(15, 31);
        isLucky = random.nextBoolean();

        if (isLucky) {
            System.out.println("My attack dealt CRITICAL HIT! " + (baseDamage*2) + " points");
        } else {
            System.out.println("My attack dealt NORMAL HIT! " + (baseDamage) + " points");
        }

    }
}
