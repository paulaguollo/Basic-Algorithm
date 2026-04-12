package FichaExtraCiclos;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, negativo= 0, positivo= 0;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        while(num != 0){
            if (num > 0) {
                positivo++;
            }
            if (num < 0){
                negativo++;
            }
            System.out.print("Digite um número: ");
            num = input.nextInt();
        } if (negativo == 0 && positivo == 0){
            System.out.println("Nenhum número válido foi introduzido");
        }
        else {
            System.out.println("Você digitou 0 e o programa parou.");
            System.out.println("Esta é a quantidade de digitos positivos: " + positivo);
            System.out.println("Esta é a quantidade de digitos negativos: "+negativo);
        }
    }
}
