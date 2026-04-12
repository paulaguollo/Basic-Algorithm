// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex11 — Saldo bancário com depósito ou levantamento
// Objetivo : Aplicar uma movimentação positiva (depósito) ou
//            negativa (levantamento) ao saldo e validar saldo suficiente
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F02 | EX11 ___________");
        System.out.println("bank balance and transactions");

        int saldo, movimento;
        int deposito;  // resultado quando a movimentação é positiva
        int retirada;  // resultado quando a movimentação é negativa

        System.out.print("Introduza o seu saldo: ");
        saldo = input.nextInt();

        System.out.print("Introduza a movimentação desejada (depositar (+) ou retirar (-): ");
        movimento = input.nextInt();

        // Se a movimentação for positiva → é um depósito
        if (movimento >= 1) {
            deposito = saldo + movimento;
            System.out.println("Seu saldo atual é: " + deposito);
        }

        // Se a movimentação for negativa → é um levantamento
        // Usa-se -movimento para tornar o valor positivo antes de subtrair
        if (movimento < 0) {
            retirada = saldo - (-movimento);
            if (retirada > 0) {
                System.out.println("Seu saldo atual é: " + retirada);
            } else {
                // Saldo ficaria negativo → operação recusada
                System.out.println("Operaçãp inválida. Saldo Insuficiente");
            }
        }
    }
}
