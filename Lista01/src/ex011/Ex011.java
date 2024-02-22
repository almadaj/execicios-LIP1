package ex011;
import java.util.Scanner;
public class Ex011 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira a nota 1: ");
        double n1 = s.nextDouble();

        System.out.print("Insira a nota 2: ");
        double n2 = s.nextDouble();

        double media = (n1 + n2)/2;

        if (media < 4){
            System.out.println("Reprovado");
        } else if (media >= 7){
            System.out.println("Aprovado");
            System.out.printf("Média Final: %.1f", media);
        }else {
            System.out.println("Prova Final!");
            System.out.print("Digite a nota da Prova Final: ");
            double nf = s.nextDouble();

            media = (n1 + n2 + nf)/3;
            if (media >= 5){
                System.out.println("Aprovado");
                System.out.printf("Média Final: %.1f", media);
            }else {
                System.out.println("Reprovado");
            }
        }
    }
}
