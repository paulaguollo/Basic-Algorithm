// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex04_03 — Triângulo centrado de asteriscos (pirâmide)
// Objetivo : Imprimir uma pirâmide de asteriscos centrada,
//            com espaços à esquerda a diminuir e asteriscos a crescer
//            Exemplo (5 linhas):
//                *
//               ***
//              *****
//             *******
//            *********
// ============================================================

package FichaExtraCiclos;

public class Ex04_03 {
    public static void main(String[] args) {

        int linhas    = 5;           // número total de linhas da pirâmide
        int espacos   = linhas - 1;  // espaços iniciais (máximo na 1ª linha)
        int asteriscos = 1;          // asteriscos iniciais (mínimo na 1ª linha)

        // Ciclo principal: uma iteração por linha
        for (int i = 0; i < linhas; i++) {

            // Imprime os espaços antes dos asteriscos (centra a pirâmide)
            for (int j = 0; j < espacos; j++) {
                System.out.print(" ");
            }

            // Imprime os asteriscos da linha atual
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }

            // Avança para a linha seguinte
            System.out.println();

            // A cada linha: menos um espaço e mais dois asteriscos
            espacos--;
            asteriscos += 2;
        }
    }
}
