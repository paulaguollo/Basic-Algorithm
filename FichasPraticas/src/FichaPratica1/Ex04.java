package FichaPratica1;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //import scanner to read
        Scanner input = new Scanner(System.in);

        //variables
        double PI = 3.14, raio, area;

        System.out.println("__________ F01 | EX04 __________");

        //ask radius valor
        System.out.print("Este é o valor do raio: ");
        raio = input.nextDouble();

        //area
        area = PI * (raio * raio);

        //show result
        System.out.println("A área da circuferência é: " + area);
    }
}


