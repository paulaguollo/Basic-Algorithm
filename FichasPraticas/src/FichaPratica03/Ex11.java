// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex11 — Sequência com salto e limite definidos
// Objetivo : Ler um salto e um limite e imprimir os números
//            de 0 até ao limite com o salto indicado
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ F03 | EX11 ___________");
        System.out.println("Choose a limit and salto and I will show you the numbers ultil the limit");

        int limite, salto, numero = 0; // numero começa sempre em 0

        System.out.print("Insira o salto: ");
        salto = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        // A cada iteração imprime o número atual e avança pelo salto definido
        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + salto;
        }
    }
}
