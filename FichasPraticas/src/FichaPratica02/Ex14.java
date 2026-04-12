// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex14 — Ordenar três números por ordem crescente
// Objetivo : Ler três inteiros e apresentá-los do menor ao maior
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX14 ___________");
        System.out.println("Tell me 3 numbers and I give you in sequence");

        int a, b, c;

        System.out.print("Enter first number: ");
        a = input.nextInt();

        System.out.print("Enter second number: ");
        b = input.nextInt();

        System.out.print("Enter third number: ");
        c = input.nextInt();

        // Estratégia: primeiro identifica qual é o menor dos três
        // depois dentro de cada bloco ordena os restantes dois entre si

        if (a < b && a < c) {
            // 'a' é o menor — decidir a ordem de b e c
            if (b < c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }

        if (b < a && b < c) {
            // 'b' é o menor — decidir a ordem de a e c
            if (a < c) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }

        if (c < a && c < b) {
            // 'c' é o menor — decidir a ordem de a e b
            if (a < b) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(c + " " + b + " " + a);
            }
        }
    }
}
