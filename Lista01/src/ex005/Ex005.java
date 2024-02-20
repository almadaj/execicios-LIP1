package ex005;
import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r, area;
        System.out.println("Digite o raio da área a ser calculada: ");
        r = s.nextDouble();
        area = Math.PI * Math.pow(r,2);
        System.out.printf("A área é: %.2f", area);
    }
}
