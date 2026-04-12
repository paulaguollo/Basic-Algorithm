// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Condicionais
// Exercício: Ex05 — Adivinhar o número (2 tentativas)
// Objetivo : O utilizador tem 2 tentativas para adivinhar
//            o número secreto (31); recebe dica se errar na 1ª
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX05 ___________");
        System.out.println("Voce tem duas tentativas pra acertar o número");

        int randomNumber = 31, tentativa = 1; // número secreto fixo

        // Verifica se o número está no intervalo válido e se a tentativa inicial é diferente
        if (randomNumber >= 1 && randomNumber <= 100 && randomNumber != tentativa) {
            System.out.print("Adivinhe o número (1 a 100): ");
            tentativa = input.nextInt(); // 1ª tentativa
        }

        if (tentativa == randomNumber) {
            // Acertou na 1ª tentativa
            System.out.println("Acertou o número misterioso! Parabéns");

        } else if (tentativa > randomNumber) {
            // Dica: está alto → pede 2ª tentativa
            System.out.println("Está alto");
            System.out.print("Adivinhe o número (1 a 100): ");
            tentativa = input.nextInt();
            if (tentativa == randomNumber) {
                System.out.println("Acertou o número misterioso! Parabéns");
            } else {
                System.out.println("Ficou sem tentativas... O número era " + randomNumber);
            }

        } else if (tentativa < randomNumber) {
            // Dica: está baixo → pede 2ª tentativa
            System.out.println("Está baixo");
            System.out.print("Adivinhe o número (1 a 100): ");
            tentativa = input.nextInt();
            if (tentativa == randomNumber) {
                System.out.println("Acertou o número misterioso! Parabéns");
            } else {
                System.out.println("Ficou sem tentativas... O número era " + randomNumber);
            }

        } else if (!(randomNumber >= 1 && randomNumber <= 100)) {
            // Caso o número secreto esteja fora do intervalo (nunca acontece com 31)
            System.out.println("Número invalido. Tente novamente com um valor entre 1 e 100");
        }

    }
}
