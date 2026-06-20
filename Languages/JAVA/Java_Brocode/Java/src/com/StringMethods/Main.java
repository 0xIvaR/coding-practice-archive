package com.StringMethods;

public class Main {
    public static void main(String[] args) {

        String name = "Bro Code";

        int length = name.length();
        char letter = name.charAt(5);
        int index = name.indexOf(" ");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace("o", "a");


        if (name.isEmpty()) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }


        if (name.contains(" ")) {
            System.out.println("Your name have a space");
        } else {
            System.out.println("Your name had no space");
        }

        if (name.equals("password")) {
            System.out.println("Not eligible");
        } else {
            System.out.println("Hello" + name);
        }

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Not eligible");
        } else {
            System.out.println("Hello" + name);
        }

        System.out.println(lastIndex);
    }
}
