// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex07 — Purchase total with 10% discount
// Goal     : Sum the price of 3 products and apply a 10% discount
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ FP01 | EX07 ___________");
        System.out.println("Enter the price of each of the 3 products and I will tell you how much you pay with a 10% discount");

        // Individual prices and the final total after discount
        double value1, value2, value3;
        double finalValue;
        double discount = 0.9; // multiplying by 0.9 applies a 10% discount

        // Read the price of each product
        System.out.print("Price of the first product: ");
        value1 = input.nextDouble();
        System.out.print("Price of the second product: ");
        value2 = input.nextDouble();
        System.out.print("Price of the third product: ");
        value3 = input.nextDouble();

        // Sum of the three prices and apply the discount in a single variable
        finalValue = value1 + value2 + value3;
        finalValue = finalValue * discount; // 10% discount

        System.out.println("You should pay: " + finalValue + "€ with 10% discount already included :)");
    }
}
