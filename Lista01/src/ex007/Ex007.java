package ex007;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hrs;
        double price;

        System.out.println("Digite número de horas trabalhadas:");
        hrs = s.nextInt();
        System.out.println("Digite o valor da hora:");
        price = s.nextDouble();

        System.out.printf("Salário Bruto: R$ %.2f\n", price * hrs);
        System.out.printf("IR (11%%): R$ %.2f\n", ((hrs*price)*0.11));
        System.out.printf("INSS (8%%): R$ %.2f\n", (hrs*price)*0.08);
        System.out.printf("Sindicato (5%%): R$ %.2f\n", (hrs*price)*0.05);
        System.out.printf("Salário Líquido (5%%): R$ %.2f\n", ((hrs*price)-(hrs*price)*0.24));
    }
}
