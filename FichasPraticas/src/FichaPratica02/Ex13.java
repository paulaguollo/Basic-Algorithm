// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex13 — Converter horas de formato 24h para AM/PM
// Objetivo : Ler horas e minutos e apresentar no formato AM/PM
// ============================================================

package FichaPratica02;

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

        // Se horas < 12 estamos de manhã (AM)
        // Se horas >= 12 estamos à tarde/noite (PM) e subtrai-se 12
        if (horas < 12) {
            System.out.println(horas + ":" + minutos + " AM");
        } else {
            horas = horas - 12; // converter para formato 12h
            System.out.println(horas + ":" + minutos + " PM");
        }
    }
}
