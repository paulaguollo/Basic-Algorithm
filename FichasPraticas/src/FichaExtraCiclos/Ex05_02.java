// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex05_02 — Pirâmide centrada com número da linha
// Objetivo : Imprimir uma pirâmide onde a linha N tem (2N-1)
//            repetições do dígito N, centrada com espaços
//            Exemplo (5 linhas):
//                1
//               222
//              33333
//             4444444
//            555555555
// ============================================================

package FichaExtraCiclos;

public class Ex05_02 {
    public static void main(String[] args) {

        int linhas  = 5;           // número total de linhas
        int espacos = linhas - 1;  // espaços iniciais (máximo na 1ª linha)

        // Ciclo externo: i é o número da linha e o dígito a imprimir
        for (int i = 1; i <= linhas; i++) {

            // Imprime os espaços de alinhamento (centra a pirâmide)
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            // Imprime (2*i - 1) repetições do dígito i
            // Fórmula: linha 1 → 1 dígito; linha 2 → 3; linha 3 → 5; etc.
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print(i);
            }

            System.out.println();

            // Reduz os espaços à esquerda para a próxima linha
            espacos--;
        }
    }
}
