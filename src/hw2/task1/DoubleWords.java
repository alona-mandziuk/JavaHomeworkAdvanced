package hw2.task1;

import java.util.ArrayList;
import java.util.Scanner;

class DoubleWords {
    static void doubleValues(ArrayList<String> arrayLists) {
        for (int i = 0; i < arrayLists.size(); i++) {
            System.out.println(arrayLists.get(i) + ", " + arrayLists.get(i));
        }

    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------");
        System.out.println("Input the 1st word: ");
        String word1 = scanner.next();
        words.add(word1);
        System.out.println("Input the 2nd word: ");
        String word2 = scanner.next();
        words.add(word2);
        System.out.println("Input the 3d word: ");
        String word3 = scanner.next();
        words.add(word3);
        System.out.println("Input the 4th word: ");
        String word4 = scanner.next();
        words.add(word4);
        System.out.println("Input the 5th word: ");
        String word5 = scanner.next();
        words.add(word5);
        System.out.println("---------------------------------------------");
        System.out.println("Array before deformation: ");
        for (String w : words) {
            System.out.print(w + ", ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("Array after deformation: ");
        doubleValues(words);
        System.out.println("---------------------------------------------");
    }
}
