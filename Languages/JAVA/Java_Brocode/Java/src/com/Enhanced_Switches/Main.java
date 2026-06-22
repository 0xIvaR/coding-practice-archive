package com.Enhanced_Switches;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Enhanced switch = A replacement to many else if statements
        //              (Java14 feature)

        Scanner scanner = new Scanner (System.in);

        String day;
        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch (day) {
            case "Monday", "Tuesday", "Wednesday",  "Thursday", "Friday", "Saturday" -> System.out.println("Its a weekday");
            case "Sunday" -> System.out.println("its a weekend");
            default -> System.out.println("Its not a day");
        }
    }
}
