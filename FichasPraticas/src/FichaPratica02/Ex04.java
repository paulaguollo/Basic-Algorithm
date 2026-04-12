// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex04 — Pontos de F1 por posição (switch)
// Objetivo : Dado o lugar de chegada de um piloto, indicar
//            quantos pontos ele recebe (1º=10, 2º=8, …, 8º=1)
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX04 ___________");
        System.out.println("How many points the pilot will win?");

        int place;

        System.out.print("Enter pilot's place: ");
        place = input.nextInt();

        // switch compara o valor de 'place' com cada case
        // break impede que a execução "caia" para o case seguinte
        // default é executado quando nenhum case corresponde
        switch (place) {
            case 1:
                System.out.println("Win 10 points");
                break;
            case 2:
                System.out.println("Win 8 points");
                break;
            case 3:
                System.out.println("Win 6 points");
                break;
            case 4:
                System.out.println("Win 5 points");
                break;
            case 5:
                System.out.println("Win 4 points");
                break;
            case 6:
                System.out.println("Win 3 points");
                break;
            case 7:
                System.out.println("Win 2 points");
                break;
            case 8:
                System.out.println("Win 1 points");
                break;
            default:
                System.out.println("Place more than 8 so it is 0 points to win");
        }
    }
}
