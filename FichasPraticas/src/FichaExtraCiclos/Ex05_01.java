// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex05_01 — Triângulo com número da linha repetido
// Objetivo : Imprimir um triângulo onde a linha N repete o
//            dígito N exatamente N vezes
//            Exemplo (4 linhas):
//            1
//            22
//            333
//            4444
// ============================================================

package FichaExtraCiclos;

public class Ex05_01 {
    public static void main(String[] args) {

        int linhas = 4; // número total de linhas

        // Ciclo externo: i é o número da linha e também o dígito a imprimir
        for (int i = 1; i <= linhas; i++) {

            // Ciclo interno: repete o dígito i exatamente i vezes
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }

            System.out.println(); // nova linha após cada grupo de dígitos
        }
    }
}
