// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex10 — Inverter os dígitos de um número
// Objetivo : Ler um inteiro e apresentar os seus dígitos invertidos
//            Exemplo: 1234 → 4321
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Declaração de variáveis
        int numero, numeroInvertido = 0, digito = 0;

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        // Usa a mesma técnica de extração dígito a dígito do Ex09,
        // mas em vez de somar, constrói o número invertido
        while (numero != 0) {

            // Extrai o último dígito do número
            digito = numero % 10;

            // Desloca os dígitos já recolhidos uma casa para a esquerda
            // e acrescenta o novo dígito na posição das unidades
            // Ex: 43 → 43*10 + 2 = 432
            numeroInvertido = numeroInvertido * 10 + digito;

            // Remove o último dígito do número original
            numero /= 10;
        }

        System.out.println("Resultado: " + numeroInvertido);
    }
}
