package com.Methods;

public class CheckoutEngine {

    // 🌟 1. GLOBAL CONSTANTS (Declared at the Class level)
    // 'final' makes it a constant (it cannot be changed after initialization).
    // 'static' allows our static methods to read it directly anywhere in this file.
    public static final double TAX_RATE = 0.18;      // 18% Standard Tax
    public static final double DELIVERY_FEE = 50.00; // Flat ₹50 shipping charge


    // ⚙️ 2. THE CENTRAL CONTROL ROOM (Main Method)
    public static void main(String[] args) {

        System.out.println("--- 🛒 PROCESSING CUSTOMER CHECKOUTS --- \n");

        // --- FIRST USE CASE: Soham buys a Gaming Mouse ---
        double mousePrice = 1200.00;

        // We call our reusable method and save the returned answer
        double finalMouseBill = calculateTotalInvoice(mousePrice);
        System.out.printf("Invoice 1 (Gaming Mouse Total): ₹%.2f\n\n", finalMouseBill);


        // --- SECOND USE CASE: Ankur buys a Laptop Stand ---
        double standPrice = 800.00;

        // We reuse the EXACT same method block, passing a different value into the slot!
        double finalStandBill = calculateTotalInvoice(standPrice);
        System.out.printf("Invoice 2 (Laptop Stand Total): ₹%.2f\n\n", finalStandBill);

    }


    // 🛠️ 3. THE REUSABLE REVENUE METHOD (Value-Returning)
    // Parameter Slot: 'double itemPrice' (Expects a decimal number argument)
    // Return Type: 'double' (Promises to pass a decimal total back to main)
    public static double calculateTotalInvoice(double itemPrice) {

        // This method automatically reaches outside its box to pull the global constants!
        double calculatedTax = itemPrice * TAX_RATE;
        double finalTotal = itemPrice + calculatedTax + DELIVERY_FEE;

        // Logging internal diagnostic steps to show the method is actively working
        System.out.println("[Method Active] Processing raw price: ₹" + itemPrice);
        System.out.println("[Method Active] Applied Tax Component: ₹" + calculatedTax);

        return finalTotal; // Pushes the completed calculation back out
    }
}