// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 04 — Ciclos do-while e Menus
// Exercício: Ex04 — Verificar se um número é primo
// Objetivo : Ler um inteiro e determinar se é primo,
//            testando todos os possíveis divisores de 2 até n-1
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Scanner para leitura de dados do teclado
        Scanner input = new Scanner(System.in);

        int numero;
        boolean primo = true; // assume primo até encontrar um divisor

        System.out.print("Insira um número: ");
        numero = input.nextInt();

        // Testa todos os inteiros entre 2 e (numero-1) como possíveis divisores
        // Um número primo só é divisível por 1 e por ele próprio
        for (int divisor = 2; divisor < numero; divisor++) {
            if (numero % divisor == 0) {
                // Encontrou um divisor → não é primo
                primo = false;
            }
        }

        // Apresenta o resultado com base na flag 'primo'
        if (primo) {
            System.out.println("Primo");
        } else {
            System.out.println("Não primo...");
        }

    }
}
