package com.T26_Methods;

import java.util.Scanner;

public class Q_3 {
    public static boolean isAccessGranted (int securePasscode, String clearanceRole){

        if (securePasscode == 9999 && clearanceRole.equalsIgnoreCase("Admin")){
            return true;
        };

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputCode = scanner.nextInt();
        String inputRole = scanner.next();

        boolean accessResult = isAccessGranted(inputCode, inputRole);

        String systemMessage = accessResult ? "CRITICAL REBOOT LINK SECURED" : "ACCESS DENIED: DISCONNECTING GATEWAY";

        System.out.println(systemMessage);

        scanner.close();
    }
}

