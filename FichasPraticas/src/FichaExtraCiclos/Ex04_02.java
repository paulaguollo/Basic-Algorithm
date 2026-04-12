package FichaExtraCiclos;

public class Ex04_02 {
    public static void main(String[] args) {

        int linhas = 5; // Número de linhas a serem impressas

        for (int i = 0; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
