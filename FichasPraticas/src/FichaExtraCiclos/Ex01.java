// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Ciclos
// Exercício: Ex01 — Imprimir 1 a 500 com for
// Objetivo : Usar um ciclo for para listar todos os inteiros de 1 a 500
// ============================================================

package FichaExtraCiclos;

public class Ex01 {
    public static void main(String[] args) {

        // Ciclo for: inicialização (i=1) | condição (i<=500) | incremento (i++)
        // Mais compacto que o while quando se sabe exatamente o número de iterações
        for (int i = 1; i <= 500; i++) {
            System.out.println(i);
        }
    }
}
