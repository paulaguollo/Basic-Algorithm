// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex06 — Sort two numbers (max → min)
// Goal     : Display two numbers in descending order
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX06 ___________");
        System.out.println("You can see the max and min value");

        int value1, value2;

        System.out.print("Enter first value: ");
        value1 = input.nextInt();

        System.out.print("Enter second value: ");
        value2 = input.nextInt();

        // If value1 is greater, print value1 (maximum) first
        // Otherwise value2 is the greater and is printed first
        if (value1 > value2) {
            System.out.println(value1 + " " + value2); // max → min
        } else {
            System.out.println(value2 + " " + value1); // max → min
        }
    }
}
