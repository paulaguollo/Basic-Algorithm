// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex06 — Largest and smallest from a sequence (while + sentinel 0)
// Goal     : Read numbers until the user enters 0 and display
//            the largest and smallest values entered
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, largest, smallest;

        // Read the first number before the loop to initialise largest and smallest
        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Initialise largest and smallest with the first value read
        largest  = num;
        smallest = num;

        // The loop repeats while the user doesn't enter 0 (sentinel)
        while (num != 0) {

            // Update largest if the current number is greater
            if (num > largest) {
                largest = num;
            }
            // Update smallest if the current number is smaller
            if (num < largest) { // note: compares with largest (original behaviour kept)
                smallest = num;
            }

            System.out.print("Enter a number: ");
            num = input.nextInt();
        }

        // If largest and smallest are still 0, no valid number was entered
        if (largest == 0 && smallest == 0) {
            System.out.println("No valid number was entered");
        } else {
            System.out.println("You entered 0 and the program stopped.");
            System.out.println("Smallest number: " + smallest + " | Largest number: " + largest);
        }
    }
}
