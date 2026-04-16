// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex01 — Sum of two integers
// Goal     : Read two integers and display their sum
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // Scanner allows reading what the user types on the keyboard
        Scanner input = new Scanner(System.in);

        // Variable declarations: two operands and the result
        int value1, value2, sum;

        System.out.println("___________ FP01 | EX01 ___________");

        // Read the first number
        System.out.print("Enter a number: ");
        value1 = input.nextInt();

        // Read the second number
        System.out.print("Enter another number: ");
        value2 = input.nextInt();

        // Arithmetic operation: addition
        sum = value1 + value2;

        // Display the result
        System.out.println("The sum result is: " + sum);

    }
}
