package exAula003;
import java.util.Scanner;
public class exAula003 {
    public static double pesoIdeal(double altura, String sexo){
        String inicial = String.valueOf(sexo.charAt(0));
        double pesoIdeal = 0;
        if (inicial.equalsIgnoreCase("m")){
            pesoIdeal = (72.7 * altura) - 58;
        } else if(inicial.equalsIgnoreCase("f")){
            pesoIdeal = (62.1 * altura) - 44.7;
        }else {
            System.out.println("ERRO");
        }
        return pesoIdeal;
    }

    public static double imc(double peso, double altura){
        return peso/(altura*altura);
    }

    public static void main(String[] args) {
        //Aula de Sub-rotina
        Scanner s = new Scanner(System.in);
        System.out.println("Insira seu peso: ");
        double peso = s.nextDouble();

        System.out.println("Insira sua altura: ");
        double altura = s.nextDouble();

        System.out.println("Insira seu sexo: ");
        String sexo =  s.next();

        System.out.printf("O seu PESO IDEAL é %.1f\n", pesoIdeal(altura, sexo));
        System.out.printf("O seu IMC é %.1f", imc(peso, altura));
    }
}
