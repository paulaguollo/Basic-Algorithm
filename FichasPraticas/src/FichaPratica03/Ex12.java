// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 03 — Ciclos (while)
// Exercício: Ex12 — Contar números por intervalo
// Objetivo : Ler números positivos até introduzir um negativo
//            e contar quantos pertencem a cada intervalo:
//            [0-25], [26-50], [51-75], [76-100]
// ============================================================

package FichaPratica03;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("__________ F03 | EX12 ___________");
        System.out.println("Say me positive numbers and I will count how many numbers you have in the intervalo (0-25)(26-50)(51-75)(76-100)");

        int num = 0;
        // Um contador para cada intervalo
        int counter1 = 0; // [0-25]
        int counter2 = 0; // [26-50]
        int counter3 = 0; // [51-75]
        int counter4 = 0; // [76-100]

        // O ciclo corre enquanto o número introduzido for >= 0
        // Um número negativo serve de sentinela para terminar
        while (num >= 0) {
            System.out.print("Enter a number: ");
            num = input.nextInt();

            // Classifica o número no intervalo correspondente e incrementa o contador
            if      (num >= 0  && num <= 25)  { counter1++; }
            else if (num >= 26 && num <= 50)  { counter2++; }
            else if (num >= 51 && num <= 75)  { counter3++; }
            else if (num >= 76 && num <= 100) { counter4++; }
            // Números fora destes intervalos (incluindo o negativo final) são ignorados
        }

        System.out.println("between 0-25 you have: "   + counter1 + " numbers");
        System.out.println("between 26-50 you have: "  + counter2 + " numbers");
        System.out.println("between 51-75 you have: "  + counter3 + " numbers");
        System.out.println("between 76-100 you have: " + counter4 + " numbers");
    }
}
