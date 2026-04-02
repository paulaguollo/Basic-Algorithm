package FichaPratica2;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX06 ___________");
        System.out.println("You can see the max and min value");

        int value1, value2;

        System.out.print("Enter first value: ");
        value1 = input.nextInt();

        System.out.print("Enter second value: ");
        value2 = input.nextInt();

        if(value1>value2){
            System.out.println(value1 + " " + value2);
        } else {
            System.out.println(value2 + " " + value1);
        }
    }
}
