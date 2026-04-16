// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex16 — Decompose a value into banknotes
// Goal     : Given a multiple of 5, calculate the minimum number
//            of banknotes (200, 100, 50, 20, 10, 5) needed
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX16 ___________");
        System.out.println("Enter a multiple of 5 and I will tell you how many banknotes are needed");

        int value, numberOfNotes;

        System.out.print("Enter value: ");
        value = input.nextInt();

        // Only makes sense to decompose if the value is a multiple of 5
        if (value % 5 == 0) {

            // For each denomination: calculate how many notes fit and store the remainder
            // Integer division (/) gives the number of notes; modulo (%) gives the remainder

            numberOfNotes = value / 200;
            System.out.println("Number of 200 notes: " + numberOfNotes);
            value = value % 200; // remainder to decompose

            numberOfNotes = value / 100;
            System.out.println("Number of 100 notes: " + numberOfNotes);
            value = value % 100;

            numberOfNotes = value / 50;
            System.out.println("Number of 50 notes: " + numberOfNotes);
            value = value % 50;

            numberOfNotes = value / 20;
            System.out.println("Number of 20 notes: " + numberOfNotes);
            value = value % 20;

            numberOfNotes = value / 10;
            System.out.println("Number of 10 notes: " + numberOfNotes);
            value = value % 10;

            numberOfNotes = value / 5;
            System.out.println("Number of 5 notes: " + numberOfNotes);

        } else {
            System.out.println("We don't give change for non-multiples of 5");
        }
    }
}
