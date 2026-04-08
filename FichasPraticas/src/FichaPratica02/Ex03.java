package FichaPratica02;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("__________ F02 | EX03 ___________");
        System.out.println("Tax to pay about the salary");

        double salary, tax;

        System.out.print("Enter salary value: ");
        salary = input.nextDouble();

        if (salary <= 15000) {
            tax = salary * 0.2;
            System.out.println("Pay 20% tax: " + tax);
        }
        if (salary > 15000 && salary <= 20000) {
            tax = salary * 0.3;
            System.out.println("Pay 30% tax: " + tax);
        }
        if (salary > 20000 && salary <= 25000) {
            tax = salary * 0.35;
            System.out.println("Pay 35% tax: " + tax);
        }
        if(salary>25000) {
            tax = salary * 0.4;
            System.out.println("Pay 40% tax: " + tax);
        }
    }
}
