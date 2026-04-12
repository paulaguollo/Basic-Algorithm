// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex02 — Números pares entre 1 e 400
// Objetivo : Imprimir apenas os números pares no intervalo [1, 400]
// ============================================================

package FichaPratica03;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("__________ F03 | EX02 ___________");
        System.out.println("A program that shows just the even numbers between 1-400");

        int num = 2; // começa no primeiro número par

        // Avança de 2 em 2 para percorrer apenas números pares
        // O if verifica a paridade (redundante aqui, pois num já começa par e salta de 2 em 2)
        while (num <= 400) {
            if (num % 2 == 0) {  // % 2 == 0 confirma que é par
                System.out.println(num);
                num = num + 2;   // salta diretamente para o próximo par
            }
        }
    }
}
