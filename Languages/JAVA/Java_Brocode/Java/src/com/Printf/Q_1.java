package com.Printf;

public class Q_1 {
    public static void main(String[] args) {

        String product = "Gaming Laptop";
        int quantity = 2;
        double itemPrice = 1249.995;
        double subTotal = itemPrice*quantity;

        System.out.printf("Product : %s\n", product);
        System.out.printf("Quantity : %d\n", quantity);
        System.out.printf("Item Price : $%.2f\n", itemPrice);
        System.out.printf("Subtotal: $%.2f\n", subTotal);

    }
}
