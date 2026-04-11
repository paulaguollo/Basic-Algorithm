package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX04 ___________");
        System.out.println("Escolha uma letra e eu te digo se é vogal ou consoante");

        String letter;

        System.out.print("Digite uma letra do alfabeto: ");
        letter = input.next().toLowerCase();

        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter + " é uma vogal.");
                break;
            default:
                System.out.println(letter + " é uma consoante.");
        }

    }
}
