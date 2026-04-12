// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex02 — Quatro operações aritméticas
// Objetivo : Ler dois inteiros e apresentar soma, subtração,
//            multiplicação e divisão entre eles
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Scanner para leitura de dados do teclado
        Scanner input = new Scanner(System.in);

        // Variáveis para os dois operandos e para cada resultado
        int valor1, valor2, soma, sub, mult, div;

        System.out.println("__________ FP01 | EX02 __________");

        // Leitura dos dois valores
        System.out.print("Insira um número: ");
        valor1 = input.nextInt();

        System.out.print("Insira outro número: ");
        valor2 = input.nextInt();

        // Cálculo das quatro operações básicas
        soma = valor1 + valor2;   // adição
        sub  = valor1 - valor2;   // subtração
        mult = valor1 * valor2;   // multiplicação
        div  = valor1 / valor2;   // divisão inteira (trunca a parte decimal)

        // Apresentação dos resultados
        System.out.println("A soma é: "           + soma);
        System.out.println("A subtração é: "      + sub);
        System.out.println("A multiplicação é: "  + mult);
        System.out.println("A divisão é: "        + div);
    }
}
