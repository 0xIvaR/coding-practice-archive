package com.Variable_Scope;

public class Q_2 {

    static String firmwareVersion = "v1.0.4";
    static int updateCount = 0;

    public static void upgradeFirmware() {
        firmwareVersion = "v2.0.0";
        updateCount++;
    }

    public static void main(String[] args) {
        System.out.println("--- Before Upgrade ---");
        System.out.println("Firmware: " + firmwareVersion);
        System.out.println("Update Count: " + updateCount);

        // Call the mutation tool
        upgradeFirmware();

        // Print altered states to observe the changes across execution rooms
        System.out.println("\n--- After Upgrade ---");
        System.out.println("Firmware: " + firmwareVersion);
        System.out.println("Update Count: " + updateCount);
    }
}
