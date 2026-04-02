package FichaPratica2;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX07 ___________");
        System.out.println("Is the number even or odd??");

        int number;

        System.out.print("Enter number: ");
        number = input.nextInt();

        if(number % 2 == 0) {
            System.out.println("Is even");
        } else {
            System.out.println("Is odd");
        }
    }
}
