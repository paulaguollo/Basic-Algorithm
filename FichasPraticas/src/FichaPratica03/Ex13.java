package FichaPratica03;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("__________ F03 | EX13 ___________");
        System.out.println("xxxxx");

        int limite, numero;

        System.out.print("Insira o numero de inicio: ");
        numero = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (numero <= limite) {
            if(numero%5==0) {
                System.out.println(numero);
            }
            numero++;
        }
    }
}
