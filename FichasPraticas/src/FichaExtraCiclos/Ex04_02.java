// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex04_02 — Triângulo crescente de asteriscos
// Objetivo : Imprimir um triângulo onde a linha N tem N asteriscos
//            Exemplo (5 linhas):
//            *
//            **
//            ***
//            ****
//            *****
// ============================================================

package FichaExtraCiclos;

public class Ex04_02 {
    public static void main(String[] args) {

        int linhas = 5; // número total de linhas do triângulo

        // Ciclo externo: i representa o número da linha atual (e quantos '*' imprimir)
        for (int i = 0; i <= linhas; i++) {

            // Ciclo interno: imprime i asteriscos (na linha 0 → nenhum; linha 1 → um; etc.)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Salta para a linha seguinte após cada linha de asteriscos
            System.out.println();
        }

    }

}
