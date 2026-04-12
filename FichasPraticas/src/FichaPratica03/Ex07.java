// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex07 — Soma de 1 a 100
// Objetivo : Imprimir os números de 1 a 100 e apresentar a soma total
// ============================================================

package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("__________ F03 | EX07 ___________");
        System.out.println("A program that shows numbers from 0 to 100 and its sum");

        int soma = 0; // acumulador — começa em 0 e vai somando cada número
        int i    = 1; // contador — começa em 1

        // A cada iteração: imprime o número atual e adiciona-o ao acumulador
        while (i <= 100) {
            System.out.println(i);
            soma = soma + i; // acumula o valor de i
            i++;
        }

        // Apresenta a soma total após o ciclo terminar
        System.out.println("A soma é: " + soma);
    }
}
