// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex14 — Sort three numbers in ascending order
// Goal     : Read three integers and display them from smallest to largest
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX14 ___________");
        System.out.println("Tell me 3 numbers and I give them back in ascending order");

        int a, b, c;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.print("Enter third number: ");
        c = input.nextInt();

        // Strategy: first identify the smallest of the three
        // then within each block sort the remaining two

        if (a < b && a < c) {
            // 'a' is the smallest — decide the order of b and c
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }

        if (b < a && b < c) {
            // 'b' is the smallest — decide the order of a and c
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }

        if (c < a && c < b) {
            // 'c' is the smallest — decide the order of a and b
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
