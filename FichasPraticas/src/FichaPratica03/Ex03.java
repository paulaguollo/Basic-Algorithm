// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex03 — Odd numbers between 531 and 750
// Goal     : Print only odd numbers in the range [531, 750]
// ============================================================

package FichaPratica03;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("__________ FP03 | EX03 ___________");
        System.out.println("A program that shows just the odd numbers from 531 to 750");

        int num = 531; // 531 is odd → correct starting point

        // Traverse the range; the if filters only odd numbers (remainder ≠ 0)
        // The increment of 2 keeps us always on odd numbers
        while (num <= 750) {
            if (num % 2 != 0) {  // != 0 means there is a remainder → odd number
                System.out.println(num);
                num = num + 2;   // jump to the next odd number
            }
        }
    }
}
