package FichaPratica2;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX04 ___________");
        System.out.println("How many points the pilot will win?");

        int place;

        System.out.print("Enter pilot's place: ");
        place = input.nextInt();

        switch (place) {
            case 1: //o 1 é sobre o input que a pessoa coloca
                System.out.println("Win 10 points");
                break;
            case 2:
                System.out.println("Win 8 points");
                break;
            case 3:
                System.out.println("Win 6 points");
                break;
            case 4:
                System.out.println("Win 5 points");
                break;
            case 5:
                System.out.println("Win 4 points");
                break;
            case 6:
                System.out.println("Win 3 points");
                break;
            case 7:
                System.out.println("Win 2 points");
                break;
            case 8:
                System.out.println("Win 1 points");
                break;
            default:
                System.out.println("Place more than 8 so it is 0 points to win");
        }
    }
}
