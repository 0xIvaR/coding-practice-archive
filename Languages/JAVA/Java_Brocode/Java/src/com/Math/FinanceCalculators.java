package com.Math;

public class FinanceCalculators {

    public static double simpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static double compoundAmount(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time);
    }

    public static double compoundInterest(double principal, double rate, double time) {
        double amount = compoundAmount(principal, rate, time);
        return amount - principal;
    }

    public static double profit(double sellingPrice, double costPrice) {
        return sellingPrice - costPrice;
    }

    public static double profitPercentage(double sellingPrice, double costPrice) {
        double profit = profit(sellingPrice, costPrice);
        return (profit * 100) / costPrice;
    }

    public static double loss(double costPrice, double sellingPrice) {
        return costPrice - sellingPrice;
    }

    public static double lossPercentage(double costPrice, double sellingPrice) {
        double loss = loss(costPrice, sellingPrice);
        return (loss * 100) / costPrice;
    }
}
