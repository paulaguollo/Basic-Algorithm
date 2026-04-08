package FichaPratica03;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("__________ F03 | EX02 ___________");
        System.out.println("A program that shows just the even numbers between 1-400");

        int num=2;

        while (num <= 400) {
            if (num % 2 == 0) {
                System.out.println(num);
                num = num + 2;
            }
        }
    }
}
