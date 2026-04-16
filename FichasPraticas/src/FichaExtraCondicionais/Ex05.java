// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Conditionals
// Exercise : Ex05 — Guess the number (2 attempts)
// Goal     : The user has 2 attempts to guess the secret number (31);
//            receives a hint if they fail on the 1st attempt
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ EXTRA CONDITIONALS | EX05 ___________");
        System.out.println("You have two attempts to guess the number");

        int secretNumber = 31, attempt = 1; // fixed secret number

        // Check if the number is in the valid range and if the initial attempt is different
        if (secretNumber >= 1 && secretNumber <= 100 && secretNumber != attempt) {
            System.out.print("Guess the number (1 to 100): ");
            attempt = input.nextInt(); // 1st attempt
        }

        if (attempt == secretNumber) {
            // Correct on the 1st attempt
            System.out.println("You guessed the mystery number! Congratulations");

        } else if (attempt > secretNumber) {
            // Hint: too high → ask for 2nd attempt
            System.out.println("Too high");
            System.out.print("Guess the number (1 to 100): ");
            attempt = input.nextInt();
            if (attempt == secretNumber) {
                System.out.println("You guessed the mystery number! Congratulations");
            } else {
                System.out.println("No more attempts... The number was " + secretNumber);
            }

        } else if (attempt < secretNumber) {
            // Hint: too low → ask for 2nd attempt
            System.out.println("Too low");
            System.out.print("Guess the number (1 to 100): ");
            attempt = input.nextInt();
            if (attempt == secretNumber) {
                System.out.println("You guessed the mystery number! Congratulations");
            } else {
                System.out.println("No more attempts... The number was " + secretNumber);
            }

        } else if (!(secretNumber >= 1 && secretNumber <= 100)) {
            // Case where the secret number is out of range (never happens with 31)
            System.out.println("Invalid number. Please try again with a value between 1 and 100");
        }

    }
}
