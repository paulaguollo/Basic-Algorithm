// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex01 — Print 1 to 500 with for
// Goal     : Use a for loop to list all integers from 1 to 500
// ============================================================

package FichaExtraCiclos;

public class Ex01 {
    public static void main(String[] args) {

        // for loop: initialisation (i=1) | condition (i<=500) | increment (i++)
        // More compact than while when the exact number of iterations is known
        for (int i = 1; i <= 500; i++) {
            System.out.println(i);
        }
    }
}
