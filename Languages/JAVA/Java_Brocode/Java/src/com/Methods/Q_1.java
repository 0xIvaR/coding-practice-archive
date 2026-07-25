package com.Methods;

public class Q_1 {
    public static void main(String[] args) {
        printUserBanner("Samantha", 12);

        System.out.println();

        printUserBanner("Alex", 45);
    }
    public static void printUserBanner(String username, int loginStreak){
        System.out.println("========================================");
        System.out.println("WELCOME BACK, " + username.toUpperCase() + "!");
        System.out.println("🔥 Current Login Streak: " + loginStreak + " Days 🔥");
        System.out.println("========================================");
    }
}