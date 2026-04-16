// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex03 — Multiplication table from 1 to 10 (nested for)
// Goal     : Use two nested for loops to print the complete
//            multiplication table from 1 to 10
// ============================================================

package FichaExtraCiclos;

public class Ex03 {
    public static void main(String[] args) {

        // Outer loop: iterates through the number whose table is shown (1 to 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Multiplication table of " + i + ":");

            // Inner loop: iterates through the multipliers (1 to 10)
            // For each value of i, this loop runs 10 times
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.println(i + " x " + j + " = " + result);
            }

            System.out.println(); // blank line between tables
        }

    }
}
