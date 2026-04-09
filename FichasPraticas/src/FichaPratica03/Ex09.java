package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX09 ___________");
        System.out.println("Give me numbers, until you enter the number -1, I will say the average of the entered numbers (excluding -1).");

int num; int contador=0; int soma=0; int media;

        System.out.print("Enter a number: ");
        num = input.nextInt();

while (num!=-1) { //-1 é a opção para parar de pedir inputs

    soma = soma + num;
    contador++;
    System.out.print("Enter a number: ");
    num = input.nextInt();
}
    media = soma / contador;
    System.out.println("A média é: " + media);
    }
}
