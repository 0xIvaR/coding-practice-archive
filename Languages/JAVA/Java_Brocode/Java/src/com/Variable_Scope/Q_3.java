package com.Variable_Scope;

public class Q_3 {
    // 1. GLOBAL FIELD (The Shared Hallway Value)
    static int userScore = 100;

    // 2. AUXILIARY METHOD (No local variable present, reads from the hallway)
    public static void printTrueGlobalScore() {
        System.out.println("Global Score (from auxiliary method): " + userScore);
    }

    // 3. MAIN EXECUTION ENGINE
    public static void main(String[] args) {
        // Local Variable (The Desk Sticky Note)
        // This completely shadows/hides the global field inside this method room
        int userScore = 45;

        // Prints 45 because the local variable takes priority
        System.out.println("Local Score (inside main due to shadowing): " + userScore);

        // Calls the auxiliary method which breaks out of main's local scope
        printTrueGlobalScore();
    }
}