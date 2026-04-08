package FichaPratica02;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

    double salary, tax;

     System.out.println("__________ F02 | EX02 ___________");
        System.out.println("Tax to pay about the salary");

        System.out.print("Enter salary value: ");
        salary = input.nextDouble();

        if(salary <= 15000){
            tax=salary*0.2;
            System.out.print("Pay 20% tax: " + tax);
        } else {
            tax=salary*0.3;
            System.out.print("Pay 30% tax: " + tax);
        }
    }
}
