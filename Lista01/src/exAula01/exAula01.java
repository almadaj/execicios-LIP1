package exAula01;

import java.util.Scanner;

public class exAula01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o limite da operação: ");
        int n = s.nextInt();
        double h = 0;
        for (int i = 1; i <= n; i++){
            h += (1.0/i);
        }
        System.out.printf("O número harmônio de %d é %.2f", n , h);
    }
}