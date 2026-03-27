package FichaPratica1;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        //import Scanner to read
        Scanner input = new Scanner(System.in);

        //create variables
        int valor1, valor2, soma;

        System.out.println("___________ FP01 | EX01 ___________");

        //aks about the first number/variable valor1
        System.out.print("Insira um número: ");
        valor1 = input.nextInt();

        //ask about the second number/variable valor2
        System.out.print("Insira outro número: ");
        valor2 = input.nextInt();

        //calculate
        soma = valor1 + valor2;

        //show response
        System.out.println("O resultado da soma é: " + soma);

    }
}
