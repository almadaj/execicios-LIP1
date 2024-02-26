package ex012;

import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double soma1 = 0, soma2 = 0;
        System.out.println("Insira o limite da operação: ");
        int n = s.nextInt();

        do{
            soma1 += Math.pow(n, 2);
            soma2 += n;
            n--;
        }while (n>=1);

        System.out.printf("Soma dos quadrados: %.0f\nQuadrado da soma: %.0f\nDiferença: %.0f", soma1, Math.pow(soma2,2),(Math.pow(soma2,2) - soma1));
    }
}
