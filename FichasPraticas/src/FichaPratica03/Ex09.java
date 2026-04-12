// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex09 — Média de números até introduzir -1
// Objetivo : Ler números até o utilizador digitar -1 (sentinela)
//            e calcular a média dos valores introduzidos
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX09 ___________");
        System.out.println("Give me numbers, until you enter the number -1, I will say the average of the entered numbers (excluding -1).");

        double num = 0, contador = 0, soma = 0, media;

        // O ciclo repete enquanto o utilizador não digitar -1 (valor sentinela)
        while (num != -1) {
            System.out.print("Enter a number (-1 to stop): ");
            num = input.nextDouble();
            soma = soma + num; // acumula todos os valores, incluindo o -1
            contador++;        // conta todas as entradas, incluindo o -1
        }

        // Corrige os efeitos do -1 que foi somado e contado indevidamente
        soma     = soma + 1;      // cancela o -1 somado (soma - (-1) = soma + 1)
        contador = contador - 1;  // desconta a contagem do -1

        media = soma / contador;
        System.out.println("A média é: " + media);
    }
}
