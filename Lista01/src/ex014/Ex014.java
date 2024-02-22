package ex014;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Insira um número para fatorial: ");
        int n = s.nextInt();
        int fat = 1;
        for (int i = 1; i <= n; i++){
            fat = fat * i;
        }

        System.out.printf("Fatorial: %d", fat);
    }
}
