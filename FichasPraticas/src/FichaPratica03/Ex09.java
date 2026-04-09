package FichaPratica03;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX09 ___________");
        System.out.println("Give me numbers, until you enter the number -1, I will say the average of the entered numbers (excluding -1).");

        double num=0, contador = 0, soma = 0, media;
        //cantador=-1
        //soma=1

        while (num != -1) { //-1 é a opção para parar de pedir inputs
            System.out.print("Enter a number (-1 to stop): ");
            num = input.nextDouble();
            soma = soma + num;
            contador++;
        }
        soma = soma + 1; //ou inicia a variavel assim
        contador = contador - 1; // ou inicia a variavel assim
        media = soma / contador;
        System.out.println("A média é: " + media);
    }
}
