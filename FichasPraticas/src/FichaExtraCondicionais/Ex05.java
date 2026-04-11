package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX05 ___________");
        System.out.println("Voce tem duas tentativas pra acertar o número");

        int randomNumber = 31, tentativa = 1;

        if (randomNumber >= 1 && randomNumber <= 100 && randomNumber != tentativa) {
            System.out.print("Adivinhe o número (1 a 100): ");
            tentativa = input.nextInt();
        }
        if (tentativa == randomNumber) {
            System.out.println("Acertou o número misterioso! Parabéns");
        } else if (tentativa > randomNumber) {
            System.out.println("Está alto");
            System.out.print("Adivinhe o número (1 a 100): ");
            tentativa = input.nextInt(); // pede a segunda tentativa
            if (tentativa == randomNumber) {
                System.out.println("Acertou o número misterioso! Parabéns");
            } else {
                System.out.println("Ficou sem tentativas... O número era " + randomNumber);
            }
        } else if (tentativa < randomNumber) {
            System.out.println("Está baixo");
            System.out.print("Adivinhe o número (1 a 100): ");
            tentativa = input.nextInt();
            if (tentativa == randomNumber) {
                System.out.println("Acertou o número misterioso! Parabéns");
            } else {
                System.out.println("Ficou sem tentativas... O número era " + randomNumber);
            }
        } else if (!(randomNumber >= 1 && randomNumber <= 100)) {
            System.out.println("Número invalido. Tente novamente com um valor entre 1 e 100");
        }

    }
}
