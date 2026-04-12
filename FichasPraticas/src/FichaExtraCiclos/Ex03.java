// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex03 — Tabuada de 1 a 10 (for aninhado)
// Objetivo : Usar dois ciclos for aninhados para imprimir
//            a tabuada completa de 1 até 10
// ============================================================

package FichaExtraCiclos;

public class Ex03 {
    public static void main(String[] args) {

        // Ciclo externo: itera pelo número cuja tabuada se vai mostrar (1 a 10)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabuada do " + i + ":");

            // Ciclo interno: itera pelos multiplicadores (1 a 10)
            // Para cada valor de i, este ciclo corre 10 vezes
            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println(); // linha em branco entre tabuadas
        }

    }
}
