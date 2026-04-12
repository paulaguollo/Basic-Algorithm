// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Extra — Condicionais
// Exercício: Ex02 — Peso na Lua
// Objetivo : Calcular o peso equivalente na Lua
//            (peso lunar ≈ 16% do peso na Terra) e validar o input
// ============================================================

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

        // A gravidade da Lua é ~16% da da Terra
        pesolua = peso * 0.16;

        // Validação: peso deve ser positivo para fazer sentido
        if (peso > 0) {
            System.out.println("Este é o peso na lua: " + pesolua + " Kg");
        } else {
            System.out.println("Peso inválido. Tente outra vez com um número maior que 0.");
        }
    }
}
