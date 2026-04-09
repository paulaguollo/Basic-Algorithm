package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX11 ___________");
        System.out.println("Say me positive numbers and I will count how many numbers you have in the intervalo (0-25)(26-50)(51-75)(76-100)");

        int num = 0;
        int counter1 = 0; int counter2 = 0; int counter3 = 0; int counter4 = 0;


        while (num >= 0) {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            if (num >= 0 && num <= 25 ) {
                counter1++;
            }
            else if (num >= 26 && num <= 50) {
                counter2++;
            }
            else if (num >= 51 && num <= 75) {
                counter3++;
            }
            else if (num >= 76 && num <= 100) {
                counter4++;
            }
        }
        System.out.println("between 0-25 you have: " + counter1 + " numbers");
        System.out.println("between 26-50 you have: " + counter2 + " numbers");
        System.out.println("between 51-75 you have: " + counter3 + " numbers");
        System.out.println("between 76-100 you have: " + counter4 + " numbers");
    }
}
