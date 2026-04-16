// ============================================================
// Module   : Algorithms & Programming
// Sheet    : Practical Sheet 04 — do-while Loops & Menus
// Exercise : Ex02 — CRUD menu with do-while
// Goal     : Display a menu in a loop (Create / Update /
//            Delete / Exit) and execute the chosen option,
//            repeating until the user selects Exit (4)
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Scanner for reading keyboard input
        Scanner input = new Scanner(System.in);

        int option;

        // do-while: the menu is always shown at least once
        // and repeats while the option is not 4 (Exit)
        do {

            // Display the menu at each iteration
            System.out.println("\n\n_____ MENU _____");
            System.out.println("1. Create");
            System.out.println("2. Update");
            System.out.println("3. Delete");
            System.out.println("4. Exit");

            System.out.print("\nOption: ");
            option = input.nextInt();

            // Execute the action matching the chosen option
            switch (option) {
                case 1:
                    System.out.println("\n_____ CREATE _____");
                    // Read data to create a record
                    System.out.print("Enter name: ");
                    String name = input.next();

                    System.out.print("Enter postal code: ");
                    String postalCode = input.next();
                    break;

                case 2:
                    System.out.println("\n_____ UPDATE _____");
                    // Update logic (not implemented)
                    break;

                case 3:
                    System.out.println("\n_____ DELETE _____");
                    // Delete logic (not implemented)
                    break;

                case 4:
                    System.out.println("\nClosing the program...");
                    // The while condition will evaluate option == 4 → exits the loop
                    break;

                default:
                    System.out.println("Unrecognised option: " + option);
                    break;
            }

        } while (option != 4); // repeat while option is not Exit

    }
}
