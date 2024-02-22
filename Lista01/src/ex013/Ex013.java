package ex013;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira a quantidade de números de Fibonacci: ");
        int n = s.nextInt();
        if (n >= 1) {
            System.out.print("0 ");
        }
        if (n >= 2) {
            System.out.print("1 ");
        }
        if (n >= 3) {
            int a = 0;
            int b = 1;
            for (int i = 3; i <= n; i++) {
                int aux = a + b;
                System.out.print(aux + " ");
                a = b;
                b = aux;
            }
        }

    }
}
