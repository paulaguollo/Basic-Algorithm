package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX02 ___________");
        System.out.println("Esse seria seu peso na lua");

     double peso, pesolua;

        System.out.print("Insira o Peso em kg: ");
        peso = input.nextDouble();

        pesolua = peso * 0.16;

        if (peso>0){
            System.out.println("Este é o peso na lua: "+pesolua+" Kg");
        } else {
            System.out.println("Peso inválido. Tente outra vez com um número maior que 0.");
        }
    }
}
