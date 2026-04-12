package FichaExtraCiclos;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, maior, menor;

        System.out.print("Digite um número: ");
        num = input.nextInt();

        maior = num;
        menor = num;

        while(num != 0){
            if (num > maior) {
                maior = num;
            }
            if (num < maior) {
                menor = num;
            }
            System.out.print("Digite um número: ");
            num = input.nextInt();
        } if (maior == 0 && menor == 0){
            System.out.println("Nenhum número válido foi introduzido");
        }
        else {
            System.out.println("Você digitou 0 e o programa parou.");
            System.out.println("Este é o menor número digitado: " +menor+" | Este é o maior: "+maior);
        }
    }
}
