package FichaPratica1;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ F01 | EX06 ___________");
        System.out.println("insira dois valores inteiros");

        int valor1, valor2, aux;

        System.out.print("O primeiro número é: ");
        valor1 = input.nextInt();
        System.out.print("O segundo número é: ");
        valor2 = input.nextInt();

        //permuta com uma variavel a mais
        /*aux = valor1;
        valor1 = valor2;
        valor2 = aux;*/

        //permuta sem add variable
       valor1 = valor1 + valor2;
       valor2 = valor1 - valor2;
       valor1 = valor1 - valor2;

        System.out.println("Esses sao os números permutados: " + valor1 +" | "+valor2);
    }
}
