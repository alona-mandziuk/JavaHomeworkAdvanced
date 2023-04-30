package hw3.task1;

import java.io.*;
import java.nio.file.Path;
import java.util.Scanner;

class OperationWithFile {

    /**
     * Method creates the file with the custom text (parameter String input)
     * and places it into the package.
     *
     * @param input
     * @throws IOException
     */
    static void createTXTFile(String input) throws IOException {
        File file = new File("src/hw3/task1/file.txt");
        FileWriter fileWriter = new FileWriter(file, false);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write(input);
        printWriter.flush();
        printWriter.close();
        fileWriter.close();
    }

    /**
     * Method reads file and prints the content to the console.
     *
     * @param file
     * @throws IOException
     */

    static void readFromFile() throws IOException {
        FileReader fileReader = new FileReader("src/hw3/task1/file.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;
        while ((string = bufferedReader.readLine()) != null) {
            System.out.println(string);
        }
        bufferedReader.close();
    }


    public static void main(String[] args) throws IOException {
        System.out.println("-----------------------------------");
        System.out.println("The program saves the text you print on console imto the .txt file." +
                "\n Then reads the file and shows it on console.  ");
        System.out.println("-----------------------------------");
        System.out.println("Input the text:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        createTXTFile(input);
        System.out.println("-------------------------------------");


        try {
            for (int i = 0; i < 4; i++) {
                Thread.sleep(1000 + i * 1000);
                System.out.print(".");
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("\n-------------------------------------");
        readFromFile();
        System.out.println("-------------------------------------");


    }
}
