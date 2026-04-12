package FichaExtraCiclos;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double base; double expoente; double resultado=1;

        System.out.println("Vou te pedir dois numeros e te darei o resultado da potencia dele");
        System.out.print("Digite o primeiro número: ");
        base = input.nextDouble();
        System.out.print("Digite o segundo número: ");
        expoente = input.nextDouble();

        for (double i = 1; i <= expoente; i++){
            resultado *= base;
        }
        System.out.println("Esse é o resultado: "+resultado);

    }
}
