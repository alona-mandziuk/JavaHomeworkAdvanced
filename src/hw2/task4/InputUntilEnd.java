package hw2.task4;

import java.util.LinkedList;
import java.util.Scanner;

class InputUntilEnd {
    public static void main(String[] args) {
        LinkedList<String> shoppingList = new LinkedList<>();
        System.out.println("--------------------------------------------");
        System.out.println("Input your shopping list (type 'end' to save the list): ");
        Scanner scanner = new Scanner(System.in);
        do {
            String purchase = scanner.nextLine();
            shoppingList.add(purchase);
            if (purchase.equalsIgnoreCase("end")) {
                break;
            }
        } while (true);
        shoppingList.removeLast();
        System.out.println("-------------------------------------------------");
        System.out.println("Your shopping list: ");
        for (String s : shoppingList) {
            System.out.println(" - " + s);
        }
        System.out.println("-------------------------------------------------");
    }
}
