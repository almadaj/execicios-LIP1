package exAula006;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExAula006 {
    public static void writerFile(String filename, String message){
        try{
            FileWriter fw = new FileWriter(filename);
            fw.write(message);
            fw.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void readerFile(String filename){

    }
    public static void main(String[] args) {
        File file = new File("Teste.txt");
        Scanner s = new Scanner(System.in);

//        String filename;
//        System.out.println("Digite o nome do arquivo: ");
//        filename = s.next();
//        file = new File(filename.concat(".txt"));

        try {
            if (file.createNewFile()) {
                System.out.println("Arquivo criado com sucesso");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Digite a mensagem: ");
        String message = s.nextLine();
        writerFile("Teste.txt", message);
    }
}

