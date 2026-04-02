package FichaPratica2;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX01 ___________");
        System.out.println("Qual o maior número?");

        int valor1, valor2;

        System.out.print("Introduza um valor: ");
        valor1 = input.nextInt();

        System.out.print("Introduza outro valor: ");
        valor2 = input.nextInt();

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O menor ou igual valor é: " + valor2);
        }

    }
}
