// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex09 — Sum of digits of a number
// Goal     : Read an integer and calculate the sum of all its digits
//            Example: 1234 → 1 + 2 + 3 + 4 = 10
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable declarations
        int number, sum = 0, digit;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // The technique uses modular arithmetic to extract digit by digit
        // from right to left
        while (number != 0) {

            // % 10 always returns the last digit (e.g. 1234 % 10 = 4)
            digit = number % 10;

            // Accumulate the extracted digit into the total sum
            sum += digit; // equivalent to sum = sum + digit

            // / 10 removes the last digit (e.g. 1234 / 10 = 123)
            number /= 10; // equivalent to number = number / 10
        }

        System.out.println("The sum of digits is: " + sum);
    }
}
