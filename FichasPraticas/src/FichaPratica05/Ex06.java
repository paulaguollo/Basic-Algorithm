package FichaPratica05;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //criação de variável
        int[] vetor = new int[10];
        boolean crescente = true;

        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor [" + i + "]: ");
            vetor[i] = input.nextInt();
        }
        //Avaliar se é crescente
        for (int i=1; i < vetor.length; i++) { //atenção para o i que deve começar em 1 para poder comparar considerando i-1
            if (vetor[i] <= vetor[i - 1]) {
                crescente = false; // apenas acontece se confirma o if
            }

            if (crescente) {
                System.out.print("É crescente");
            } else {
                System.out.print("Não é crescente");
            }

        }

    }
}
