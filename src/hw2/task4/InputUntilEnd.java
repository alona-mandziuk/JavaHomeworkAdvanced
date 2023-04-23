package hw2.task4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class InputUntilEnd {
    static void shopList(List<String> list) {
        for (String s : list) {
            System.out.println(" - " + s);
        }
    }

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
        shopList(shoppingList);
        System.out.println("-------------------------------------------------");
    }
}
