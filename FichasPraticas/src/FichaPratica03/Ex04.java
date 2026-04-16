// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex04 — Sequence from 0 to N
// Goal     : Read a number N and print all integers from 0 to N
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP03 | EX04 ___________");
        System.out.println("Enter a number and I will show you the sequence up to it");

        int num; // upper limit of the sequence
        int i = 0; // counter — starts at 0

        System.out.print("Enter number: ");
        num = input.nextInt();

        // Prints all values of i from 0 to num (inclusive)
        while (i <= num) {
            System.out.print(i);
            i++; // equivalent to i = i + 1
        }
    }
}
