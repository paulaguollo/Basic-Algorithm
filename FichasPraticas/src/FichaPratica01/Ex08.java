// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex08 — Duração total de um álbum (3 músicas)
// Objetivo : Somar os tempos de 3 músicas (min:seg) e apresentar
//            o total no formato hh:mm:ss
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("__________ F01 | EX08 ___________");
        System.out.println("Vou calcular o total do tempo de música do seu albúm");

        // Variáveis para o resultado final em h/m/s
        int horas, totalminutos, totalsegundos, converteminutos, somasegundos;
        int hh, mm, ss;

        // Variáveis para os minutos e segundos de cada música
        int minutos1, minutos2, minutos3;
        int segundos1, segundos2, segundos3;

        // Leitura do tempo da música 1
        System.out.print("Introduza quantos minutos tem a música 1? ");
        minutos1 = input.nextInt();
        System.out.print("Introduza quantos segundos tem a música 1? ");
        segundos1 = input.nextInt();

        // Leitura do tempo da música 2
        System.out.print("Introduza quantos minutos tem a música 2? ");
        minutos2 = input.nextInt();
        System.out.print("Introduza quantos segundos tem a música 2? ");
        segundos2 = input.nextInt();

        // Leitura do tempo da música 3
        System.out.print("Introduza quantos minutos tem a música 3? ");
        minutos3 = input.nextInt();
        System.out.print("Introduza quantos segundos tem a música 3? ");
        segundos3 = input.nextInt();

        // Soma de todos os segundos e minutos
        totalsegundos  = segundos1 + segundos2 + segundos3;
        totalminutos   = minutos1  + minutos2  + minutos3;

        // Converter os minutos totais em segundos e somar a todos os segundos
        converteminutos = totalminutos * 60;
        somasegundos    = totalsegundos + converteminutos; // tudo em segundos

        // Converter os segundos totais em horas, minutos e segundos
        hh = somasegundos / 3600;                      // quantas horas completas cabem
        mm = somasegundos / 60 - (hh * 60);            // minutos restantes após as horas
        ss = somasegundos - (hh * 3600) - (mm * 60);   // segundos restantes

        System.out.println("Total: " + hh + "h" + mm + "m" + ss + "s");
    }
}
