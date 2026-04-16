// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex14 — Check if a sequence is strictly ascending
// Goal     : Read N numbers and determine if the sequence is strictly ascending
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ FP03 | EX14 ___________");
        System.out.println("Check if the entered sequence is ascending");

        int totalNumbers, counter = 1, currentNumber, previousNumber;
        boolean ascending = true; // assumes ascending until proven otherwise

        System.out.print("How many numbers do you want to enter? ");
        totalNumbers = input.nextInt();

        // Read the first number separately to use as the comparison baseline
        System.out.print("Enter a number: ");
        previousNumber = input.nextInt();

        // Read the remaining numbers and compare each with the previous
        while (counter < totalNumbers) {
            System.out.print("Enter a number: ");
            currentNumber = input.nextInt();

            // If the current number is <= the previous, the sequence is no longer ascending
            if (currentNumber <= previousNumber) {
                ascending = false; // marks that it is not ascending (flag stays false)
            }

            previousNumber = currentNumber; // current becomes previous for the next iteration
            counter++;
        }

        if (ascending) {
            System.out.println("The sequence is Ascending");
        } else {
            System.out.println("Not Ascending");
        }
    }
}
