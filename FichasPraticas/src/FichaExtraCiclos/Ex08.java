// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex08 — Power without Math.pow (for)
// Goal     : Calculate base^exponent through successive multiplications
//            using a for loop
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, exponent, result = 1;
        // result starts at 1 (neutral element of multiplication)

        System.out.println("Enter two numbers and I will give you the result of the power");
        System.out.print("Enter the first number: ");
        base = input.nextDouble();

        System.out.print("Enter the second number: ");
        exponent = input.nextDouble();

        // Multiplies 'result' by 'base' as many times as 'exponent' indicates
        // Ex: base=3, exponent=4 → 1 * 3 * 3 * 3 * 3 = 81
        for (double i = 1; i <= exponent; i++) {
            result *= base; // equivalent to result = result * base
        }

        System.out.println("The result is: " + result);

    }
}
