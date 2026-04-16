// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex09 — Average of numbers until -1 is entered
// Goal     : Read numbers until the user types -1 (sentinel)
//            and calculate the average of the entered values
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP03 | EX09 ___________");
        System.out.println("Give me numbers, until you enter -1, I will calculate the average (excluding -1).");

        double num = 0, counter = 0, sum = 0, average;

        // The loop repeats while the user hasn't entered -1 (sentinel value)
        while (num != -1) {
            System.out.print("Enter a number (-1 to stop): ");
            num = input.nextDouble();
            sum = sum + num; // accumulates all values, including the -1
            counter++;       // counts all entries, including the -1
        }

        // Correct for the -1 that was incorrectly summed and counted
        sum     = sum + 1;      // cancel the -1 that was summed (sum - (-1) = sum + 1)
        counter = counter - 1;  // discount the count of -1

        average = sum / counter;
        System.out.println("The average is: " + average);
    }
}
