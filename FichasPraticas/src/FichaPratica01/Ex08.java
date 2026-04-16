// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex08 — Total duration of an album (3 songs)
// Goal     : Sum the duration of 3 songs (min:sec) and display
//            the total in hh:mm:ss format
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP01 | EX08 ___________");
        System.out.println("I will calculate the total duration of your album");

        // Variables for the final result in h/m/s
        int totalMinutes, totalSeconds, convertMinutes, sumSeconds;
        int hh, mm, ss;

        // Variables for minutes and seconds of each song
        int minutes1, minutes2, minutes3;
        int seconds1, seconds2, seconds3;

        // Read song 1 duration
        System.out.print("How many minutes does song 1 have? ");
        minutes1 = input.nextInt();
        System.out.print("How many seconds does song 1 have? ");
        seconds1 = input.nextInt();

        // Read song 2 duration
        System.out.print("How many minutes does song 2 have? ");
        minutes2 = input.nextInt();
        System.out.print("How many seconds does song 2 have? ");
        seconds2 = input.nextInt();

        // Read song 3 duration
        System.out.print("How many minutes does song 3 have? ");
        minutes3 = input.nextInt();
        System.out.print("How many seconds does song 3 have? ");
        seconds3 = input.nextInt();

        // Sum all seconds and minutes
        totalSeconds = seconds1 + seconds2 + seconds3;
        totalMinutes = minutes1 + minutes2 + minutes3;

        // Convert total minutes to seconds and add to all seconds
        convertMinutes = totalMinutes * 60;
        sumSeconds     = totalSeconds + convertMinutes; // everything in seconds

        // Convert total seconds to hours, minutes and seconds
        hh = sumSeconds / 3600;                      // how many full hours fit
        mm = sumSeconds / 60 - (hh * 60);            // remaining minutes after hours
        ss = sumSeconds - (hh * 3600) - (mm * 60);   // remaining seconds

        System.out.println("Total: " + hh + "h" + mm + "m" + ss + "s");
    }
}
