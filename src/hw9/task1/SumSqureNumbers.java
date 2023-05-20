package hw9.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class SumSqureNumbers {
    static List<Integer> randomizer (int quantity){
        ArrayList <Integer> listInt = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            listInt.add(i, (int)(Math.random()*100));
        }
        return listInt;
    }

    static double sumOfsquareOfNumbers (List <Integer> listInt){
        Double sum = (Double) (listInt.stream().map(l -> Math.pow(l,2)).reduce((x, y) -> x + y).get());
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("-------------------------");
        System.out.println("Array of integers: ");
        List <Integer> listInt = (ArrayList<Integer>) randomizer(10);
        listInt.forEach(System.out::println);
        System.out.println("-------------------------");
        System.out.println("The sum of all squres of numbers = " + sumOfsquareOfNumbers(listInt));
        System.out.println("-----------------");
    }
}
