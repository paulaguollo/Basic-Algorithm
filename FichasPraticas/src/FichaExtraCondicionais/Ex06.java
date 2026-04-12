// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Condicionais
// Exercício: Ex06 — Ano Bissexto
// Objetivo : Ler um ano e determinar se é bissexto
//            Regra simplificada: divisível por 4 → bissexto
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX06 ___________");
        System.out.println("Digite um ano e eu te digo se é bissexto");

        int ano;

        System.out.print("Digite um ano: ");
        ano = input.nextInt();

        // Regra usada: se o ano for divisível por 4 é bissexto
        // (Nota: a regra completa inclui exceções para anos divisíveis por 100 e 400)
        if (ano % 4 == 0) {
            System.out.println(ano + " é um ano bissexto");
        } else {
            System.out.println(ano + " não é um ano bissexto");
        }
    }
}
