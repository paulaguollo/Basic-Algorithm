// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex01 — Greater of two numbers
// Goal     : Compare two integers and indicate which one is greater
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX01 ___________");
        System.out.println("Which is the greater number?");

        int value1, value2;

        System.out.print("Enter a value: ");
        value1 = input.nextInt();

        System.out.print("Enter another value: ");
        value2 = input.nextInt();

        // if checks the condition; if value1 is greater, display value1
        // otherwise (else) display value2 (also covers equality)
        if (value1 > value2) {
            System.out.println("The greater value is: " + value1);
        } else {
            System.out.println("The greater or equal value is: " + value2);
        }

    }
}
