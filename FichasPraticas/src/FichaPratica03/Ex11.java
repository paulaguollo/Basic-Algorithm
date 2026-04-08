package FichaPratica03;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("__________ F03 | EX11 ___________");
        System.out.println("xxx");

        int limite, salto, numero = 0;

        System.out.print("Insira o salto: ");
        salto = input.nextInt();

        System.out.print("Insira o limite: ");
        limite = input.nextInt();

        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + salto;
        }
    }
}

