package FichaPratica03;

public class Ex03 {
    public static void main(String[] args) {
        System.out.println("__________ F03 | EX03 ___________");
        System.out.println("A program that shows just the odd numbers from 531 to 750");

        int num = 531;
        while (num <= 750) {
            if (num % 2 != 0) {
                System.out.println(num);
                num = num + 2;
            }
        }
    }
}
