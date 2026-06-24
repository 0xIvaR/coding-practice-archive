package com.Array_EnterUserInput;
import java.util.Scanner;

public class Main_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String [] foods;
        int length;

        System.out.print("Enter the number of foods: ");
        length = scanner.nextInt();
        scanner.nextLine();

        foods = new String[length];

        for (int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods [i] = scanner.nextLine();
        }

        for (String food : foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
