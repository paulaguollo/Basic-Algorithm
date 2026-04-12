// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex07 — Contar positivos e negativos (sentinela 0)
// Objetivo : Ler números até digitar 0 e contar quantos
//            foram positivos e quantos foram negativos
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, negativo = 0, positivo = 0;
        // negativo e positivo são contadores, inicializados a 0

        System.out.print("Digite um número: ");
        num = input.nextInt();

        // Ciclo com sentinela: termina quando o utilizador digita 0
        while (num != 0) {

            if (num > 0) {
                positivo++; // incrementa o contador de positivos
            }
            if (num < 0) {
                negativo++; // incrementa o contador de negativos
            }

            System.out.print("Digite um número: ");
            num = input.nextInt();
        }

        // Se ambos os contadores ficaram a 0, apenas foi introduzido o sentinela
        if (negativo == 0 && positivo == 0) {
            System.out.println("Nenhum número válido foi introduzido");
        } else {
            System.out.println("Você digitou 0 e o programa parou.");
            System.out.println("Esta é a quantidade de digitos positivos: " + positivo);
            System.out.println("Esta é a quantidade de digitos negativos: " + negativo);
        }
    }
}
