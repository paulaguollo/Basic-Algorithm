// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex09 — Soma dos dígitos de um número
// Objetivo : Ler um inteiro e calcular a soma de todos os seus dígitos
//            Exemplo: 1234 → 1 + 2 + 3 + 4 = 10
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        int numero, soma = 0, digito;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        // A técnica usa aritmética modular para extrair dígito a dígito
        // da direita para a esquerda
        while (numero != 0) {

            // % 10 devolve sempre o último dígito (ex: 1234 % 10 = 4)
            digito = numero % 10;

            // Acumula o dígito extraído na soma total
            soma += digito; // equivale a soma = soma + digito

            // / 10 remove o último dígito (ex: 1234 / 10 = 123)
            numero /= 10; // equivale a numero = numero / 10
        }

        System.out.println("A soma dos dígitos é: " + soma);
    }
}
