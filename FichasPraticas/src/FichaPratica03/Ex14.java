// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex14 — Verificar se uma sequência é crescente
// Objetivo : Ler N números e determinar se a sequência é estritamente crescente
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ F03 | EX14 ___________");
        System.out.println("Verifica se a sequência introduzida é crescente");

        int quantidadeNumeros, contador = 1, numeroAtual, numeroAnterior;
        boolean crescente = true; // assume crescente até provar o contrário

        System.out.print("Quando numeros deseja inserir? ");
        quantidadeNumeros = input.nextInt();

        // Lê o primeiro número separadamente para usar como ponto de comparação
        System.out.print("Insira um número: ");
        numeroAnterior = input.nextInt();

        // Lê os restantes números e compara cada um com o anterior
        while (contador < quantidadeNumeros) {
            System.out.print("Insira um número: ");
            numeroAtual = input.nextInt();

            // Se o número atual for <= ao anterior, a sequência deixa de ser crescente
            if (numeroAtual <= numeroAnterior) {
                crescente = false; // marca que não é crescente (a flag fica false para sempre)
            }

            numeroAnterior = numeroAtual; // o atual torna-se o anterior para a próxima iteração
            contador++;
        }

        if (crescente) {
            System.out.println("A sequencia é Crescente");
        } else {
            System.out.println("Não Crescente");
        }
    }
}
