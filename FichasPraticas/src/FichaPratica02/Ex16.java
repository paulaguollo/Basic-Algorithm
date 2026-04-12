// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex16 — Decomposição de valor em notas
// Objetivo : Dado um valor múltiplo de 5, calcular o número
//            mínimo de notas (200, 100, 50, 20, 10, 5) necessárias
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX16 ___________");
        System.out.println("Me diga um valor multiplo de 5 e eu te digo quantas notas precisa para ser decomponto");

        int valor, numeroNotas;

        System.out.print("Enter value: ");
        valor = input.nextInt();

        // Só faz sentido decompor se o valor for múltiplo de 5
        if (valor % 5 == 0) {

            // Para cada denominação: calcular quantas notas cabem e guardar o resto
            // A divisão inteira (/) dá o número de notas; o módulo (%) dá o resto a decompor

            numeroNotas = valor / 200;
            System.out.println("Quantidade de notas de 200$: " + numeroNotas);
            valor = valor % 200; // resta decompor este valor

            numeroNotas = valor / 100;
            System.out.println("Quantidade de notas de 100$: " + numeroNotas);
            valor = valor % 100;

            numeroNotas = valor / 50;
            System.out.println("Quantidade de notas de 50$: " + numeroNotas);
            valor = valor % 50;

            numeroNotas = valor / 20;
            System.out.println("Quantidade de notas de 20$: " + numeroNotas);
            valor = valor % 20;

            numeroNotas = valor / 10;
            System.out.println("Quantidade de notas de 10$: " + numeroNotas);
            valor = valor % 10;

            numeroNotas = valor / 5;
            System.out.println("Quantidade de notas de 5$: " + numeroNotas);

        } else {
            System.out.println("Não damos troco");
        }
    }
}
