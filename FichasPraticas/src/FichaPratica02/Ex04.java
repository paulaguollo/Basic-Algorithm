// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex04 — F1 points per finishing position (switch)
// Goal     : Given a driver's finishing position, display
//            how many points they receive (1st=10, 2nd=8, …, 8th=1)
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX04 ___________");
        System.out.println("How many points will the pilot win?");

        int place;

        System.out.print("Enter pilot's place: ");
        place = input.nextInt();

        // switch compares the value of 'place' with each case
        // break prevents execution from "falling through" to the next case
        // default runs when no case matches
        switch (place) {
            case 1:
                System.out.println("Win 10 points");
                break;
            case 2:
                System.out.println("Win 8 points");
                break;
            case 3:
                System.out.println("Win 6 points");
                break;
            case 4:
                System.out.println("Win 5 points");
                break;
            case 5:
                System.out.println("Win 4 points");
                break;
            case 6:
                System.out.println("Win 3 points");
                break;
            case 7:
                System.out.println("Win 2 points");
                break;
            case 8:
                System.out.println("Win 1 point");
                break;
            default:
                System.out.println("Place higher than 8th — 0 points");
        }
    }
}
