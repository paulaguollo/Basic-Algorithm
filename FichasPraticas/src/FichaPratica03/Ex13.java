// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex13 — Múltiplos de 5 num intervalo
// Objetivo : Ler um número de início e um limite e imprimir
//            apenas os múltiplos de 5 nesse intervalo
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ F03 | EX13 ___________");
        System.out.println("Múltiplos de 5 num intervalo definido");

        int limite, numero;

        System.out.print("Insira o numero de inicio: ");
        numero = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        // Percorre todos os números do intervalo
        // O if filtra apenas os divisíveis por 5 (resto da divisão == 0)
        while (numero <= limite) {
            if (numero % 5 == 0) {
                System.out.println(numero);
            }
            numero++; // verifica o número seguinte
        }
    }
}
