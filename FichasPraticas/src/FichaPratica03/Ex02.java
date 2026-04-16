// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex02 — Even numbers between 1 and 400
// Goal     : Print only even numbers in the range [1, 400]
// ============================================================

package FichaPratica03;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("__________ FP03 | EX02 ___________");
        System.out.println("A program that shows just the even numbers between 1-400");

        int num = 2; // starts at the first even number

        // Advances by 2 to only visit even numbers
        // The if checks parity (redundant here, since num starts even and jumps by 2)
        while (num <= 400) {
            if (num % 2 == 0) {  // % 2 == 0 confirms it is even
                System.out.println(num);
                num = num + 2;   // jump directly to the next even number
            }
        }
    }
}
