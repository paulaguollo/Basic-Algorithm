package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX11 ___________");
        System.out.println("bank balance and transactions");

        int saldo, movimento;
        int deposito; //movimento positivo
        int retirada; //movimento negativo

        System.out.print("Introduza o seu saldo: ");
        saldo = input.nextInt();

        System.out.print("Introduza a movimentação desejada (depositar (+) ou retirar (-): ");
        movimento = input.nextInt();

        if(movimento >= 1){
            deposito= saldo+movimento;
            System.out.println("Seu saldo atual é: " + deposito);
        }

        //se o valor que eu quero movimentar for negativo quer dizer que é um retirada
        //entrao preciso fazer saldo-movimento
        //mas se a retirada (saldo-movimento) for <0 entao aparece mensagem
        if(movimento < 0){
            retirada= saldo-(-movimento); //como bota negativo na movimentação precisa trocar o sinal pra nao ficar positivo
            if(retirada > 0) {
                System.out.println("Seu saldo atual é: " + retirada);
            } else {
                System.out.println("Operaçãp inválida. Saldo Insuficiente");
            }
        }
    }
}
