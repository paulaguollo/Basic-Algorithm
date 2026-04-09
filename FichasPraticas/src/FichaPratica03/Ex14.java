package FichaPratica03;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX14 ___________");
        System.out.println("xxxxx");

        int quantidadeNumeros, contador=1, numeroAtual, numeroAnterior;
        boolean crescente=true;

        System.out.print("Quando numeros deseja inserir? ");
        quantidadeNumeros=input.nextInt();

        System.out.print("Insira um número: ");
        numeroAnterior = input.nextInt();

        while(contador < quantidadeNumeros) {
            System.out.print("Insira um número: ");
            numeroAtual = input.nextInt();

            if(numeroAtual <= numeroAnterior) {
                //sequencia deixa de ser crescente
                crescente = false;
            }
                numeroAnterior = numeroAtual; //considera o primeiro numero anterior dado pra comparar ao primeiro numero do ciclo
            contador++;
        }
        if(crescente) {
            System.out.println("A sequencia é Crescente");
        } else {
            System.out.println("Não Crescente");
        }
    }
}
