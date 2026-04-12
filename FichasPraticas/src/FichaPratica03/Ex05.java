// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex05 — Repetir uma frase N vezes
// Objetivo : Ler uma mensagem e o número de repetições,
//            e imprimir a mensagem esse número de vezes
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX05 ___________");
        System.out.println("Choose one number to be the times you want to print a phrase");

        int vezes;
        int i = 0;       // contador de iterações
        String mensagem;

        System.out.print("How many times do you want to print? ");
        vezes = input.nextInt();

        // input.nextLine() após nextInt() é necessário para "limpar" o \n
        // que ficou no buffer, senão o nextLine() seguinte leria uma linha vazia
        System.out.print("What do you wanna print? ");
        input.nextLine(); // descarta o newline residual do nextInt()
        mensagem = input.nextLine(); // lê a frase completa (incluindo espaços)

        // Imprime a mensagem enquanto o contador não atingir o limite
        while (i < vezes) {
            System.out.println(mensagem);
            i++;
        }

    }
}
