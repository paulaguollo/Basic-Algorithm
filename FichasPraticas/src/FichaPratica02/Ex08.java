// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex08 — Weighted average and pass/fail
// Goal     : Calculate the weighted average of 3 grades (25%, 35%, 40%)
//            and indicate whether the student passed (≥ 9.5)
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double grade1, grade2, grade3;
        double weightSum, gradeSum, finalGrade;

        System.out.println("__________ FP02 | EX08 ___________");
        System.out.println("Weighted average of three grades (0-20)");

        // Read the three grades
        System.out.print("Enter first grade: ");
        grade1 = input.nextDouble();

        System.out.print("Enter second grade: ");
        grade2 = input.nextDouble();

        System.out.print("Enter third grade: ");
        grade3 = input.nextDouble();

        // Apply weights to each grade
        grade1 = grade1 * 0.25;  // 25% weight
        grade2 = grade2 * 0.35;  // 35% weight
        grade3 = grade3 * 0.40;  // 40% weight

        // Sum of weighted grades and sum of weights (should equal 1.0)
        gradeSum  = grade1 + grade2 + grade3;
        weightSum = 0.25 + 0.35 + 0.40;  // = 1.0

        // Final grade: weighted sum / sum of weights
        finalGrade = gradeSum / weightSum;

        System.out.println("Final grade is: " + finalGrade);

        // Pass/fail check: minimum passing grade is 9.5
        if (finalGrade > 9.5) {
            System.out.println("Approved. Congrats :)");
        } else {
            System.out.println("You were not approved, but don't give up just try again o/");
        }
    }
}
