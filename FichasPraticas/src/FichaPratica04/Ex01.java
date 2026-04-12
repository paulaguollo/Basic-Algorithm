// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 04 — Ciclos do-while e Menus
// Exercício: Ex01 — Calculadora com repetição (do-while)
// Objetivo : Realizar operações aritméticas em loop até o
//            utilizador decidir sair (resposta diferente de 's')
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        String operacao, continuar;

        // do-while garante que o bloco executa PELO MENOS UMA VEZ
        // antes de verificar a condição de repetição
        do {
            // Leitura dos dados
            System.out.print("Introduza o primeiro valor: ");
            num1 = input.nextDouble();
            System.out.print("Introduza o segundo valor: ");
            num2 = input.nextDouble();
            System.out.print("Introduza a operação (+, -, *, /): ");
            operacao = input.next();

            // switch escolhe a operação com base no operador introduzido
            switch (operacao) {
                case "+":
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "-":
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "*":
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;
                case "/":
                    // Validação: divisão por zero não é permitida
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                default:
                    System.out.println("Operação Inválida!");
                    break;
            }

            // Pergunta ao utilizador se quer continuar
            System.out.print("Deseja continuar? (s/n): ");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("s")); // repete se digitar 's' ou 'S'

        System.out.println("Programa encerrado.");
    }
}
