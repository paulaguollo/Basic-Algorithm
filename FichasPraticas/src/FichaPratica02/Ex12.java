// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 02 — Condicionais (if / switch)
// Exercício: Ex12 — Menu CRUD simples (switch)
// Objetivo : Apresentar um menu com 4 opções (Criar, Atualizar,
//            Eliminar, Sair) e reagir à escolha com switch
// ============================================================

package FichaPratica02;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variáveis declaradas mas não utilizadas neste exercício
        // (apenas para reservar os nomes para uso futuro)
        String criar, atualizar, emilinar, sair;
        int opcao;

        // Apresentação do menu
        System.out.println("__________ F02 | EX12 ___________");
        System.out.println("O menu tem essas opções");
        System.out.println("1. Criar ");
        System.out.println("2. Atualizar ");
        System.out.println("3. Eliminar");
        System.out.println("4. Sair ");

        System.out.println("Digite o número que quer aceder");

        System.out.print("Número: ");
        opcao = input.nextInt();

        // switch executa apenas o bloco correspondente à opção escolhida
        switch (opcao) {
            case 1:
                System.out.println("Criar");
                break;
            case 2:
                System.out.println("Atualizar");
                break;
            case 3:
                System.out.println("Eliminar");
                break;
            case 4:
                System.out.println(" "); // Sair — sem mensagem específica
                break;
            default:
                System.out.println("Opção Inválida");
        }
    }
}
