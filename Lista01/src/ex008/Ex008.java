package ex008;
import java.util.Scanner;

public class Ex008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int valor, nota50, nota10, nota5, nota1;
        System.out.print("Digite o valor a ser sacado: ");
        valor = s.nextInt();

        nota50 = valor / 50;
        int resto = valor % 50;

        nota10 = resto / 10;
        resto %= 10;

        nota5 = resto / 5;
        resto %= 5;

        nota1 = resto;

        System.out.println("Distribuição das notas:");
        if (nota50>0){
        System.out.println("Notas de R$50: " + nota50);
        }if(nota10 > 0){
        System.out.println("Notas de R$10: " + nota10);
        }if (nota5>0) {
        System.out.println("Notas de R$5: " + nota5);
        }if (nota1>0) {
        System.out.println("Notas de R$1: " + nota1);
        }
    }
}
