// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex02 — Multiples of 3 up to 255
// Goal     : Print only numbers divisible by 3
//            in the range [1, 255]
// ============================================================

package FichaExtraCiclos;

public class Ex02 {
    public static void main(String[] args) {

        // Traverses all numbers from 1 to 255
        // The if inside the for filters only multiples of 3
        for (int i = 1; i <= 255; i++) {
            if (i % 3 == 0) { // remainder of division by 3 equals 0 → multiple of 3
                System.out.println(i);
            }
        }
    }
}
