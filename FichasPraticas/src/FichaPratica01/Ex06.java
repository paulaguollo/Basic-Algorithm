// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex06 — Permuta de dois valores
// Objetivo : Trocar os valores de duas variáveis sem usar
//            uma variável auxiliar (através de aritmética)
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ F01 | EX06 ___________");
        System.out.println("insira dois valores inteiros");

        // aux está declarado mas é usado apenas na versão comentada abaixo
        int valor1, valor2, aux;

        System.out.print("O primeiro número é: ");
        valor1 = input.nextInt();
        System.out.print("O segundo número é: ");
        valor2 = input.nextInt();

        // ── Versão clássica com variável auxiliar (comentada) ──────────
        // aux    = valor1;   // guarda valor1 temporariamente
        // valor1 = valor2;   // valor1 recebe valor2
        // valor2 = aux;      // valor2 recebe o valor1 guardado
        // ───────────────────────────────────────────────────────────────

        // ── Versão sem variável auxiliar (usando aritmética) ───────────
        // Passo 1: valor1 passa a ser a soma dos dois
        valor1 = valor1 + valor2;
        // Passo 2: subtraindo valor2 (que ainda é o original) obtemos o valor1 original
        valor2 = valor1 - valor2;
        // Passo 3: subtraindo o novo valor2 (= valor1 original) obtemos o valor2 original
        valor1 = valor1 - valor2;
        // ───────────────────────────────────────────────────────────────

        System.out.println("Esses sao os números permutados: " + valor1 + " | " + valor2);
    }
}
