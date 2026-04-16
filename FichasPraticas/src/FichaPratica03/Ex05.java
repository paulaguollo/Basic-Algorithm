// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex05 — Repeat a phrase N times
// Goal     : Read a message and a repetition count,
//            and print the message that many times
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP03 | EX05 ___________");
        System.out.println("Choose a number to define how many times you want to print a phrase");

        int times;
        int i = 0;       // iteration counter
        String message;

        System.out.print("How many times do you want to print? ");
        times = input.nextInt();

        // input.nextLine() after nextInt() is necessary to "flush" the \n
        // that remained in the buffer, otherwise nextLine() would read an empty line
        System.out.print("What do you want to print? ");
        input.nextLine(); // discards the residual newline from nextInt()
        message = input.nextLine(); // reads the full phrase (including spaces)

        // Prints the message while the counter has not reached the limit
        while (i < times) {
            System.out.println(message);
            i++;
        }

    }
}
