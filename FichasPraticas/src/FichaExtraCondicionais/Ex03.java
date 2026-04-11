package FichaExtraCondicionais;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ PL CONDICIONAIS | EX03 ___________");
        System.out.println("Se gastar mais de 100 euros tem 10% de desconto");

     double preco, comdesconto;

        System.out.print("Introduza o preço: ");
        preco=input.nextDouble();

        comdesconto=preco*0.90;

        if(preco>=100){
            System.out.println(comdesconto+"$ é o valor com 10% de desconto");
        } else {
            System.out.println(preco+"$ é um valor sem desconto. Precisa ser pelo menos 100$");
        }

    }
}
