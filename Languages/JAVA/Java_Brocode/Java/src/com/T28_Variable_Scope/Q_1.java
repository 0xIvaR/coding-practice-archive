package com.T28_Variable_Scope;

public class Q_1 {
    public static void printLog(String logData){
        System.out.println(logData);
    }

    public static void main(String[] args) {
        String secretMessage = "Alpha_Clearance";
        printLog(secretMessage);
    }
}

