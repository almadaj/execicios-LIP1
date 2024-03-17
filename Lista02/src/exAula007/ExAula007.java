package exAula007;

import java.io.*;
import java.util.Scanner;

public class ExAula007 {
    public static void fileWriter(File file, String message, boolean appendable) {
        if (file.exists()) {
            try {
                FileWriter fw = new FileWriter(file, appendable);
                fw.write(message);
                fw.close();
                System.out.println("Mensagem escrita com sucesso!");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Não foi possível encontrar o arquivo!");
        }
    }

    public static void fileReader(File file) {
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());

        }
    }

    public static void deleteFile(File file) {
        if (file.delete()) {
            System.out.println("File deleted with success.");
        } else {
            System.out.println("Error: delete option failed.");
        }
    }

    public static void main(String[] args) {
        //Escrevendo em arquivos
        File file = new File("New File.txt");
        Scanner s = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1 - Escrever no arquivo");
            System.out.println("2 - Ler o arquivo");
            System.out.println("3 - Deletar arquivo");
            System.out.println("4 - Encerrar");

            choice = s.nextInt();
            s.nextLine();

            switch (choice) {
                case 1: {
                    System.out.println("Digite a mensagem a ser escrita em arquivo: ");
                    String message = s.nextLine().concat("\n");
                    fileWriter(file, message, true);
                    break;
                }
                case 2: {
                    fileReader(file);
                    break;
                }
                case 3: {
                    deleteFile(file);
                    break;
                }
                case 4: {
                    System.out.println("Encerrando...");
                    break;
                }
                default:
                    System.out.println("1 - Escrever no arquivo");
                    System.out.println("2 - Ler o arquivo");
                    System.out.println("3 - Deletar arquivo");
                    System.out.println("4 - Encerrar");
                    System.out.println("Utilize esses comandos");
            }
        } while (choice != 4);
    }
}
