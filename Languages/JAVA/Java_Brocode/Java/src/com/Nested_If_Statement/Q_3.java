package com.Nested_If_Statement;

import java.util.Objects;
import java.util.Scanner;

public class Q_3 {
    public static void main(String[] args) {

        // ### **Exercise 3: E-Commerce Smart Shipping Matrix**
        //
        //- **Difficulty Level:** 🔴 **Hard**
        //- **Target Focus:** Multi-tier criteria matrixing and nested decision trees inside both forks of a primary branch.
        //- **The Instructions:**
        //    1. Prompt the user to input their shipping destination zone (`"Domestic"` or `"International"`) and the package weight as a `double`.
        //    2. **Branch A (If destination is `"Domestic"`):** Prompt the user for their checkout purchase total (`double`).
        //        1. If the purchase total is **greater than or equal to 100.0**, shipping is automatically free (`0.00`).
        //        2. If the purchase total is **less than 100.0**, run a nested weight check: If the package weight is $\le 5.0$ kg, shipping is a flat price of `5.00`. If the weight is $> 5.0$ kg, shipping is a flat price of `10.00`.
        //    3. **Branch B (If destination is `"International"`):** Ignore the purchase total completely and run a separate nested weight check directly:
        //        1. If the package weight is $\le 5.0$ kg, international shipping is a flat price of `20.00`.
        //        2. If the package weight is $> 5.0$ kg, international shipping scales to a flat price of `40.00`.
        //    4. Use `printf` to print a clean final shipping invoice displaying the destination zone and the calculated shipping fee rounded to 2 decimal places.

        Scanner scanner = new Scanner(System.in);

        // =========== INPUTS ===========

        String zone;
        double weight;
        double purchaseTotal;
        double shipping = 0;

        // =========== SCANNER ===========

        System.out.print("Enter destination zone (Domestic/International): ");
        zone = scanner.nextLine();

        // =========== MAIN ===========

        if (zone.equalsIgnoreCase("Domestic")) {

            System.out.print("Enter package weight (kg): ");
            weight = scanner.nextDouble();

            System.out.print("Enter purchase total: ");
            purchaseTotal = scanner.nextDouble();

            if (purchaseTotal >= 100) {
                shipping = 0;
            } else {
                if (weight <= 5) {
                    shipping = 5;
                } else {
                    shipping = 10;
                }
            }

        } else if (zone.equalsIgnoreCase("International")) {

            System.out.print("Enter package weight (kg): ");
            weight = scanner.nextDouble();

            if(weight <= 5){
                shipping = 20;
            } else {
                shipping = 40;
            }

        } else {
            System.out.println("Enter valid information!");
        }

        // =========== OUTPUT ===========
        System.out.println("\n");
        System.out.println("=========== SHIPPING INVOICE ===========");
        System.out.printf("Zone: %s\n", zone);
        System.out.printf("Shipping Fee: $%.2f",shipping);

        scanner.close();
    }
}
