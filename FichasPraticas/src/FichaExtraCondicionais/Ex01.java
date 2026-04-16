// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Extra Sheet — Conditionals
// Exercise : Ex01 — Minor or adult
// Goal     : Read the user's age and indicate whether they are
//            a minor or an adult (threshold: 18 years old)
// ============================================================

package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ EXTRA CONDITIONALS | EX01 ___________");
        System.out.println("Tell me your age and I will tell you if you are a minor or an adult");

        int age;

        System.out.print("What is your age? ");
        age = input.nextInt();

        // Simple condition: >= 18 is an adult, otherwise is a minor
        if (age >= 18) {
            System.out.print("You are an adult");
        } else {
            System.out.print("You are a minor");
        }

    }
}
