package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        //import Scanner to read
        Scanner input = new Scanner(System.in);

        //create variables
        int valor1, valor2, soma, sub, mult, div;

        System.out.println("__________ FP01 | EX02 __________");

        //insert valor 1
        System.out.print("Insira um número: ");
        valor1 = input.nextInt();

        //insert valor 2
        System.out.print("Insira outro número: ");
        valor2 = input.nextInt();

        //soma
        soma = valor1 + valor2;

        //sub
        sub = valor1 - valor2;

        //mult
        mult = valor1 * valor2;

        //div
        div = valor1 / valor2;

        //show responses
        System.out.println("A soma é: " + soma);
        System.out.println("A subtração é: " + sub);
        System.out.println("A multiplicação é: " + mult);
        System.out.println("A divisão é: " + div);
    }
}
