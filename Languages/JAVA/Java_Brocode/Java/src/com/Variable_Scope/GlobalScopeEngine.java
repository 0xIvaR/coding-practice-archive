package com.Variable_Scope;

import java.util.Random;

public class GlobalScopeEngine {

    // Global Fields: Visible directly to all internal method blocks natively [04:29:55]
    static Random random = new Random();
    static int systemToken; // Static global declaration [04:30:10]

    public static void main(String[] args) {
        systemToken = random.nextInt(9000) + 1000;

        // No arguments needed! The method pulls straight from the shared global space [04:31:00]
        displayGlobalToken();
    }

    public static void displayGlobalToken() {
        // Natively reads 'systemToken' because it shares the class scope
        System.out.println("Global Class Scope Shared Token: " + systemToken);
    }
}