// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex07 — Count positives and negatives (sentinel 0)
// Goal     : Read numbers until 0 is entered and count how many
//            were positive and how many were negative
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, negativeCount = 0, positiveCount = 0;
        // negativeCount and positiveCount are counters, initialised to 0

        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Sentinel loop: ends when the user enters 0
        while (num != 0) {

            if (num > 0) {
                positiveCount++; // increment the positive counter
            }
            if (num < 0) {
                negativeCount++; // increment the negative counter
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        // If both counters are 0, only the sentinel was entered
        if (negativeCount == 0 && positiveCount == 0) {
            System.out.println("No valid number was entered");
        } else {
            System.out.println("You entered 0 and the program stopped.");
            System.out.println("Number of positive values: " + positiveCount);
            System.out.println("Number of negative values: " + negativeCount);
        }
    }
}
