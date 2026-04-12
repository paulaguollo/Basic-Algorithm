// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex01 — Imprimir números de 1 a 250
// Objetivo : Usar um ciclo while para listar os inteiros de 1 a 250
// ============================================================

package FichaPratica03;

public class Ex01 {
    public static void main(String[] args) {

        System.out.println("__________ F03 | EX01 ___________");
        System.out.println("A program that shows 1-250");

        int num = 1; // variável contadora — começa em 1

        // O ciclo while repete enquanto a condição (num <= 250) for verdadeira
        // A cada iteração imprime o número e incrementa o contador
        while (num <= 250) {
            System.out.println(num);
            num = num + 1; // avança para o próximo número
        }
    }
}
