package FichaPratica1;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        //import Scanner to read
        Scanner input = new Scanner(System.in);

        //Variables
        int lado1, lado2, area, perimetro;
        System.out.println("__________ F01 | EX03 __________");

        //ask about lado1
        System.out.print("Coloque o valor da altura: ");
        lado1 = input.nextInt();

        //ask about lado2
        System.out.print("Coloque o valor do comprimento: ");
        lado2 = input.nextInt();

        //area
        area = lado1 * lado2;

        //perimetro
        perimetro = (lado1 * 2) + (lado2 * 2);

        //show results
        System.out.println("Esse é o perímetro do retangulo: " + perimetro);
        System.out.println("Essa é a área do retângulo: " + area);

    }
}
