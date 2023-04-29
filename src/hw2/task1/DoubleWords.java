package hw2.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class DoubleWords {
    static void doubleValues(List<?> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + ", " + list.get(i));
        }
    }

    static void showList(List<?> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.print(list.get(list.size() - 1));
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("Input the 1st word: ");
        String word1 = scanner.next();
        System.out.println("Input the 2nd word: ");
        String word2 = scanner.next();
        System.out.println("Input the 3d word: ");
        String word3 = scanner.next();
        System.out.println("Input the 4th word: ");
        String word4 = scanner.next();
        System.out.println("Input the 5th word: ");
        String word5 = scanner.next();

        List<String> words = List.of(word1, word2, word3, word4, word5);
        System.out.println("--------------------------------------------");
        System.out.println("Array before deformation: ");

        showList(words);

        System.out.println();
        System.out.println("--------------------------------------------");
        System.out.println("Array after deformation: ");

        doubleValues(words);

        System.out.println("--------------------------------------------");
    }
}
