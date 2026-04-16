// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Conditionals
// Exercise : Ex06 — Leap Year
// Goal     : Read a year and determine if it is a leap year
//            Simplified rule: divisible by 4 → leap year
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ EXTRA CONDITIONALS | EX06 ___________");
        System.out.println("Enter a year and I will tell you if it is a leap year");

        int year;

        System.out.print("Enter a year: ");
        year = input.nextInt();

        // Rule used: if the year is divisible by 4 it is a leap year
        // (Note: the complete rule includes exceptions for years divisible by 100 and 400)
        if (year % 4 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
