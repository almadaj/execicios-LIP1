package ex006;

import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Insira um número positivo: ");
        n =s.nextInt();
        if (n<0){
            System.out.println("Você inseriu um número negativo!");
        }else {
            System.out.println("Raiz Quadrada: " + Math.sqrt(n));
            System.out.println("Potência de 2: " + Math.pow(n, 2));
        }
    }
}
