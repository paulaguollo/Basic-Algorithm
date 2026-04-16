// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex05_01 — Triangle with repeated row number
// Goal     : Print a triangle where row N repeats digit N
//            exactly N times
//            Example (4 rows):
//            1
//            22
//            333
//            4444
// ============================================================

package FichaExtraCiclos;

public class Ex05_01 {
    public static void main(String[] args) {

        int rows = 4; // total number of rows

        // Outer loop: i is the row number and also the digit to print
        for (int i = 1; i <= rows; i++) {

            // Inner loop: repeats digit i exactly i times
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println(); // new line after each group of digits
        }
    }
}
