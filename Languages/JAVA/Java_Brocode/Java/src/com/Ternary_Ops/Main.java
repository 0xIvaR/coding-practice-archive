package com.Ternary_Ops;

public class Main {
    public static void main(String[] args) {

        int score = 70;
        int num = 3;
        int hours = 13;
        double income = 20000;

        String passOrFail = (score >= 20) ? "PASS" : "FAIL";
        System.out.println(passOrFail);

        String oddOrEven = (num % 2 == 0) ? "EVEN" : "ODD";
        System.out.println(oddOrEven);

        String timeOfDay = (hours < 12) ? "A.M" : "P.M";
        System.out.println(timeOfDay);

        double taxRate = (income >= 40000) ? (25*income) : (15*income);
        System.out.println(taxRate);

    }
}
