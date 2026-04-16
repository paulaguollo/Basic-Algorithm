// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Conditionals
// Exercise : Ex03 — 10% discount on purchases >= 100€
// Goal     : Apply a 10% discount if the price is >= 100,
//            otherwise display the original price
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ EXTRA CONDITIONALS | EX03 ___________");
        System.out.println("Spend more than 100 euros and get a 10% discount");

        double price, discountedPrice;

        System.out.print("Enter the price: ");
        price = input.nextDouble();

        // Pre-calculate the discounted price (multiply by 0.90 = 10% off)
        discountedPrice = price * 0.90;

        // Only apply the discount if the price is >= 100
        if (price >= 100) {
            System.out.println(discountedPrice + "$ is the value with 10% discount");
        } else {
            System.out.println(price + "$ has no discount. It must be at least 100$");
        }

    }
}
