// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex10 — Números pares até um limite
// Objetivo : Ler um limite e imprimir os números pares de 2 até esse limite
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX10 ___________");
        System.out.println("Give me a number more than 2 and I will show you the even numbers from 2 to the limit");

        int limite, numero = 2, salto = 2;
        // numero: começa no primeiro par (2)
        // salto : avança de 2 em 2 para manter sempre números pares

        System.out.print("Enter limit number: ");
        limite = input.nextInt();

        // Imprime pares enquanto não ultrapassar o limite
        while (numero <= limite) {
            System.out.println(numero);
            numero = numero + salto; // avança para o próximo par
        }
    }
}
