package com.T08_Random_Numbers;

import java.util.Random;

public class HeadsTails {
    public static void main(String[] args) {

        Random random = new Random();

        boolean dice = random.nextBoolean();

        if (dice) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }
    }
}

