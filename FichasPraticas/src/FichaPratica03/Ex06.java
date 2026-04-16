// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex06 — Sequence between two numbers
// Goal     : Read two integers (start and end) and print all
//            values in the range [num1, num2]
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ FP03 | EX06 ___________");
        System.out.println("Choose two numbers to define the start and end of the sequence");

        int num1, num2;

        System.out.print("Enter the first number of the sequence: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number of the sequence: ");
        num2 = input.nextInt();

        // num1 serves both as the current value and the counter
        // Increments until it reaches num2 (inclusive)
        while (num1 <= num2) {
            System.out.println(num1);
            num1++; // equivalent to num1 = num1 + 1
        }
    }
}
