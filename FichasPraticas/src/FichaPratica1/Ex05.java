package FichaPratica1;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {

        //import scanner
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F01 | EX05 ___________");
        System.out.println("Insira as 3 notas para perceber a média aritmética e média ponderada");
        //variables
        double nota1, nota2, nota3;
        double mediaSimples, mediaPonderada;
        //media ponderada = 20%, 30%, 50%

        //ask grades
        System.out.print("Insira a primeira nota: ");
        nota1 = input.nextDouble();
        System.out.print("Insira a segunda nota: ");
        nota2 = input.nextDouble();
        System.out.print("Insira a terceira nota: ");
        nota3 = input.nextDouble();

        //media
        mediaSimples = (nota1 + nota2 + nota3)/3;
        System.out.println("A média Aritmética simples é: " + mediaSimples);

        //calculo de ponderação de cada nota
        nota1 = nota1 * 0.2;
        nota2 = nota2 * 0.3;
        nota3 = nota3 * 0.5;
        double somaPeso = 1; //0.5 + 0.3 + 0.2

        //apresenta as ponderações
        System.out.println("A primeira nota com ponderação de 20% é: " + nota1);
        System.out.println("A segunda nota com ponderação de 30% é: " + nota2);
        System.out.println("A terceira nota com ponderação de 50% é: " + nota3);

        //media ponderada com novos valores de nota
        mediaPonderada = (nota1 + nota2 + nota3)/somaPeso;
        System.out.print("A média Ponderada é: " + mediaPonderada);
    }
}
