// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 01 — Tipos de Dados e Input/Output
// Exercício: Ex04 — Área de uma circunferência
// Objetivo : Ler o raio e calcular a área usando PI ≈ 3.14
// ============================================================

package FichaPratica01;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {

        // Scanner para leitura de dados do teclado
        Scanner input = new Scanner(System.in);

        // PI é uma constante (valor fixo); raio é lido pelo utilizador
        // double permite valores decimais
        double PI = 3.14, raio, area;

        System.out.println("__________ F01 | EX04 __________");

        // Leitura do raio (nextDouble aceita valores decimais)
        System.out.print("Este é o valor do raio: ");
        raio = input.nextDouble();

        // Fórmula da área do círculo: π × r²
        area = PI * (raio * raio);

        // Apresentação do resultado
        System.out.println("A área da circuferência é: " + area);
    }
}
