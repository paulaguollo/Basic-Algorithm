package FichaPratica05;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //tipo_dados[ ] nome_vetor = new tipo_dados[nº de elementos]

        //criação de variável
        int[] array = new int[10];

        System.out.println("----- Leitura do Array -----");

        for(int i=0; i < array.length; i++) { //ou for (int i = 0; i < 10; i++)
            System.out.print("Insira um número para o vetor[" + i + "]: ");
            array[i] = input.nextInt();
        }

        System.out.println("----- Impressão do Array -----");

        for(int i=0; i < array.length; i++) { //ou for (int i = 0; i < 10; i++)
            System.out.println("array[" + i + "]: " + array[i]);
        }

    }
}

//Implemente um programa que permita adicionar 10 números inteiros a
// um array e que os imprima pela ordem de inserção.