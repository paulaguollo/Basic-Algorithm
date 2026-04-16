// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 04 — do-while Loops & Menus
// Exercise : Ex01 — Calculator with repetition (do-while)
// Goal     : Perform arithmetic operations in a loop until
//            the user decides to quit (answer other than 'y')
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;
        String operation, again;

        // do-while guarantees the block runs AT LEAST ONCE
        // before checking the repetition condition
        do {
            // Read input data
            System.out.print("Enter the first value: ");
            num1 = input.nextDouble();
            System.out.print("Enter the second value: ");
            num2 = input.nextDouble();
            System.out.print("Enter the operation (+, -, *, /): ");
            operation = input.next();

            // switch chooses the operation based on the entered operator
            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;
                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;
                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;
                case "/":
                    // Validation: division by zero is not allowed
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;
                default:
                    System.out.println("Invalid operation!");
                    break;
            }

            // Ask the user if they want to continue
            System.out.print("Do you want to continue? (y/n): ");
            again = input.next();

        } while (again.equalsIgnoreCase("y")); // repeat if 'y' or 'Y' is entered

        System.out.println("Program closed.");
    }
}
