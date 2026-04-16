// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex05_02 — Centred pyramid with row number
// Goal     : Print a pyramid where row N has (2N-1)
//            repetitions of digit N, centred with spaces
//            Example (5 rows):
//                1
//               222
//              33333
//             4444444
//            555555555
// ============================================================

package FichaExtraCiclos;

public class Ex05_02 {
    public static void main(String[] args) {

        int rows   = 5;          // total number of rows
        int spaces = rows - 1;   // initial spaces (maximum on the 1st row)

        // Outer loop: i is the row number and the digit to print
        for (int i = 1; i <= rows; i++) {

            // Print alignment spaces (centres the pyramid)
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print (2*i - 1) repetitions of digit i
            // Formula: row 1 → 1 digit; row 2 → 3; row 3 → 5; etc.
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(i);
            }

            System.out.println();

            // Reduce left spaces for the next row
            spaces--;
        }
    }
}
