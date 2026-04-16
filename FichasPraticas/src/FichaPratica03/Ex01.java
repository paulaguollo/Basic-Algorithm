// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex01 — Print numbers from 1 to 250
// Goal     : Use a while loop to list integers from 1 to 250
// ============================================================

package FichaPratica03;

public class Ex01 {
    public static void main(String[] args) {

        System.out.println("__________ FP03 | EX01 ___________");
        System.out.println("A program that shows 1-250");

        int num = 1; // counter variable — starts at 1

        // The while loop repeats while the condition (num <= 250) is true
        // Each iteration prints the number and increments the counter
        while (num <= 250) {
            System.out.println(num);
            num = num + 1; // move to the next number
        }
    }
}
