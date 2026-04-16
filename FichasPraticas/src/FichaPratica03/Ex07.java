// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex07 — Sum from 1 to 100
// Goal     : Print the numbers from 1 to 100 and display the total sum
// ============================================================

package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("__________ FP03 | EX07 ___________");
        System.out.println("A program that shows numbers from 0 to 100 and their sum");

        int sum = 0; // accumulator — starts at 0 and adds each number
        int i   = 1; // counter — starts at 1

        // Each iteration: print the current number and add it to the accumulator
        while (i <= 100) {
            System.out.println(i);
            sum = sum + i; // accumulate the value of i
            i++;
        }

        // Display the total sum after the loop ends
        System.out.println("The sum is: " + sum);
    }
}
