package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX06 ___________");
        System.out.println("Digite um ano e eu te digo se é bissexto");

        int ano;

        System.out.print("Digite um ano: ");
        ano = input.nextInt();

        if(ano%4==0){
            System.out.println(ano+" é um ano bissexto");
        } else {
            System.out.println(ano+" não é um ano bissexto");
        }
    }
}
