// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex05 — Ordenar dois números (mínimo → máximo)
// Objetivo : Apresentar dois números por ordem crescente
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX05 ___________");
        System.out.println("You can see the min and max value");

        int value1, value2;

        System.out.print("Enter first value: ");
        value1 = input.nextInt();

        System.out.print("Enter second value: ");
        value2 = input.nextInt();

        // Se value1 for maior, imprime primeiro o menor (value2)
        // Caso contrário, value1 já é o menor e imprime-se na ordem natural
        if (value1 > value2) {
            System.out.println(value2 + " " + value1); // mín → máx
        } else {
            System.out.println(value1 + " " + value2); // mín → máx
        }

    }
}
