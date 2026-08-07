package com.T32_User_Input_Array;

import java.util.Scanner;

public class Q_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the total count of subjects: ");
        int count = scanner.nextInt();

        int[] marks = new int[count];

        for (int i = 0; i < count; i++){
            System.out.printf("Enter marks for subject %d: ", i);
            marks[i] = scanner.nextInt();
        }

        System.out.println();
        System.out.println("""
                =====================================
                    STUDENT MARKS SUMMARY REGISTER  
                =====================================""");

        // FIX: Declare the index tracker OUTSIDE the loop so it persists and increments
        int subjectIndex = 0;
        for (int mark : marks){
            System.out.printf("Subject %d Score: %d\n", subjectIndex, mark);
            subjectIndex++; // Increments correctly from 0 to 1, 2, 3...
        }

        System.out.println("=====================================");
        scanner.close();
    }
}