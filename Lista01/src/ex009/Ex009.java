package ex009;
import java.util.Scanner;
public class Ex009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira o valor do salário: ");
        double salario = s.nextDouble();

        System.out.print("Insira o valor do empréstimo: ");
        double emprestimo = s.nextDouble();
        double aux = salario + (salario*0.2);

        if (emprestimo > aux){
            System.out.println("Empréstimo não-concedido");
        }else {
            System.out.println("Empréstimo concedido");
        }
    }
}
