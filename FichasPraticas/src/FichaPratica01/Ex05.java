// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex05 — Arithmetic mean and weighted average
// Goal     : Calculate the simple and weighted average (20%, 30%, 50%)
//            of three grades entered by the user
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        // Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP01 | EX05 ___________");
        System.out.println("Enter 3 grades to see the arithmetic mean and weighted average");

        // Variables for the grades and both types of average
        double grade1, grade2, grade3;
        double simpleMean, weightedMean;
        // Weights defined: grade1=20%, grade2=30%, grade3=50%

        // Read the three grades
        System.out.print("Enter the first grade: ");
        grade1 = input.nextDouble();
        System.out.print("Enter the second grade: ");
        grade2 = input.nextDouble();
        System.out.print("Enter the third grade: ");
        grade3 = input.nextDouble();

        // Simple arithmetic mean: sum of grades divided by the number of grades
        simpleMean = (grade1 + grade2 + grade3) / 3;
        System.out.println("Simple arithmetic mean: " + simpleMean);

        // Apply weights to each grade (variables are reused)
        grade1 = grade1 * 0.2;   // 20% weight
        grade2 = grade2 * 0.3;   // 30% weight
        grade3 = grade3 * 0.5;   // 50% weight
        double weightSum = 1;    // 0.2 + 0.3 + 0.5 = 1.0 (sum of weights)

        // Display each grade with its weight applied
        System.out.println("First grade with 20% weight: "  + grade1);
        System.out.println("Second grade with 30% weight: " + grade2);
        System.out.println("Third grade with 50% weight: "  + grade3);

        // Weighted mean: sum of weighted grades divided by sum of weights
        // Since weightSum=1, the division does not change the value
        weightedMean = (grade1 + grade2 + grade3) / weightSum;
        System.out.print("Weighted mean: " + weightedMean);
    }
}
