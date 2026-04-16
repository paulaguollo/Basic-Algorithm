// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 03 — Loops (while)
// Exercise : Ex13 — Multiples of 5 in a range
// Goal     : Read a start number and a limit and print
//            only multiples of 5 within that range
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ FP03 | EX13 ___________");
        System.out.println("Multiples of 5 in a defined range");

        int limit, number;

        System.out.print("Enter the start number: ");
        number = input.nextInt();

        System.out.print("Enter the limit: ");
        limit = input.nextInt();

        // Traverse all numbers in the range
        // The if filters only those divisible by 5 (remainder == 0)
        while (number <= limit) {
            if (number % 5 == 0) {
                System.out.println(number);
            }
            number++; // check the next number
        }
    }
}
