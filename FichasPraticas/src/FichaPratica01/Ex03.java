// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex03 — Area and Perimeter of a rectangle
// Goal     : Read height and length and calculate area and perimeter
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        // side1 = height | side2 = length
        int side1, side2, area, perimeter;
        System.out.println("__________ FP01 | EX03 __________");

        // Read the rectangle dimensions
        System.out.print("Enter the height: ");
        side1 = input.nextInt();

        System.out.print("Enter the length: ");
        side2 = input.nextInt();

        // Area formula: base × height
        area = side1 * side2;

        // Perimeter formula: sum of all 4 sides → 2×(side1 + side2)
        perimeter = (side1 * 2) + (side2 * 2);

        // Display the results
        System.out.println("Rectangle perimeter: " + perimeter);
        System.out.println("Rectangle area: "      + area);

    }
}
