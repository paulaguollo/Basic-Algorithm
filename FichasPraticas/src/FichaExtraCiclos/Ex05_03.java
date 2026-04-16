// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex05_03 — Mirrored number pattern (pyramid)
// Goal     : Print a pattern where each row N shows numbers
//            from N down to 1 and then from 2 up to N (mirror)
//            Example (4 rows):
//               1
//              212
//             32123
//            4321234
// ============================================================

package FichaExtraCiclos;

public class Ex05_03 {
    public static void main(String[] args) {

        int rows = 4; // total number of rows

        // Outer loop: i represents the current row
        for (int i = 1; i <= rows; i++) {

            // Left spaces to centre the pattern
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            // Left half: count from i down to 1 (descending)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Right half: count from 2 up to i (ascending, mirroring the left)
            // Starts at 2 to avoid repeating the central "1"
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
