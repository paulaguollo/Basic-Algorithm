// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Condicionais
// Exercício: Ex04 — Vogal ou Consoante (switch)
// Objetivo : Ler uma letra e indicar se é vogal ou consoante,
//            usando switch com fall-through nos cases de vogais
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX04 ___________");
        System.out.println("Escolha uma letra e eu te digo se é vogal ou consoante");

        String letter;

        System.out.print("Digite uma letra do alfabeto: ");
        // toLowerCase converte para minúscula para simplificar a comparação
        letter = input.next().toLowerCase();

        // Fall-through: os cases de vogais não têm break entre si,
        // pelo que qualquer vogal cai até ao mesmo println
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter + " é uma vogal.");
                break;
            default:
                // Tudo o que não for vogal é tratado como consoante
                System.out.println(letter + " é uma consoante.");
        }

    }
}
