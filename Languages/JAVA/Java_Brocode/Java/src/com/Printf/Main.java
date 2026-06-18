package com.Printf;

public class Main {
    public static void main(String[] args) {

        // printf() = is a method used to format output
        // %[flags][width][.precision][specific-character]

        // ====================
        // [specific-character]
        // =====================

        String name = "Ivar";
        char firstLetter = 'I';
        int age = 30;
        double height = 60.87;
        boolean isSexy = true;

        System.out.printf("Hello %s\n", name);
        System.out.printf("First letter is %c \n", firstLetter);
        System.out.printf("His age is %d \n", age);
        System.out.printf("His height is %f \n", height);
        System.out.printf("Is sexy %b \n", isSexy);


        System.out.printf("%s is %d years old, and he is so tall like %f \n", name, age, height);
        System.out.println("\n");

        // =============
        // [.precision]
        // =============

        double price1 = 158626.5;
        double price2 = 1567964539.14;
        double price3 = -146257.36;

        System.out.printf("%.1f \n", price1);
        System.out.printf("%.1f \n", price2);
        System.out.printf("%.1f \n", price3);

        System.out.println("\n");

        // =======
        // [flags]
        // =======

        // + = output a plus (+)
        // "," = comma grouping separator
        // "(" = negative numbers are enclosed in ()
        //  space = display a minus if negative, space if positive

        System.out.println("Check + \n");

        System.out.printf("%+.3f \n", price1);
        System.out.printf("%+.3f \n", price2);
        System.out.printf("%+.3f \n", price3);

        System.out.println("\n");

        System.out.println("Check Comma  \n");

        System.out.printf("%,.1f \n", price1);
        System.out.printf("%,.1f \n", price2);
        System.out.printf("%,.3f \n", price3);

        System.out.println("\n");

        System.out.println("Check (  for negative and positive \n");

        System.out.printf("%(.1f \n", price1);
        System.out.printf("%(.1f \n", price2);
        System.out.printf("%(.1f \n", price3);

        System.out.println("\n");

        System.out.println("Check Space \n");

        System.out.printf("% .1f \n", price1);
        System.out.printf("% .1f \n", price2);
        System.out.printf("% .1f \n", price3);

        System.out.println("\n");

        // =======
        // [width]
        // ======

        // 0 = zero padding
        // number = right justified padding
        // negative number = left justified padding

        int id1 = 5;
        int id2 = 25;
        int id3 = 358;
        int id4 = 4739;

        // 0 Padding - after % 0 then how much padding

        System.out.println("0 Padding\n");

        System.out.printf("%05d\n",id1);
        System.out.printf("%05d\n",id2);
        System.out.printf("%05d\n",id3);
        System.out.printf("%05d\n",id4);

        System.out.println("\n");

        // positive number = right justified

        System.out.printf("%4d\n",id1);
        System.out.printf("%4d\n",id2);
        System.out.printf("%4d\n",id3);
        System.out.printf("%4d\n",id4);

        System.out.println("\n");
        // Negative number = left side justified

        System.out.printf("%-4d\n",id1);
        System.out.printf("%-4d\n",id2);
        System.out.printf("%-4d\n",id3);
        System.out.printf("%-4d\n",id4);

    }
}
