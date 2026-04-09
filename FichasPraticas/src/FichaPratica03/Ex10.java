package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX10 ___________");
        System.out.println("Give me a number more than 2 and I will show you the even numbers from 2 to the limit");

        int limite, numero=2, salto=2;

        System.out.print("Enter limit number: ");
        limite = input.nextInt();

        while(numero <= limite) {
            System.out.println(numero);
            numero = numero + salto;
        }
    }
}
