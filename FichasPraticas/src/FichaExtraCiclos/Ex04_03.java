// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex04_03 — Centred asterisk triangle (pyramid)
// Goal     : Print a centred pyramid of asterisks,
//            with decreasing spaces on the left and growing asterisks
//            Example (5 rows):
//                *
//               ***
//              *****
//             *******
//            *********
// ============================================================

package FichaExtraCiclos;

public class Ex04_03 {
    public static void main(String[] args) {

        int rows       = 5;          // total number of rows in the pyramid
        int spaces     = rows - 1;   // initial spaces (maximum on the 1st row)
        int asterisks  = 1;          // initial asterisks (minimum on the 1st row)

        // Main loop: one iteration per row
        for (int i = 0; i < rows; i++) {

            // Print the spaces before the asterisks (centres the pyramid)
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            // Print the asterisks for the current row
            for (int j = 0; j < asterisks; j++) {
                System.out.print("*");
            }

            // Move to the next row
            System.out.println();

            // Each row: one less space and two more asterisks
            spaces--;
            asterisks += 2;
        }
    }
}
