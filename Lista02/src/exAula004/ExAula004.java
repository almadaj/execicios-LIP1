package exAula004;

import java.util.Scanner;

public class ExAula004 {
    public static int fibonacci(int[] fibo, int n){
        for (int i = 3; i < n; i++){
            fibo[0] = 0;
            fibo[1] = 1;
            return fibo[n] += fibo[n-1];
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Insira o limite da sequência de Fibonacci: ");
        int n = s.nextInt();
        //int[] fibo = new int[n];

    }
}
