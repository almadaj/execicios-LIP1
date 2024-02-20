package ex015;

import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean run = true;
        do {
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Saída");

            System.out.println("Escolha sua opção: ");
            int option = s.nextInt();
            int a, b;

            switch (option){
                case 1:
                    System.out.println("Adição:");
                    System.out.println("Digite primeiro número:");
                    a = s.nextInt();
                    System.out.println("Digite segundo número:");
                    b = s.nextInt();
                    System.out.println("Resultado: " + (a+b) + "\n");
                    break;
                case 2:
                    System.out.println("Subtração:");
                    System.out.println("Digite primeiro número:");
                    a = s.nextInt();
                    System.out.println("Digite segundo número:");
                    b = s.nextInt();
                    System.out.println("Resultado: " + (a-b) + "\n");
                    break;
                case 3:
                    System.out.println("Multiplicação:");
                    System.out.println("Digite primeiro número:");
                    a = s.nextInt();
                    System.out.println("Digite segundo número:");
                    b = s.nextInt();
                    System.out.println("Resultado: " + (a*b) + "\n");
                    break;
                case 4:
                    System.out.println("Divisão:");
                    System.out.println("Digite primeiro número:");
                    a = s.nextInt();
                    System.out.println("Digite segundo número:");
                    b = s.nextInt();
                    System.out.println("Resultado: " + (b/a) + "\n");
                    break;
                case 5:
                    System.out.println("Saindo...");
                    run = false;
                    break;
                default:
                    System.out.println("Número inválido!");
                    break;
            }
        }while (run);
    }
}
