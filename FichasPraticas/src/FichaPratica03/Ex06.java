package FichaPratica03;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("__________ F03 | EX06 ___________");
        System.out.println("Choose two numbers to shows the init and end of this sequence");

        int num1, num2;

        System.out.print("Enter the first number´s sequence: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number´s sequence: ");
        num2 = input.nextInt();

        while(num1 <= num2){
            System.out.println(num1);
            num1=num1+1;
        }
    }
}
