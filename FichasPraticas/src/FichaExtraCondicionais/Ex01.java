package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX01 ___________");
        System.out.println("Tell me your age and I will tell you if you are maior ou menor de idade");

        int age;

        System.out.print("What is the age? ");
        age = input.nextInt();

        if (age>=18){
            System.out.print("You are maior de idade");
        } else {
            System.out.print("You are menor de idade");
        }

    }
}
