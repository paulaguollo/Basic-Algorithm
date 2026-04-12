// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex02 — Imposto sobre o salário (2 escalões)
// Objetivo : Calcular o imposto a pagar consoante o salário:
//            ≤ 15 000 → 20% | > 15 000 → 30%
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double salary, tax;

        System.out.println("__________ F02 | EX02 ___________");
        System.out.println("Tax to pay about the salary");

        System.out.print("Enter salary value: ");
        salary = input.nextDouble();

        // Estrutura if-else com dois escalões de imposto
        if (salary <= 15000) {
            tax = salary * 0.2;          // 20% para salários até 15 000
            System.out.print("Pay 20% tax: " + tax);
        } else {
            tax = salary * 0.3;          // 30% para salários acima de 15 000
            System.out.print("Pay 30% tax: " + tax);
        }
    }
}
