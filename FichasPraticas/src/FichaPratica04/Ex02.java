// ============================================================
// Módulo   : Algoritmia e Programação
// Ficha    : Ficha Prática 04 — Ciclos do-while e Menus
// Exercício: Ex02 — Menu CRUD com do-while
// Objetivo : Apresentar um menu em loop (Criar / Atualizar /
//            Eliminar / Sair) e executar a opção escolhida,
//            repetindo até o utilizador escolher Sair (4)
// ============================================================

package FichaPratica04;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {

        // Scanner para leitura de dados do teclado
        Scanner input = new Scanner(System.in);

        int opcao;

        // do-while: o menu é apresentado sempre pelo menos uma vez
        // e repete enquanto a opção não for 4 (Sair)
        do {

            // Apresentação do menu a cada iteração
            System.out.println("\n\n_____ MENU _____");
            System.out.println("1. Criar");
            System.out.println("2. Atualizar");
            System.out.println("3. Eliminar");
            System.out.println("4. Sair");

            System.out.print("\nOpção: ");
            opcao = input.nextInt();

            // Executa a ação correspondente à opção escolhida
            switch (opcao) {
                case 1:
                    System.out.println("\n_____ CRIAR _____");
                    // Leitura dos dados para criar um registo
                    System.out.print("Insira o nome: ");
                    String nome = input.next();

                    System.out.print("Insira o codigo postal: ");
                    String codPostal = input.next();
                    break;

                case 2:
                    System.out.println("\n_____ ATUALIZAR _____");
                    // Lógica de atualização (não implementada)
                    break;

                case 3:
                    System.out.println("\n_____ ELIMINAR _____");
                    // Lógica de eliminação (não implementada)
                    break;

                case 4:
                    System.out.println("\nA encerrar o programa...");
                    // A condição do while vai avaliar opcao == 4 → sai do ciclo
                    break;

                default:
                    System.out.println("Opção não reconhecida: " + opcao);
                    break;
            }

        } while (opcao != 4); // repete enquanto a opção for diferente de Sair

    }
}
