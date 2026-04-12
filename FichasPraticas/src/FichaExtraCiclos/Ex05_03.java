// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex05_03 — Padrão de números espelhados (pirâmide)
// Objetivo : Imprimir um padrão onde cada linha N mostra os
//            números de N até 1 e depois de 2 até N (espelho)
//            Exemplo (4 linhas):
//               1
//              212
//             32123
//            4321234
// ============================================================

package FichaExtraCiclos;

public class Ex05_03 {
    public static void main(String[] args) {

        int linhas = 4; // número total de linhas

        // Ciclo externo: i representa a linha atual
        for (int i = 1; i <= linhas; i++) {

            // Espaços à esquerda para centrar o padrão
            for (int j = 1; j <= linhas - i; j++) {
                System.out.print(" ");
            }

            // Metade esquerda: conta de i até 1 (decrescente)
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            // Metade direita: conta de 2 até i (crescente, espelhando a esquerda)
            // Começa em 2 para não repetir o "1" central
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
