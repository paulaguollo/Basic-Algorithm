package FichaPratica1;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F01 | EX08 ___________");
        System.out.println("Vou calcular o total do tempo de música do seu albúm");

        int horas, totalminutos, totalsegundos, converteminutos, somasegundos;
        int hh, mm, ss;
                int minutos1, minutos2, minutos3;
                int segundos1, segundos2, segundos3;

                //tempo da primeira musica
        System.out.print("Introduza quantos minutos tem a música 1? ");
        minutos1 = input.nextInt();
        System.out.print("Introduza quantos segundos tem a música 1? ");
        segundos1 = input.nextInt();

        //tempo da segunda musica
        System.out.print("Introduza quantos minutos tem a música 2? ");
        minutos2 = input.nextInt();
        System.out.print("Introduza quantos segundos tem a música 2? ");
        segundos2 = input.nextInt();

        //tempo da terceira musica
        System.out.print("Introduza quantos minutos tem a música 3? ");
        minutos3 = input.nextInt();
        System.out.print("Introduza quantos segundos tem a música 3? ");
        segundos3 = input.nextInt();

        totalsegundos = segundos1 + segundos2 + segundos3;
        totalminutos = minutos1 + minutos2 + minutos3;
        converteminutos = totalminutos * 60;
        somasegundos = totalsegundos + converteminutos;


        hh = somasegundos / 3600;

        mm = somasegundos/60 - (hh*60); // calculo em minutos
        ss = somasegundos-(hh*3600)-(mm*60); // segundos

        System.out.println("Total: " +hh+ "h" +mm+ "m" +ss+ "s");
    }
}
