// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex11 — Sequence with defined step and limit
// Goal     : Read a step and a limit and print the numbers
//            from 0 to the limit using the given step
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ FP03 | EX11 ___________");
        System.out.println("Choose a limit and a step and I will show you the numbers up to the limit");

        int limit, step, number = 0; // number always starts at 0

        System.out.print("Enter the step: ");
        step = input.nextInt();

        System.out.print("Enter the limit: ");
        limit = input.nextInt();

        // Each iteration prints the current number and advances by the defined step
        while (number <= limit) {
            System.out.println(number);
            number = number + step;
        }
    }
}
