package hw3.task2;

import java.io.*;

class TextSplitter {
    static String fileToString(String filePath) {
        String string = null;
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader bufferedReader = new BufferedReader
                (new InputStreamReader(new FileInputStream(filePath), "Cp866"))) {
            while ((string = bufferedReader.readLine()) != null) {
                stringBuilder.append(string + System.lineSeparator());
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);

        }
        return stringBuilder.toString();

    }

    public static void main(String[] args) {

        String string1 = fileToString("src\\hw3\\task2\\file.txt");
        String string2 = string1.substring(0, string1.length() / 2);
        String string3 = string1.substring(string1.length() / 2);

        System.out.println("------------------------------------------");
        String[] array2 = string2.split("\\.");
        for (String ar2 : array2) {
            System.out.println(ar2);
        }
        System.out.println("------------------------------------------");
        String[] array3 = string3.split("\\.");
        for (String ar3 : array3) {
            System.out.println(ar3);
        }
        System.out.println("------------------------------------------");

    }
}
