// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex02 — Income tax on salary (2 brackets)
// Goal     : Calculate the tax based on salary:
//            ≤ 15 000 → 20% | > 15 000 → 30%
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary, tax;

        System.out.println("__________ FP02 | EX02 ___________");
        System.out.println("Tax to pay based on the salary");

        System.out.print("Enter salary value: ");
        salary = input.nextDouble();

        // if-else structure with two tax brackets
        if (salary <= 15000) {
            tax = salary * 0.2;          // 20% for salaries up to 15 000
            System.out.print("Pay 20% tax: " + tax);
        } else {
            tax = salary * 0.3;          // 30% for salaries above 15 000
            System.out.print("Pay 30% tax: " + tax);
        }
    }
}
