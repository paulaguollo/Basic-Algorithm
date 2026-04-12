// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex08 — 5 antecessores e 5 sucessores de um número
// Objetivo : Ler um inteiro e imprimir os 5 números anteriores
//            e os 5 números seguintes (sem incluir o próprio)
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ F03 | EX08 ___________");
        System.out.println("A program that reads an integer and prints the 5 previous and the 5 following.");

        int num, ant, suc;

        System.out.print("Enter a number: ");
        num = input.nextInt();

        // Calcular o início dos antecessores e o fim dos sucessores
        ant = num - 5; // primeiro antecessor a imprimir
        suc = num + 5; // último sucessor a imprimir

        // Ciclo dos antecessores: de (num-5) até (num-1)
        while (ant < num) {
            System.out.println(ant);
            ant++; // avança em direção ao num
        }

        // Linha em branco para separar antecessores de sucessores
        num++; // avança num para que ele próprio não apareça na lista de sucessores
        System.out.println();

        // Ciclo dos sucessores: de (num+1) até (num+5)
        while (suc >= num) {
            System.out.println(num); // imprime o valor atual de num (que já avançou)
            num++;
        }
    }
}
