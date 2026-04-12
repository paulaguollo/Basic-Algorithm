// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex04 — Sequência de 0 até N
// Objetivo : Ler um número N e imprimir todos os inteiros de 0 a N
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX04 ___________");
        System.out.println("Enter a number and I will show you the sequence until it ");

        int num; // limite superior da sequência (poderia chamar-se 'limite')
        int i = 0; // contador — começa em 0

        System.out.print("Enter number: ");
        num = input.nextInt();

        // Imprime todos os valores de i desde 0 até num (inclusive)
        while (i <= num) {
            System.out.print(i);
            i++; // equivale a i = i + 1
        }
    }
}
