// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex11 — Bank balance with deposit or withdrawal
// Goal     : Apply a positive (deposit) or negative (withdrawal)
//            transaction to a balance and validate sufficient funds
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX11 ___________");
        System.out.println("Bank balance and transactions");

        int balance, transaction;
        int deposit;    // result when the transaction is positive
        int withdrawal; // result when the transaction is negative

        System.out.print("Enter your balance: ");
        balance = input.nextInt();

        System.out.print("Enter the transaction (deposit (+) or withdraw (-): ");
        transaction = input.nextInt();

        // If the transaction is positive → it is a deposit
        if (transaction >= 1) {
            deposit = balance + transaction;
            System.out.println("Your current balance is: " + deposit);
        }

        // If the transaction is negative → it is a withdrawal
        // Use -transaction to turn the value positive before subtracting
        if (transaction < 0) {
            withdrawal = balance - (-transaction);
            if (withdrawal > 0) {
                System.out.println("Your current balance is: " + withdrawal);
            } else {
                // Balance would go negative → operation refused
                System.out.println("Invalid operation. Insufficient balance");
            }
        }
    }
}
