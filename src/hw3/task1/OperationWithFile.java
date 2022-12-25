package hw3.task1;

import java.io.*;

class OperationWithFile {
    public static void main(String[] args) throws IOException {
        File file = new File("G:\\_java cbs\\homeWork\\JavaAdvanced\\src\\hw3\\task1\\file.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.write("Merry Christmas! ");
        printWriter.flush();
        printWriter.close();
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string;
        while ((string = bufferedReader.readLine()) != null){
            System.out.println(string);
        }
        bufferedReader.close();
    }
}
