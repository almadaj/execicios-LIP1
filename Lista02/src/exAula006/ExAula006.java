package exAula006;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExAula006 {
    public static void main(String[] args) {
        File myfile = new File("arquivo.txt");
        Scanner s = new Scanner(System.in);
        File file;
        String filename;
        System.out.println("Digite o nome do arquivo: ");
        filename = s.next();
        file = new File(filename.concat(".txt"));

        try {
            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

