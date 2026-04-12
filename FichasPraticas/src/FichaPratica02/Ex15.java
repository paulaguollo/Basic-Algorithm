// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex15 — Ordenar três números crescente ou decrescente
// Objetivo : Ler três inteiros e uma opção (C/D), e apresentar
//            os números na ordem escolhida pelo utilizador
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX15 ___________");
        System.out.println("Tell me 3 numbers and chose if you want to see in crescent ou decrescent order");

        int a, b, c;
        String ordem;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.print("Enter third number: ");
        c = input.nextInt();

        // toUpperCase garante que "c" e "C" são tratados da mesma forma
        System.out.print("Choose D ou C: ");
        ordem = input.next().toUpperCase();

        switch (ordem) {

            case "C": // Crescente: menor → maior
                if (a < b && a < c) {
                    if (b < c) { System.out.println(a + " " + b + " " + c); }
                    else        { System.out.println(a + " " + c + " " + b); }
                }
                if (b < a && b < c) {
                    if (a < c) { System.out.println(b + " " + a + " " + c); }
                    else        { System.out.println(b + " " + c + " " + a); }
                }
                if (c < a && c < b) {
                    if (a < b) { System.out.println(c + " " + a + " " + b); }
                    else        { System.out.println(c + " " + b + " " + a); }
                }
                break;

            case "D": // Decrescente: maior → menor (lógica inversa: usa > em vez de <)
                if (a > b && a > c) {
                    if (b > c) { System.out.println(a + " " + b + " " + c); }
                    else        { System.out.println(a + " " + c + " " + b); }
                }
                if (b > a && b > c) {
                    if (a > c) { System.out.println(b + " " + a + " " + c); }
                    else        { System.out.println(b + " " + c + " " + a); }
                }
                if (c > a && c > b) {
                    if (a > b) { System.out.println(c + " " + a + " " + b); }
                    else        { System.out.println(c + " " + b + " " + a); }
                }
                break;

            default:
                System.out.println("Opção inválida: " + ordem);
                break;
        }
    }
}
