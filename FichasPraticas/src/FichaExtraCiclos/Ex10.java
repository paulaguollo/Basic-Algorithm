// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex10 — Reverse the digits of a number
// Goal     : Read an integer and display its digits reversed
//            Example: 1234 → 4321
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable declarations
        int number, reversedNumber = 0, digit = 0;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Uses the same digit-by-digit extraction technique as Ex09,
        // but instead of summing, builds the reversed number
        while (number != 0) {

            // Extract the last digit of the number
            digit = number % 10;

            // Shift already collected digits one place to the left
            // and append the new digit in the units position
            // Ex: 43 → 43*10 + 2 = 432
            reversedNumber = reversedNumber * 10 + digit;

            // Remove the last digit from the original number
            number /= 10;
        }

        System.out.println("Result: " + reversedNumber);
    }
}
