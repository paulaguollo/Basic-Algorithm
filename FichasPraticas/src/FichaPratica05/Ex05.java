package FichaPratica05;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //criação de variável
        double[] vetor = new double[3];

        System.out.println("----- Leitura do Vetor -----");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Insira um valor [" + i + "]: ");
            vetor[i] = input.nextDouble();
        }

        System.out.println("----- Soma Total dos valores -----");
        double soma = 0;

        for(int i=0; i < vetor.length; i++) {
            soma = soma + vetor[i];
        }

        double media = soma / vetor.length;
        System.out.print("A média é: "+media);
    }
}
