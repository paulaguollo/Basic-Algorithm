// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex07 — Par ou Ímpar
// Objetivo : Determinar se um número inteiro é par ou ímpar
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX07 ___________");
        System.out.println("Is the number even or odd??");

        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();

        // O operador % (módulo) devolve o resto da divisão
        // Se o resto de number / 2 for 0, o número é par (even)
        // Caso contrário é ímpar (odd)
        if (number % 2 == 0) {
            System.out.println("Is even");
        } else {
            System.out.println("Is odd");
        }
    }
}
