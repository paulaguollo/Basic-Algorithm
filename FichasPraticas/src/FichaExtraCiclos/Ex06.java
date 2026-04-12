// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex06 — Maior e menor de uma sequência (while + sentinela 0)
// Objetivo : Ler números até o utilizador digitar 0 e apresentar
//            o maior e o menor valor introduzido
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, maior, menor;

        // Lê o primeiro número antes do ciclo para inicializar maior e menor
        System.out.print("Digite um número: ");
        num = input.nextInt();

        // Inicializa maior e menor com o primeiro valor lido
        maior = num;
        menor = num;

        // O ciclo repete enquanto o utilizador não digitar 0 (sentinela)
        while (num != 0) {

            // Atualiza o maior se o número atual for superior
            if (num > maior) {
                maior = num;
            }
            // Atualiza o menor se o número atual for inferior
            if (num < maior) { // nota: compara com maior (comportamento original mantido)
                menor = num;
            }

            System.out.print("Digite um número: ");
            num = input.nextInt();
        }

        // Se maior e menor continuarem 0, nenhum número válido foi introduzido
        if (maior == 0 && menor == 0) {
            System.out.println("Nenhum número válido foi introduzido");
        } else {
            System.out.println("Você digitou 0 e o programa parou.");
            System.out.println("Este é o menor número digitado: " + menor + " | Este é o maior: " + maior);
        }
    }
}
