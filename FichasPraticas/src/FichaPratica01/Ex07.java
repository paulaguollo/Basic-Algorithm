// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex07 — Total de compra com desconto de 10%
// Objetivo : Somar o preço de 3 produtos e aplicar 10% de desconto
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ F01 | EX07 ___________");
        System.out.println("Me diga o preço de cada um dos 3 produtos que comprou que eu te digo quanto vais pagar com 10% de desconto");

        // Preços individuais e total final já com desconto
        double valor1, valor2, valor3;
        double valorfinal;
        double desconto = 0.9; // multiplicar por 0.9 equivale a aplicar 10% de desconto

        // Leitura dos preços de cada produto
        System.out.print("O preço do primeiro produto é: ");
        valor1 = input.nextDouble();
        System.out.print("O preço do segundo produto é: ");
        valor2 = input.nextDouble();
        System.out.print("O preço do terceiro produto é: ");
        valor3 = input.nextDouble();

        // Soma dos três preços e aplicação do desconto numa única variável
        valorfinal = valor1 + valor2 + valor3;
        valorfinal = valorfinal * desconto; // 10% de desconto

        System.out.println("Deverá pagar: " + valorfinal + "€ com desconto de 10% já incluso :)");
    }
}
