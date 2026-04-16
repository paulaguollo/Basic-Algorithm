// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 04 — do-while Loops & Menus
// Exercise : Ex03 — Number guessing game
// Goal     : Player 1 sets a secret number; Player 2 tries to
//            guess it in as many attempts as needed,
//            receiving hints ("higher" / "lower")
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        int secretNumber, guess, guessCounter = 0;

        // Player 1 sets the number that Player 2 has to guess
        System.out.print("PLAYER 1 - Enter the secret number (0 - 100): ");
        secretNumber = input.nextInt();

        // do-while: Player 2 always tries at least once
        // The loop repeats while the guess is different from the secret number
        do {
            System.out.print("\nPLAYER 2 - Try to guess: ");
            guess = input.nextInt();
            guessCounter++; // count each attempt

            // Feedback to help Player 2 get closer to the secret number
            if (guess > secretNumber) {
                System.out.println("The secret number is lower...");
            }

            if (guess < secretNumber) {
                System.out.println("The secret number is higher...");
            }

        } while (guess != secretNumber); // exits the loop when the guess is correct

        System.out.println("Congratulations! You guessed the secret number: " + secretNumber);
        System.out.println("It took " + guessCounter + " attempts.");
    }
}
