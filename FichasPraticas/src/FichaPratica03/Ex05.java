package FichaPratica03;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX05 ___________");
        System.out.println("Choose one number to be the times you want to print a phrase");

        int vezes;
        int i = 0; //counter
        String mensagem;

        System.out.print("How many times do you want to print? ");
        vezes = input.nextInt();

        System.out.print("What do you wanna print? ");
        input.nextLine(); //necessary to print more than one word
        mensagem = input.nextLine();

        while(i < vezes) {
            System.out.println(mensagem);
            i++;
        }

    }
}
