package FichaPratica05;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //tipo_dados[ ] nome_vetor = new tipo_dados[nº de elementos]

        //criação de variável
        int[] vetor = new int[10];

        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor [" + i + "]: ");
            vetor[i] = input.nextInt();
        }

        int menor = vetor[0]; //NAO PODE INICIAR EM 0. mas pode ser a posição 0 ou qualquer outra mas preciso garantir que sei o tamanho do array

        for (int i = 0; i < vetor.length; i++) {
            if(vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        System.out.print("O menor elemento é:"+ menor);
    }
}

