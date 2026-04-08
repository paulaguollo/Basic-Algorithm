package FichaPratica03;

public class Ex07 {
    public static void main(String[] args) {
        System.out.println("__________ F03 | EX07 ___________");
        System.out.println("A program that shows numbers from 0 to 100 and its sum");

        int soma = 0;
        int i = 1;

        while (i <= 100) {
            System.out.println(i);
            soma = soma + i;
            i++;
        }
        System.out.println("A soma é: " + soma);
    }
}
