// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex08 — 5 predecessors and 5 successors of a number
// Goal     : Read an integer and print the 5 numbers before it
//            and the 5 numbers after it (not including itself)
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ FP03 | EX08 ___________");
        System.out.println("A program that reads an integer and prints the 5 previous and the 5 following.");

        int num, prev, succ;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Calculate the start of predecessors and the end of successors
        prev = num - 5; // first predecessor to print
        succ = num + 5; // last successor to print

        // Predecessors loop: from (num-5) to (num-1)
        while (prev < num) {
            System.out.println(prev);
            prev++; // move towards num
        }

        // Blank line to separate predecessors from successors
        num++; // advance num so it doesn't appear in the successor list
        System.out.println();

        // Successors loop: from (num+1) to (num+5)
        while (succ >= num) {
            System.out.println(num); // print the current value of num (already advanced)
            num++;
        }
    }
}
