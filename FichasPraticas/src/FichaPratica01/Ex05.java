// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex05 — Média aritmética e média ponderada
// Objetivo : Calcular a média simples e ponderada (20%, 30%, 50%)
//            de três notas introduzidas pelo utilizador
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Scanner para leitura de dados do teclado
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F01 | EX05 ___________");
        System.out.println("Insira as 3 notas para perceber a média aritmética e média ponderada");

        // Variáveis para as notas e para os dois tipos de média
        double nota1, nota2, nota3;
        double mediaSimples, mediaPonderada;
        // Pesos definidos: nota1=20%, nota2=30%, nota3=50%

        // Leitura das três notas
        System.out.print("Insira a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = input.nextDouble();

        // Média aritmética simples: soma das notas a dividir pelo número de notas
        mediaSimples = (nota1 + nota2 + nota3) / 3;
        System.out.println("A média Aritmética simples é: " + mediaSimples);

        // Aplicação dos pesos a cada nota (as variáveis são reutilizadas)
        nota1 = nota1 * 0.2;   // 20% de peso
        nota2 = nota2 * 0.3;   // 30% de peso
        nota3 = nota3 * 0.5;   // 50% de peso
        double somaPeso = 1;   // 0.2 + 0.3 + 0.5 = 1.0 (soma dos pesos)

        // Apresentação das notas com ponderação aplicada
        System.out.println("A primeira nota com ponderação de 20% é: " + nota1);
        System.out.println("A segunda nota com ponderação de 30% é: "  + nota2);
        System.out.println("A terceira nota com ponderação de 50% é: " + nota3);

        // Média ponderada: soma das notas ponderadas a dividir pela soma dos pesos
        // Como somaPeso=1, a divisão não altera o valor
        mediaPonderada = (nota1 + nota2 + nota3) / somaPeso;
        System.out.print("A média Ponderada é: " + mediaPonderada);
    }
}
