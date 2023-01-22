package hw9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class SumSqureNumbers {
    public static void main(String[] args) {
        ArrayList <Integer> listInt = new ArrayList<>();
        System.out.println("-------------------------");
        System.out.println("Array of integers: ");
        for (int i = 0; i < 10; i++) {
            listInt.add(i, (int)(Math.random()*100));
        }
        listInt.stream().forEach(l -> System.out.print(l+ " "));
        System.out.println("\n-------------------------");
        int sum = (listInt.stream().map(l -> l * l).reduce((x, y) -> x + y).get());
        System.out.println("The sum of all squres of numbers = " + sum);
        System.out.println("-----------------");
    }
}
