// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Conditionals
// Exercise : Ex02 — Weight on the Moon
// Goal     : Calculate the equivalent weight on the Moon
//            (lunar weight ≈ 16% of Earth weight) and validate input
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ EXTRA CONDITIONALS | EX02 ___________");
        System.out.println("This would be your weight on the Moon");

        double weight, moonWeight;

        System.out.print("Enter weight in kg: ");
        weight = input.nextDouble();

        // The Moon's gravity is ~16% of Earth's
        moonWeight = weight * 0.16;

        // Validation: weight must be positive to make sense
        if (weight > 0) {
            System.out.println("Your weight on the Moon: " + moonWeight + " kg");
        } else {
            System.out.println("Invalid weight. Please try again with a number greater than 0.");
        }
    }
}
