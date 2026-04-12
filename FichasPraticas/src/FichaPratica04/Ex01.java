package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, resultado;
        String operacao, continuar;

        do {
            // Leitura dos dados
            System.out.print("Introduza o primeiro valor: ");
            num1 = input.nextDouble();
            System.out.print("Introduza o segundo valor: ");
            num2 = input.nextDouble();
            System.out.print("Introduza a operação (+, -, *, /): ");
            operacao = input.next();

            // Seleção da operação
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

            // Pergunta se deseja repetir (conforme exemplo da ficha)
            System.out.print("Deseja continuar? (s/n): ");
            continuar = input.next();

        } while (continuar.equalsIgnoreCase("s")); // Repete se o utilizador digitar 's' ou 'S'

        System.out.println("Programa encerrado.");
    }
}

