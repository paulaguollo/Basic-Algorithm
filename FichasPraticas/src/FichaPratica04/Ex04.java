// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 04 — do-while Loops & Menus
// Exercise : Ex04 — Check if a number is prime
// Goal     : Read an integer and determine if it is prime
//            by testing all possible divisors from 2 to n-1
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        int number;
        boolean prime = true; // assumes prime until a divisor is found

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Tests all integers between 2 and (number-1) as possible divisors
        // A prime number is only divisible by 1 and itself
        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                // Found a divisor → not prime
                prime = false;
            }
        }

        // Display result based on the 'prime' flag
        if (prime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime...");
        }

    }
}
