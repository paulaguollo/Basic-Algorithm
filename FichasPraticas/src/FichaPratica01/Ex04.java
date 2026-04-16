// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 01 — Data Types & Input/Output
// Exercise : Ex04 — Area of a circle
// Goal     : Read the radius and calculate the area using PI ≈ 3.14
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        // PI is a constant (fixed value); radius is read from the user
        // double allows decimal values
        double PI = 3.14, radius, area;

        System.out.println("__________ FP01 | EX04 __________");

        // Read the radius (nextDouble accepts decimal values)
        System.out.print("Enter the radius: ");
        radius = input.nextDouble();

        // Circle area formula: π × r²
        area = PI * (radius * radius);

        // Display the result
        System.out.println("Circle area: " + area);
    }
}
