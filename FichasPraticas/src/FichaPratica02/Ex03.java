// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex03 — Income tax on salary (4 brackets)
// Goal     : Calculate the tax with 4 brackets:
//            ≤ 15 000 → 20% | 15 001-20 000 → 30%
//            20 001-25 000 → 35% | > 25 000 → 40%
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX03 ___________");
        System.out.println("Tax to pay based on the salary");

        double salary, tax;

        System.out.print("Enter salary value: ");
        salary = input.nextDouble();

        // Each if is independent (no else if), meaning each condition
        // is evaluated separately — only one will be true
        if (salary <= 15000) {
            tax = salary * 0.2;
            System.out.println("Pay 20% tax: " + tax);
        }
        if (salary > 15000 && salary <= 20000) {
            tax = salary * 0.3;
            System.out.println("Pay 30% tax: " + tax);
        }
        if (salary > 20000 && salary <= 25000) {
            tax = salary * 0.35;
            System.out.println("Pay 35% tax: " + tax);
        }
        if (salary > 25000) {
            tax = salary * 0.4;
            System.out.println("Pay 40% tax: " + tax);
        }
    }
}
