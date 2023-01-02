package hw4.task1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


class Decoder {
    public static void main(String[] args) {
        Path preposition = Paths.get("G:\\_java cbs\\homeWork\\JavaAdvanced\\src\\hw4\\task1\\preposition.txt");

        List<String> prepositionArray = new ArrayList<>();
        try {
            prepositionArray = Files.readAllLines
                    (preposition, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder newText = new StringBuilder();
        try (BufferedReader textReader = new BufferedReader(new InputStreamReader
                (new FileInputStream("G:\\_java cbs\\homeWork\\JavaAdvanced\\src\\hw4" +
                        "\\task1\\originalText.txt"), "UTF-8"))) {
            String text;
            while ((text = textReader.readLine()) != null) {
                newText.append(text).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String newString = newText.toString();

        for (int i = 0; i < prepositionArray.size(); i++) {
            Pattern p = Pattern.compile(prepositionArray.get(i), Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(newString);
            newString = m.replaceAll(" JAVA ");
        }

        try (FileWriter newTextFile = new FileWriter
                ("G:\\_java cbs\\homeWork\\JavaAdvanced\\src\\hw4\\task1\\newText.txt")) {
            newTextFile.write(newString);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
