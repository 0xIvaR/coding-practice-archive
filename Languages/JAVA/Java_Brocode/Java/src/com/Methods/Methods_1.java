package com.Methods;

public class Methods_1 {
    public static void main(String[] args) {

        // methods = a block reusable code that is exicuted when called ()

        String name = "Soham";
        int age = 19;

        happyBirthday(name, age);
    }
    static void happyBirthday (String name, int age) {
        Methods_1.happyBirthday(name, age);
    }
}
