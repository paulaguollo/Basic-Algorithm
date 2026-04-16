// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 02 — Conditionals (if / switch)
// Exercise : Ex12 — Simple CRUD menu (switch)
// Goal     : Display a menu with 4 options (Create, Update,
//            Delete, Exit) and react to the choice using switch
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variables declared but not used in this exercise
        // (reserved for future use)
        String create, update, delete, exit;
        int option;

        // Display the menu
        System.out.println("__________ FP02 | EX12 ___________");
        System.out.println("The menu has these options");
        System.out.println("1. Create ");
        System.out.println("2. Update ");
        System.out.println("3. Delete");
        System.out.println("4. Exit ");

        System.out.println("Enter the number you want to access");

        System.out.print("Number: ");
        option = input.nextInt();

        // switch only executes the block matching the chosen option
        switch (option) {
            case 1:
                System.out.println("Create");
                break;
            case 2:
                System.out.println("Update");
                break;
            case 3:
                System.out.println("Delete");
                break;
            case 4:
                System.out.println(" "); // Exit — no specific message
                break;
            default:
                System.out.println("Invalid option");
        }
    }
}
