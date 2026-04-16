// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Conditionals
// Exercise : Ex04 — Vowel or Consonant (switch)
// Goal     : Read a letter and indicate if it is a vowel or consonant,
//            using switch with fall-through on vowel cases
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ EXTRA CONDITIONALS | EX04 ___________");
        System.out.println("Choose a letter and I will tell you if it is a vowel or consonant");

        String letter;

        System.out.print("Enter a letter of the alphabet: ");
        // toLowerCase converts to lowercase to simplify the comparison
        letter = input.next().toLowerCase();

        // Fall-through: vowel cases have no break between them,
        // so any vowel falls through to the same println
        switch (letter) {
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println(letter + " is a vowel.");
                break;
            default:
                // Anything that is not a vowel is treated as a consonant
                System.out.println(letter + " is a consonant.");
        }

    }
}
