package com.SubStrings;

public class Main {
    public static void main(String[] args) {

        // Zero-indexed string tracking:
        // C  o  m  p  u  t  e  r  _  S  c  i  e  n  c  e
        // 0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15
        String courseName = "Computer_Science";

        // 1. Single-Parameter Extraction (From index to the end)
        String secondWord = courseName.substring(9);
        System.out.println("Extracted Tail Segment: " + secondWord); // Outputs: Science

        // 2. Two-Parameter Extraction (Inclusive, Exclusive)
        // Starts at index 0 ('C'), stops right before index 8 ('_')
        String firstWord = courseName.substring(0, 8);
        System.out.println("Extracted Head Segment: " + firstWord); // Outputs: Computer

        // 3. Dynamic Extraction combination using indexOf()
        // Dynamically locate the delimiter character spot
        int delimiterSpot = courseName.indexOf("_");
        String dynamicFirstWord = courseName.substring(0, delimiterSpot);

        System.out.println("Delimiter Position Found At: " + delimiterSpot);
        System.out.println("Dynamic Extraction Result: " + dynamicFirstWord);
    }
}

