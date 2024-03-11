package exAula005;

import java.util.*;

public class ExAula005 {
    public static double iterativeDivide(double... args) throws ArithmeticException {
        double total = 1;
        for (double i : args) {
            total /= i;
        }
        return total;
    }
    public static String toLowerCase(String phrase) {
        String newPhrase = null;
        newPhrase = phrase.toLowerCase();
        return newPhrase;
    }

    public static void main(String[] args) {
        try {
            System.out.println(iterativeDivide(1, 2.1, 3.2, 4.1, 0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println(toLowerCase("OLÁ A TODOS"));
        }
    }
}
