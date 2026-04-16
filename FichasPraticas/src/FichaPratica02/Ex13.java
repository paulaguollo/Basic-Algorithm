// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex13 — Convert 24h time to AM/PM format
// Goal     : Read hours and minutes and display in AM/PM format
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX13 ___________");
        System.out.println("Time conversion to AM/PM");

        int hours, minutes;

        System.out.print("Hours: ");
        hours = input.nextInt();

        System.out.print("Minutes: ");
        minutes = input.nextInt();

        // If hours < 12 we are in the morning (AM)
        // If hours >= 12 we are in the afternoon/evening (PM) and subtract 12
        if (hours < 12) {
            System.out.println(hours + ":" + minutes + " AM");
        } else {
            hours = hours - 12; // convert to 12h format
            System.out.println(hours + ":" + minutes + " PM");
        }
    }
}
