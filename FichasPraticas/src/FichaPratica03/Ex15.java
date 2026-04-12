package FichaPratica03;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Introduza um número inteiro não-negativo: ");
        int n = input.nextInt();

        // Guardamos o valor original para o print final
        int originalN = n;
        int fatorial = 1;

        // Se n for 0 ou 1, o fatorial é 1 e o ciclo nem chega a correr
        while (n > 1) {
            fatorial = fatorial * n;
            n--; // Decrementamos para o próximo passo
        }

        System.out.println("Fatorial de " + originalN + " = " + fatorial);
    }
}
