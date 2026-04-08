package FichaPratica02;

import java.util.Scanner;

public class Ex16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX16 ___________");
        System.out.println("Me diga um valor multiplo de 5 e eu te digo quantas notas precisa para ser decomponto");

        int valor, numeroNotas;

        System.out.print("Enter value: ");
        valor = input.nextInt();

        if (valor % 5 == 0) {
            numeroNotas = valor / 200;
            System.out.println("Quantidade de notas de 200$: " + numeroNotas);
            valor = valor % 200;

            numeroNotas = valor / 100;
            System.out.println("Quantidade de notas de 100$: " + numeroNotas);
            valor = valor % 100;

            numeroNotas = valor / 50;
            System.out.println("Quantidade de notas de 50$: " + numeroNotas);
            valor = valor % 50;

            numeroNotas = valor / 20;
            System.out.println("Quantidade de notas de 20$: " + numeroNotas);
            valor = valor % 20;

            numeroNotas = valor / 10;
            System.out.println("Quantidade de notas de 10$: " + numeroNotas);
            valor = valor % 10;

            numeroNotas = valor / 5;
            System.out.println("Quantidade de notas de 5$: " + numeroNotas);
        } else {
            System.out.println("Não damos troco");
        }
    }
}
