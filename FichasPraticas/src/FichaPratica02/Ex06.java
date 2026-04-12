// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex06 — Ordenar dois números (máximo → mínimo)
// Objetivo : Apresentar dois números por ordem decrescente
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX06 ___________");
        System.out.println("You can see the max and min value");

        int value1, value2;

        System.out.print("Enter first value: ");
        value1 = input.nextInt();

        System.out.print("Enter second value: ");
        value2 = input.nextInt();

        // Se value1 for maior, imprime primeiro value1 (máximo)
        // Caso contrário, value2 é o maior e imprime-se primeiro
        if (value1 > value2) {
            System.out.println(value1 + " " + value2); // máx → mín
        } else {
            System.out.println(value2 + " " + value1); // máx → mín
        }
    }
}
