package FichaPratica02;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double nota1, nota2, nota3;
        double peso, somanotas, mediafinal;

        System.out.println("__________ F02 | EX08 ___________");
        System.out.println("Weighted average of three grades (0-20)");

        System.out.print("Enter first grade: ");
        nota1 = input.nextDouble();

        System.out.print("Enter second grade: ");
        nota2 = input.nextDouble();

        System.out.print("Enter third grade: ");
        nota3 = input.nextDouble();

        nota1= nota1 * 0.25;
        nota2= nota2 * 0.35;
        nota3= nota3 * 0.40;

        somanotas= nota1 + nota2 + nota3;
        peso= 0.25+0.35+0.40;

        mediafinal = somanotas/peso;

        System.out.println("Final grade is: " + mediafinal);

        if(mediafinal > 9.5) {
            System.out.println("Approved. Congrats :)");
        } else {
            System.out.println("You were not approved, but don't give up just try again o/");
        }
    }
}
