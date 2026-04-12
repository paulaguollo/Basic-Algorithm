// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex03 — Imposto sobre o salário (4 escalões)
// Objetivo : Calcular o imposto a pagar com 4 escalões:
//            ≤ 15 000 → 20% | 15 001-20 000 → 30%
//            20 001-25 000 → 35% | > 25 000 → 40%
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX03 ___________");
        System.out.println("Tax to pay about the salary");

        double salary, tax;

        System.out.print("Enter salary value: ");
        salary = input.nextDouble();

        // Cada if é independente (não usa else if), o que significa que
        // cada condição é avaliada separadamente — só uma será verdadeira
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
