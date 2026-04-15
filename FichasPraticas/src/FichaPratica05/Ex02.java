package FichaPratica05;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //tipo_dados[ ] nome_vetor = new tipo_dados[nº de elementos]

        //criação de variável
        double[] comissoes = new double[12];
        double somaComissoes = 0;

        System.out.println("----- Leitura das Comissões -----");

        for(int i=0; i < comissoes.length; i++) {
            System.out.print("Insira a comissão para o mês [" + i + "]: ");
            comissoes[i] = input.nextDouble();
        }

        System.out.println("----- Impressão das Comissões-----");

        for(int i=0; i < comissoes.length; i++) {
            System.out.println("array[" + i + "]: " + comissoes[i]);
        }

        System.out.println("----- Soma Total das Comissões -----");

        for(int i=0; i < comissoes.length; i++) {
            somaComissoes = somaComissoes + comissoes[i];

        }

        System.out.println(somaComissoes);

    }
}

//Implemente um programa que permita adicionar comissões
// mensais a um array de tamanho 12 (uma posição
//para cada mês) e calcular o seu total anual.