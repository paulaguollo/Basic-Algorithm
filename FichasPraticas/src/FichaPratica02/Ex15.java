// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex15 — Sort three numbers ascending or descending
// Goal     : Read three integers and an option (A/D), and display
//            the numbers in the order chosen by the user
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ FP02 | EX15 ___________");
        System.out.println("Tell me 3 numbers and choose ascending or descending order");

        int a, b, c;
        String order;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.print("Enter third number: ");
        c = input.nextInt();

        // toUpperCase ensures "a" and "A" are treated the same way
        System.out.print("Choose A (ascending) or D (descending): ");
        order = input.next().toUpperCase();

        switch (order) {

            case "A": // Ascending: smallest → largest
                if (a < b && a < c) {
                    if (b < c) { System.out.println(a + " " + b + " " + c); }
                    else        { System.out.println(a + " " + c + " " + b); }
                }
                if (b < a && b < c) {
                    if (a < c) { System.out.println(b + " " + a + " " + c); }
                    else        { System.out.println(b + " " + c + " " + a); }
                }
                if (c < a && c < b) {
                    if (a < b) { System.out.println(c + " " + a + " " + b); }
                    else        { System.out.println(c + " " + b + " " + a); }
                }
                break;

            case "D": // Descending: largest → smallest (inverse logic: uses > instead of <)
                if (a > b && a > c) {
                    if (b > c) { System.out.println(a + " " + b + " " + c); }
                    else        { System.out.println(a + " " + c + " " + b); }
                }
                if (b > a && b > c) {
                    if (a > c) { System.out.println(b + " " + a + " " + c); }
                    else        { System.out.println(b + " " + c + " " + a); }
                }
                if (c > a && c > b) {
                    if (a > b) { System.out.println(c + " " + a + " " + b); }
                    else        { System.out.println(c + " " + b + " " + a); }
                }
                break;

            default:
                System.out.println("Invalid option: " + order);
                break;
        }
    }
}
