// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex06 — Swap two values
// Goal     : Swap the values of two variables without using
//            an auxiliary variable (using arithmetic)
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ FP01 | EX06 ___________");
        System.out.println("Enter two integer values");

        // aux is declared but only used in the commented version below
        int value1, value2, aux;

        System.out.print("First number: ");
        value1 = input.nextInt();
        System.out.print("Second number: ");
        value2 = input.nextInt();

        // ── Classic version with auxiliary variable (commented out) ────────────
        // aux    = value1;   // temporarily stores value1
        // value1 = value2;   // value1 receives value2
        // value2 = aux;      // value2 receives the stored value1
        // ──────────────────────────────────────────────────────────────────────

        // ── Version without auxiliary variable (using arithmetic) ──────────────
        // Step 1: value1 becomes the sum of both
        value1 = value1 + value2;
        // Step 2: subtracting value2 (still original) gives back original value1
        value2 = value1 - value2;
        // Step 3: subtracting new value2 (= original value1) gives back original value2
        value1 = value1 - value2;
        // ──────────────────────────────────────────────────────────────────────

        System.out.println("Swapped values: " + value1 + " | " + value2);
    }
}
