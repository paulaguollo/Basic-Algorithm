// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex09 — Mínimo de três números
// Objetivo : Identificar o menor valor entre três inteiros
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX09 ___________");
        System.out.println("Wich is the min value?");

        int value1, value2, value3;

        System.out.print("Enter first value: ");
        value1 = input.nextInt();

        System.out.print("Enter second value: ");
        value2 = input.nextInt();

        System.out.print("Enter third value: ");
        value3 = input.nextInt();

        // Cada if testa uma combinação diferente para encontrar o mínimo
        // O mínimo é aquele que é menor do que ambos os outros
        if (value1 < value2 && value1 < value3) {
            System.out.println("This is the min value: " + value1 + " | This is the first value you entered");
        }
        if (value2 < value1 && value2 < value3) {
            System.out.println("This is the min value: " + value2 + " | This is the second value you entered");
        }
        if (value3 < value1 && value3 < value2) {
            System.out.println("This is the min value: " + value3 + " | This is the third value you entered");
        }

    }
}
