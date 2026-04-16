// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex09 — Minimum of three numbers
// Goal     : Identify the smallest value among three integers
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX09 ___________");
        System.out.println("Which is the min value?");

        int value1, value2, value3;

        System.out.print("Enter first value: ");
        value1 = input.nextInt();

        System.out.print("Enter second value: ");
        value2 = input.nextInt();

        System.out.print("Enter third value: ");
        value3 = input.nextInt();

        // Each if tests a different combination to find the minimum
        // The minimum is the one that is smaller than both others
        if (value1 < value2 && value1 < value3) {
            System.out.println("This is the min value: " + value1 + " | This is the first value you entered");
        }
        if (value2 < value1 && value2 < value3) {
            System.out.println("This is the min value: " + value2 + " | This is the second value you entered");
        }
        if (value3 < value1 && value3 < value2) {
            System.out.println("This is the min value: " + value3 + " | This is the third value you entered");
        }

    }
}
