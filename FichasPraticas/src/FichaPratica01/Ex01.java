// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex01 — Soma de dois números inteiros
// Objetivo : Ler dois inteiros e apresentar a sua soma
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Scanner permite ler o que o utilizador escreve no teclado
        Scanner input = new Scanner(System.in);

        // Declaração das variáveis: dois operandos e o resultado
        int valor1, valor2, soma;

        System.out.println("___________ FP01 | EX01 ___________");

        // Leitura do primeiro número
        System.out.print("Insira um número: ");
        valor1 = input.nextInt();

        // Leitura do segundo número
        System.out.print("Insira outro número: ");
        valor2 = input.nextInt();

        // Operação aritmética: adição
        soma = valor1 + valor2;

        // Apresentação do resultado
        System.out.println("O resultado da soma é: " + soma);

    }
}
