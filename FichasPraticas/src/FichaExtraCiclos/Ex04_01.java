// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex04_01 — Padrão retângulo de asteriscos
// Objetivo : Imprimir um retângulo de asteriscos com
//            4 linhas e 10 colunas usando dois for aninhados
// ============================================================

package FichaExtraCiclos;

public class Ex04_01 {
    public static void main(String[] args) {

        int linhas  = 4;  // número total de linhas do retângulo
        int colunas = 10; // número total de colunas do retângulo

        // Ciclo externo: controla cada linha
        for (int i = 0; i < linhas; i++) {

            // Ciclo interno: imprime um '*' por cada coluna (sem newline)
            for (int j = 0; j < colunas; j++) {
                System.out.print("*");
            }

            // Após preencher uma linha completa, avança para a linha seguinte
            System.out.println();
        }
    }

}
