package com.Variable_Scope;

import java.util.Random;

public class LocalScopeEngine {

    public static void main(String[] args) {
        // Local to the main method frame [04:26:45]
        Random random = new Random();
        int luckyNumber = random.nextInt(100) + 1;

        // Data must be explicitly passed down the pipeline via an argument!
        revealNumber(luckyNumber);
    }

    public static void revealNumber(int receivedNumber) {
        // System.out.println(luckyNumber); ❌ Compilation Error! 'luckyNumber' is invisible here.
        System.out.println("Local Data Pipeline Delivery: " + receivedNumber);
    }
}