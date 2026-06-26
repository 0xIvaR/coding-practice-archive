package com.Logical_Ops;

import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double coreTemperature;
        boolean coolingPumpActive;
        boolean emergencyOverridePressed;

        System.out.print("Enter Core Temperature (°C): ");
        coreTemperature = scanner.nextDouble();

        System.out.print("Is Cooling Pump Active? (true/false): ");
        coolingPumpActive = scanner.nextBoolean();

        System.out.print("Is Emergency Override Pressed? (true/false): ");
        emergencyOverridePressed = scanner.nextBoolean();

        boolean triggerAlarm = (coreTemperature > 90.0 && !coolingPumpActive) && !emergencyOverridePressed;

        if (triggerAlarm) {
            System.out.println("=========================================");
            System.out.println("⚠️  CRITICAL SYSTEM ALARM ACTIVATED ⚠️");
            System.out.println("=========================================");
            System.out.println("Core Temperature Status: OVERHEATING");
            System.out.println("Cooling System: OFFLINE");
            System.out.println("=========================================");
        } else {
            System.out.println("System Status: Operational - Systems Stable.");
        }

    }
}
