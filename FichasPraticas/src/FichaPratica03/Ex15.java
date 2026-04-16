// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex15 — Factorial of a number
// Goal     : Read a non-negative integer and calculate its factorial
//            Example: 5! = 5 × 4 × 3 × 2 × 1 = 120
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = input.nextInt();

        // Stores the original value to use in the final message
        // (n will be modified during the loop)
        int originalN = n;
        int factorial = 1; // accumulator starts at 1 (neutral element for multiplication)

        // If n is 0 or 1 the factorial is 1 and the loop never runs
        // For n > 1: multiply factorial by n, n-1, n-2, … down to 2
        while (n > 1) {
            factorial = factorial * n;
            n--; // decrement to the next factor
        }

        System.out.println("Factorial of " + originalN + " = " + factorial);
    }
}
