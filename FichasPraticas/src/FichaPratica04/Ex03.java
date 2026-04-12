// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 04 — Ciclos do-while e Menus
// Exercício: Ex03 — Jogo de adivinhar o número secreto
// Objetivo : Jogador 1 define um número secreto; Jogador 2 tenta
//            adivinhar em quantas tentativas forem necessárias,
//            recebendo dicas ("mais alto" / "mais baixo")
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Scanner para leitura de dados do teclado
        Scanner input = new Scanner(System.in);

        int numeroSecreto, palpite, contadorPalpites = 0;

        // Jogador 1 define o número que Jogador 2 terá de adivinhar
        System.out.print("JOGADOR 1 - Insira o número secreto ( 0 - 100 ): ");
        numeroSecreto = input.nextInt();

        // do-while: Jogador 2 tenta sempre pelo menos uma vez
        // O ciclo repete enquanto o palpite for diferente do número secreto
        do {
            System.out.print("\nJOGADOR 2 - Tente adivinhar: ");
            palpite = input.nextInt();
            contadorPalpites++; // conta cada tentativa

            // Feedback para ajudar Jogador 2 a aproximar-se do número
            if (palpite > numeroSecreto) {
                System.out.println("O número secreto é mais baixo...");
            }

            if (palpite < numeroSecreto) {
                System.out.println("O número secreto é mais alto...");
            }

        } while (palpite != numeroSecreto); // sai do ciclo quando acertar

        System.out.println("Parabéns! Acertaste no número secreto: " + numeroSecreto);
        System.out.println("Foram precisas " + contadorPalpites + " tentativas.");
    }
}
