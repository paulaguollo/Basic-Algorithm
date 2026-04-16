// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex05 — Sort two numbers (min → max)
// Goal     : Display two numbers in ascending order
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX05 ___________");
        System.out.println("You can see the min and max value");

        int value1, value2;

        System.out.print("Enter first value: ");
        value1 = input.nextInt();

        System.out.print("Enter second value: ");
        value2 = input.nextInt();

        // If value1 is greater, print the smaller one (value2) first
        // Otherwise value1 is already the smaller, print in natural order
        if (value1 > value2) {
            System.out.println(value2 + " " + value1); // min → max
        } else {
            System.out.println(value1 + " " + value2); // min → max
        }

    }
}
