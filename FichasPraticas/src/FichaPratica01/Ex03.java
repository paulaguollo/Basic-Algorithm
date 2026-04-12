// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex03 — Área e Perímetro de um retângulo
// Objetivo : Ler altura e comprimento e calcular área e perímetro
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {

        // Scanner para leitura de dados do teclado
        Scanner input = new Scanner(System.in);

        // lado1 = altura | lado2 = comprimento
        int lado1, lado2, area, perimetro;
        System.out.println("__________ F01 | EX03 __________");

        // Leitura das dimensões do retângulo
        System.out.print("Coloque o valor da altura: ");
        lado1 = input.nextInt();

        System.out.print("Coloque o valor do comprimento: ");
        lado2 = input.nextInt();

        // Fórmula da área: base × altura
        area = lado1 * lado2;

        // Fórmula do perímetro: soma dos 4 lados → 2×(lado1 + lado2)
        perimetro = (lado1 * 2) + (lado2 * 2);

        // Apresentação dos resultados
        System.out.println("Esse é o perímetro do retangulo: " + perimetro);
        System.out.println("Essa é a área do retângulo: "      + area);

    }
}
