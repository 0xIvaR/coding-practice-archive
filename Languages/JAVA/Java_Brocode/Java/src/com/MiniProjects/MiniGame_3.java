package com.MiniProjects;


import java.util.Scanner;

public class MiniGame_3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // SETUP

        double amount;
        double principle;
        int userPercent;
        double rate;
        int freq;
        int time;


        // INPUT

        System.out.println("=================================================");
        System.out.println("🏦 SYSTEM PORTFOLIO INTEREST CALCULATOR 🏦");
        System.out.println("=================================================");
        System.out.println();
        System.out.print("Enter the initial principal investment amount ($): ");
        principle = scanner.nextDouble();
        System.out.print("Enter the annual interest percentage rate (%): ");
        userPercent = scanner.nextInt();
        System.out.print("Enter the number of compounding intervals per year: ");
        freq = scanner.nextInt();
        System.out.print("Enter the total duration lifespan in years: ");
        time = scanner.nextInt();

        // CALCULATION
        rate = (double) userPercent / 100;
        amount = principle * Math.pow(1 + (rate/freq), freq * time);

        // OUTPUT
        System.out.println();
        System.out.println("-------------------------------------------------");
        System.out.println("📊 FINANCIAL PORTFOLIO STATUS UPDATE 📊");
        System.out.println("-------------------------------------------------");

        System.out.printf("Initial Principal: $%,.2f\n",principle);
        System.out.printf("Compounding Scope: %d times per year over %d years", freq, time);
        System.out.println();

        System.out.printf("Final Asset Value Payload: $%,.2f\n", amount);
        System.out.println("-------------------------------------------------");
        scanner.close();
    }
}
