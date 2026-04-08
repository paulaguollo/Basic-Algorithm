package FichaPratica2;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX13 ___________");
        System.out.println("About hours");

        int horas, minutos;

        System.out.print("Horas: ");
        horas = input.nextInt();

        System.out.print("Minutos: ");
        minutos = input.nextInt();

        if (horas < 12) { //Manhã (before 11:59 am will be 12pm)
            System.out.println(horas+":"+minutos+" AM");
        } else { //Tarde
            horas = horas - 12;
            System.out.println(horas+":"+minutos+" PM");
        }
    }
}
