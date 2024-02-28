package exAula001;

import java.util.Scanner;

public class ExAula001 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = s.nextDouble();
        System.out.println("Digite a sua altura: ");
        double altura = s.nextDouble();
        System.out.println("Digite o seu sexo: ");
        String sexo = s.next();

        double pesoIdeal = 0;
        if (sexo.equalsIgnoreCase("masculino")) {
            pesoIdeal = 72.7 * altura - 58;
        } else if (sexo.equalsIgnoreCase("feminino")) {
            pesoIdeal = 62.1 * altura - 44.7;
        } else {
            System.out.println("Digite sexo válido");
        }
        System.out.printf("O peso ideal é %.1f", pesoIdeal);
    }
    
}
