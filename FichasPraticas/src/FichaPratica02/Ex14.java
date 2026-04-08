package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX14 ___________");
        System.out.println("Tell me 3 numbers and I give you in sequence");

        int a, b, c;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.print("Enter third number: ");
        c = input.nextInt();

        if (a < b && a < c) {
            // A ... ...
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }

        if (b < a && b < c) {
            // B ... ...
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }

        if (c < a && c < b) {
            // C ... ...
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
