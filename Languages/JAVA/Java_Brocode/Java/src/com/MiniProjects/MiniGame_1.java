package com.MiniProjects;

import java.util.Scanner;

public class MiniGame_1 {
    public static void main(String[] args) {

        // 1. INITIALIZE THE INPUT CONSUMER
        Scanner input = new Scanner(System.in);

        // 2. VARIABLE BLUEPRINTING (Declaring slots for the story payload)
        String adjective1; // e.g., suspicious, mysterious, chaotic
        String noun1;      // An animal, person, or place (e.g., developer, giraffe)
        String adjective2; // e.g., smelly, shiny, energetic
        int quantity;      // Practicing numeric type integration
        String verb1;      // Action ending in "ing" (e.g., coding, screaming)
        String adjective3; // e.g., ecstatic, exhausted, terrified

        System.out.println("=========================================");
        System.out.println("📖 WELCOME TO THE JAVA MAD LIBS GAME 📖");
        System.out.println("=========================================\n");

        // 3. COLLECTING INPUT DATA STREAMS
        System.out.print("Enter an adjective (description): ");
        adjective1 = input.nextLine();

        System.out.print("Enter a noun (person, place, or animal): ");
        noun1 = input.nextLine();

        System.out.print("Enter a second adjective: ");
        adjective2 = input.nextLine();

        System.out.print("Enter a whole number (quantity): ");
        quantity = input.nextInt();

        // -------------------------------------------------------------
        // CRITICAL REFRESH: Consumes trailing newline left behind by nextInt()
        input.nextLine();
        // -------------------------------------------------------------

        System.out.print("Enter a verb ending in 'ing' (action): ");
        verb1 = input.nextLine();

        System.out.print("Enter a final adjective (emotional state): ");
        adjective3 = input.nextLine();

        // 4. CLOSING STREAM RESOURCE
        input.close();

        // 5. STITCHING AND GENERATING THE STORY PAYLOAD
        System.out.println("\n-----------------------------------------");
        System.out.println("🎬 YOUR CUSTOM STORY GENERATED BELOW 🎬");
        System.out.println("-----------------------------------------");

        System.out.println("Today, a highly " + adjective1 + " " + noun1 + " broke into the development server room.");
        System.out.println("The intruder appeared to be incredibly " + adjective2 + ".");
        System.out.println("Before security arrived, it managed to steal " + quantity + " mechanical keyboards.");
        System.out.println("When found, the target was caught aggressively " + verb1 + " on the main console frame.");
        System.out.println("Witnessing this runtime event left the lead system engineer feeling completely " + adjective3 + "!");

        System.out.println("-----------------------------------------");
    }
}