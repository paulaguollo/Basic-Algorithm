// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex02 — Múltiplos de 3 até 255
// Objetivo : Imprimir apenas os números divisíveis por 3
//            no intervalo [1, 255]
// ============================================================

package FichaExtraCiclos;

public class Ex02 {
    public static void main(String[] args) {

        // Percorre todos os números de 1 a 255
        // O if dentro do for filtra apenas os múltiplos de 3
        for (int i = 1; i <= 255; i++) {
            if (i % 3 == 0) { // resto da divisão por 3 igual a 0 → múltiplo de 3
                System.out.println(i);
            }
        }
    }
}
