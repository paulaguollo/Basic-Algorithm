// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex07 — Even or Odd
// Goal     : Determine if an integer is even or odd
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX07 ___________");
        System.out.println("Is the number even or odd?");

        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();

        // The % (modulo) operator returns the remainder of division
        // If the remainder of number / 2 is 0, the number is even
        // Otherwise it is odd
        if (number % 2 == 0) {
            System.out.println("Is even");
        } else {
            System.out.println("Is odd");
        }
    }
}
