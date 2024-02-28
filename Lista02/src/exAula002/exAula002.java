package exAula002;
import java.util.Scanner;

public class exAula002 {
    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int soma = 0;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                System.out.printf("Digite o número a ser inserido:[%d][%d] ", i, j);
                matriz[i][j] = s.nextInt();
                if(i==j){
                    soma += matriz[i][i];
                }
            }
        }
        System.out.printf("Soma da DIAGONAL PRINCIPAL foi %d", soma);
    }
}
