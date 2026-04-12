// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex08 — Potência sem usar Math.pow (for)
// Objetivo : Calcular base^expoente através de multiplicações
//            sucessivas num ciclo for
// ============================================================

package FichaExtraCiclos;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base, expoente, resultado = 1;
        // resultado começa em 1 (elemento neutro da multiplicação)

        System.out.println("Vou te pedir dois numeros e te darei o resultado da potencia dele");
        System.out.print("Digite o primeiro número: ");
        base = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        expoente = input.nextDouble();

        // Multiplica 'resultado' por 'base' tantas vezes quantas o 'expoente' indicar
        // Ex: base=3, expoente=4 → 1 * 3 * 3 * 3 * 3 = 81
        for (double i = 1; i <= expoente; i++) {
            resultado *= base; // equivale a resultado = resultado * base
        }

        System.out.println("Esse é o resultado: " + resultado);

    }
}
