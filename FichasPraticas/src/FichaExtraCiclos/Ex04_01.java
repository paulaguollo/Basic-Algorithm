// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Loops
// Exercise : Ex04_01 — Rectangle pattern of asterisks
// Goal     : Print a rectangle of asterisks with
//            4 rows and 10 columns using two nested for loops
// ============================================================

package FichaExtraCiclos;

public class Ex04_01 {
    public static void main(String[] args) {

        int rows    = 4;  // total number of rows in the rectangle
        int columns = 10; // total number of columns in the rectangle

        // Outer loop: controls each row
        for (int i = 0; i < rows; i++) {

            // Inner loop: prints one '*' per column (no newline)
            for (int j = 0; j < columns; j++) {
                System.out.print("*");
            }

            // After filling a complete row, move to the next line
            System.out.println();
        }

    }

}
