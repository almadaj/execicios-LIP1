package ex012;
public class Ex012 {
    public static void main(String[] args) {
        int soma1 = 0, soma2=0;
        for (int i = 1; i <=10; i++){
            soma1 += (int) Math.pow(i, 2);
            soma2 += i;
        }
        System.out.printf("Soma dos quadrados: %d\nQuadrado da soma: %.0f\nDiferença: %.0f", soma1, Math.pow(soma2,2),(Math.pow(soma2,2) - soma1));
    }
}
