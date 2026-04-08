package FichaPratica03;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX04 ___________");
        System.out.println("Enter a number and I will show you the sequence until it ");

        int num; //give the name limit can be better to understand the last number
        int i=0;

        System.out.print("Enter number: ");
        num = input.nextInt();

        while (i <= num) {
                System.out.print(i);
                i++; // i = i + 1;
            }
        }
    }
