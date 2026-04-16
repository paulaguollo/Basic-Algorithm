// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex02 — Four arithmetic operations
// Goal     : Read two integers and display sum, subtraction,
//            multiplication and division between them
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        // Variables for the two operands and each result
        int value1, value2, sum, sub, mult, div;

        System.out.println("__________ FP01 | EX02 __________");

        // Read both values
        System.out.print("Enter a number: ");
        value1 = input.nextInt();

        System.out.print("Enter another number: ");
        value2 = input.nextInt();

        // Calculate the four basic operations
        sum  = value1 + value2;   // addition
        sub  = value1 - value2;   // subtraction
        mult = value1 * value2;   // multiplication
        div  = value1 / value2;   // integer division (truncates decimal part)

        // Display the results
        System.out.println("Sum: "            + sum);
        System.out.println("Subtraction: "   + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: "      + div);
    }
}
