// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex12 — Count numbers by range
// Goal     : Read positive numbers until a negative one is entered
//            and count how many fall in each range:
//            [0-25], [26-50], [51-75], [76-100]
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP03 | EX12 ___________");
        System.out.println("Enter positive numbers and I will count how many fall in each range (0-25)(26-50)(51-75)(76-100)");

        int num = 0;
        // One counter per range
        int counter1 = 0; // [0-25]
        int counter2 = 0; // [26-50]
        int counter3 = 0; // [51-75]
        int counter4 = 0; // [76-100]

        // The loop runs while the entered number is >= 0
        // A negative number acts as a sentinel to stop
        while (num >= 0) {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            // Classify the number in the matching range and increment the counter
            if      (num >= 0  && num <= 25)  { counter1++; }
            else if (num >= 26 && num <= 50)  { counter2++; }
            else if (num >= 51 && num <= 75)  { counter3++; }
            else if (num >= 76 && num <= 100) { counter4++; }
            // Numbers outside these ranges (including the negative sentinel) are ignored
        }

        System.out.println("between 0-25 you have: "   + counter1 + " numbers");
        System.out.println("between 26-50 you have: "  + counter2 + " numbers");
        System.out.println("between 51-75 you have: "  + counter3 + " numbers");
        System.out.println("between 76-100 you have: " + counter4 + " numbers");
    }
}
