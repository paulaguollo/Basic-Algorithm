package FichaPratica2;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX10 ___________");
        System.out.println("Choose the option you want to calculate and enter \"+\" or \"-\" or \"*\" or \"/\"");

        double value1, value2;
        String signal;
        double soma, sub, div, mult;

        System.out.print("Enter first number: ");
        value1 = input.nextDouble();

        System.out.print("Enter second number: ");
        value2 = input.nextDouble();

        System.out.print("Choose mathematical operation: ");
        signal = input.next();

        soma= value1 + value2;
        sub= value1 - value2;
        div= value1 / value2;
        mult= value1 * value2;

        switch(signal){
            case "+":
                System.out.println(soma);
                break;
            case "-":
                System.out.println(sub);
                break;
            case "/":
                System.out.println(div);
                break;
            case "*":
                System.out.println(mult);
                break;
            default:
                System.out.println("Please insert operation signal");
        }

    }
}
