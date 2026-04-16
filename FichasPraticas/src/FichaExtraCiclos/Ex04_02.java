// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex04_02 — Growing triangle of asterisks
// Goal     : Print a triangle where row N has N asterisks
//            Example (5 rows):
//            *
//            **
//            ***
//            ****
//            *****
// ============================================================

package FichaExtraCiclos;

public class Ex04_02 {
    public static void main(String[] args) {

        int rows = 5; // total number of rows in the triangle

        // Outer loop: i represents the current row (and how many '*' to print)
        for (int i = 0; i <= rows; i++) {

            // Inner loop: prints i asterisks (row 0 → none; row 1 → one; etc.)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Move to the next row after each line of asterisks
            System.out.println();
        }

    }

}
