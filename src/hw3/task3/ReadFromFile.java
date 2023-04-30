package hw3.task3;

import java.io.*;

class ReadFromFile {
    public static void main(String[] args) {

        try (BufferedReader bufferedReader = new BufferedReader
                (new InputStreamReader(new FileInputStream("src\\hw3\\task3\\text.txt"), "Cp866"))) {
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                System.out.println(string);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

