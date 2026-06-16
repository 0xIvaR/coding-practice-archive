package com.Primitive;

public class NonPrimitive_String {
    public static void main(String[] args) {

        // 1. Declaration and Initialization
        // 'String' starts with a capital letter because it is a Class (Non-Primitive).
        String message = "  Hello Java Developer!  ";

        // 2. Prove that it is Non-Primitive (Using the Dot Operator)
        // Primitive types cannot use methods, but look at what String can do:

        // Example A: Get the length of the text
        int size = message.length();

        // Example B: Convert everything to uppercase
        String loudMessage = message.toUpperCase();

        // Example C: Remove the empty spaces from the start and end
        String cleanMessage = message.trim();

        // 3. Printing the results
        System.out.println("Original: " + message);
        System.out.println("Character count: " + size);
        System.out.println("Loud version: " + loudMessage);
        System.out.println("Clean version: " + cleanMessage);
    }
}
