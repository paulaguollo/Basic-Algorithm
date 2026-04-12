// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex03 — Números ímpares entre 531 e 750
// Objetivo : Imprimir apenas os números ímpares no intervalo [531, 750]
// ============================================================

package FichaPratica03;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("__________ F03 | EX03 ___________");
        System.out.println("A program that shows just the odd numbers from 531 to 750");

        int num = 531; // 531 é ímpar → ponto de partida correto

        // Percorre o intervalo; o if filtra apenas os ímpares (resto ≠ 0)
        // O incremento de 2 garante que ficamos sempre nos ímpares
        while (num <= 750) {
            if (num % 2 != 0) {  // != 0 significa que há resto → número ímpar
                System.out.println(num);
                num = num + 2;   // salta para o próximo ímpar
            }
        }
    }
}
