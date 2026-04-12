// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex08 — Média ponderada e aprovação
// Objetivo : Calcular a média ponderada de 3 notas (25%, 35%, 40%)
//            e indicar se o aluno foi aprovado (≥ 9.5)
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3;
        double peso, somanotas, mediafinal;

        System.out.println("__________ F02 | EX08 ___________");
        System.out.println("Weighted average of three grades (0-20)");

        // Leitura das três notas
        System.out.print("Enter first grade: ");
        nota1 = input.nextDouble();

        System.out.print("Enter second grade: ");
        nota2 = input.nextDouble();

        System.out.print("Enter third grade: ");
        nota3 = input.nextDouble();

        // Aplicação dos pesos a cada nota
        nota1 = nota1 * 0.25;  // 25% de peso
        nota2 = nota2 * 0.35;  // 35% de peso
        nota3 = nota3 * 0.40;  // 40% de peso

        // Soma das notas ponderadas e soma dos pesos (deve ser 1.0)
        somanotas = nota1 + nota2 + nota3;
        peso      = 0.25 + 0.35 + 0.40;  // = 1.0

        // Média final: soma ponderada / soma dos pesos
        mediafinal = somanotas / peso;

        System.out.println("Final grade is: " + mediafinal);

        // Verificação de aprovação: nota mínima de 9.5
        if (mediafinal > 9.5) {
            System.out.println("Approved. Congrats :)");
        } else {
            System.out.println("You were not approved, but don't give up just try again o/");
        }
    }
}
