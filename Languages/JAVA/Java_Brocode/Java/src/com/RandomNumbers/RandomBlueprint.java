package com.RandomNumbers;

import java.util.Random;

public class RandomBlueprint {
    public static void main(String[] args) {

        // 1. Instantiate the Random generator engine
        Random random = new Random();

        // 2. Generating basic primitive states
        double randomDecimal = random.nextDouble(); // Generates between 0.0 and 1.0
        boolean coinFlip = random.nextBoolean();    // Generates true or false

        System.out.println("Random Probability Scale: " + randomDecimal);
        System.out.println("Coin Flip Is Heads? " + coinFlip);

        // 3. Range Generation Blueprint (e.g., Custom Gaming Die)
        int minRange = 1;
        int maxRange = 6;

        // Formula: nextInt(max - min + 1) + min
        int standardDieRoll = random.nextInt(maxRange - minRange + 1) + minRange;
        System.out.println("🎲 Rolled a standard die: " + standardDieRoll);

        // 4. Generating an unpredictable range (e.g., Temperature simulation from -10 to 40)
        int lowTemp = -10;
        int highTemp = 40;
        int simulatedTemp = random.nextInt(highTemp - lowTemp + 1) + lowTemp;
        System.out.println("🌡️ Simulated Environment Temp: " + simulatedTemp + "°C");
    }
}
