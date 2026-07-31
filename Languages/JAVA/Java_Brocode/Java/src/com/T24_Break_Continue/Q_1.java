package com.T24_Break_Continue;

public class Q_1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){

            if (i == 6){
                System.out.printf("Critical failure found at item %d. Aborting scan!", i);
                break;
            }

            System.out.println("Scanning item: "+i);
        }
    }
}

