// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex10 — Even numbers up to a limit
// Goal     : Read a limit and print all even numbers from 2 to that limit
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP03 | EX10 ___________");
        System.out.println("Give me a number greater than 2 and I will show you the even numbers from 2 to the limit");

        int limit, number = 2, step = 2;
        // number: starts at the first even number (2)
        // step  : advances by 2 to always stay on even numbers

        System.out.print("Enter limit number: ");
        limit = input.nextInt();

        // Print even numbers while they don't exceed the limit
        while (number <= limit) {
            System.out.println(number);
            number = number + step; // advance to the next even number
        }
    }
}
