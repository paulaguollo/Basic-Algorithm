// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex15 — Fatorial de um número
// Objetivo : Ler um inteiro não-negativo e calcular o seu fatorial
//            Exemplo: 5! = 5 × 4 × 3 × 2 × 1 = 120
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número inteiro não-negativo: ");
        int n = input.nextInt();

        // Guarda o valor original para o usar na mensagem final
        // (n vai ser modificado durante o ciclo)
        int originalN = n;
        int fatorial  = 1; // o acumulador começa em 1 (elemento neutro da multiplicação)

        // Se n for 0 ou 1 o fatorial é 1 e o ciclo não chega a correr
        // Para n > 1: multiplica fatorial por n, n-1, n-2, … até 2
        while (n > 1) {
            fatorial = fatorial * n;
            n--; // decrementa para o próximo fator
        }

        System.out.println("Fatorial de " + originalN + " = " + fatorial);
    }
}
