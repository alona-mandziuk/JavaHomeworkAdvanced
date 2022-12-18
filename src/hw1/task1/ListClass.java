package hw1.task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class ListClass {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Ice-cream");
        list.add("Chocolate");
        list.add("Cake");
        list.add("Waffles");
        list.add("Pancakes");
        list.add("Doughnut");
        list.add("Bun");
        list.add("Marmalade");
        list.add("Marshmello");
        list.add("Syrup");
        Collections.sort(list);

        Iterator <String> iterator = list.iterator();
        while (iterator.hasNext()){
            String temp = iterator.next();
            System.out.println(temp);
        }

    }
}
