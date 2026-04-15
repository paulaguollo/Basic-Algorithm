package FichaPratica05;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //tipo_dados[ ] nome_vetor = new tipo_dados[nº de elementos]

        //criação de variável
        int[] vetor = new int[10];

        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira a comissão para o mês [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("O maior elemento é:"+maior);
    }
}

