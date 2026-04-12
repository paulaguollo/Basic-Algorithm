// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex06 — Sequência entre dois números
// Objetivo : Ler dois inteiros (início e fim) e imprimir todos
//            os valores do intervalo [num1, num2]
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ F03 | EX06 ___________");
        System.out.println("Choose two numbers to shows the init and end of this sequence");

        int num1, num2;

        System.out.print("Enter the first number´s sequence: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number´s sequence: ");
        num2 = input.nextInt();

        // num1 serve simultaneamente como valor atual e contador
        // Incrementa até atingir num2 (inclusive)
        while (num1 <= num2) {
            System.out.println(num1);
            num1++; // equivale a num1 = num1 + 1
        }
    }
}
