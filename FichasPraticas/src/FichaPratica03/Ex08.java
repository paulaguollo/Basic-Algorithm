package FichaPratica03;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("__________ F03 | EX08 ___________");
        System.out.println("A program that reads an integer and prints the 5 previous and the 5 following.");

        int num, ant, suc;

        System.out.print("Enter a number: ");
        num = input.nextInt();

     ant=num-5;
     suc=num+5;

    while(ant<num) { //o limite é o numero
        System.out.println(ant);
        ant++; //eu achei qual o primeiro antecessor e entao vou pra frente
    }
    num++; //preciso passar o numero para que ele nao apareça
        System.out.println();

        while(suc>=num) { //eu sei qual o sucessor final
            System.out.println(num); //entao andamos o numero (num+1) até o sucessor
            num++;
        }
    }
}
