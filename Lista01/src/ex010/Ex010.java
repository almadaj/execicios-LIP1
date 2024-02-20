package ex010;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a (ax² + bx + c = 0): ");
        int a = s.nextInt();
        System.out.print("Insira b (ax² + bx + c = 0): ");
        int b = s.nextInt();
        System.out.print("Insira c (ax² + bx + c = 0): ");
        int c = s.nextInt();

        int delta = (b*b) - (4 * a * c);
        if (a <= 0 || delta < 0){
            System.out.println("Não é uma equação de 2º grau!");
        } else if (delta == 0) {
            System.out.println("Só existe uma raiz real");
        } else {
            System.out.printf("1ª Raiz: %.0f\n", ((-b+Math.sqrt(delta))/2*a));
            System.out.printf("2ª Raiz: %.0f",  ((-b-Math.sqrt(delta))/2*a));
        }
    }
}
