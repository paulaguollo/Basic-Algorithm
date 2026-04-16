// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex10 — Calculator with switch
// Goal     : Read two numbers and an operator (+, -, *, /)
//            and execute the chosen operation using switch
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX10 ___________");
        System.out.println("Choose the operation you want to calculate and enter \"+" or "-" or "*" or "/\"");

        double value1, value2;
        String operator;
        double sum, sub, div, mult;

        System.out.print("Enter first number: ");
        value1 = input.nextDouble();

        System.out.print("Enter second number: ");
        value2 = input.nextDouble();

        System.out.print("Choose mathematical operation: ");
        operator = input.next();

        // Pre-calculates all possible results
        sum  = value1 + value2;
        sub  = value1 - value2;
        div  = value1 / value2;
        mult = value1 * value2;

        // switch compares the String 'operator' with each case
        // Only the case matching the chosen operator is executed
        switch (operator) {
            case "+":
                System.out.println(sum);
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
                System.out.println("Please insert a valid operation sign");
        }

    }
}
