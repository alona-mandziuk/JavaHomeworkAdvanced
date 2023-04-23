package hw2.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class GetMinFromList {
    static List <Integer> getIntegerList (int var1, int var2, int var3, int var4, int var5){
        List<Integer> variables = new LinkedList<>();
        variables.add(var1);
        variables.add(var2);
        variables.add(var3);
        variables.add(var4);
        variables.add(var5);
        return variables;
    }
    static int getMinimum (List <Integer> variables) {
        int min = variables.get(0);
        for (int i = 0; i < variables.size(); i++) {
            min = Math.min(min,variables.get(i));
        }
        return min;
    }

    public static void main(String[] args) {
        System.out.println("-----------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 1st variable: ");
        int var1 = scanner.nextInt();
        System.out.println("Input the 2nd variable: ");
        int var2 = scanner.nextInt();
        System.out.println("Input the 3d variable: ");
        int var3 = scanner.nextInt();
        System.out.println("Input the 4th variable: ");
        int var4 = scanner.nextInt();
        System.out.println("Input the 5th variable: ");
        int var5 = scanner.nextInt();
        System.out.println("-----------------------");
        System.out.println("List:");
        List <Integer> list = new LinkedList<>();
        list.addAll(getIntegerList(var1, var2, var3, var4, var5));
        System.out.println(list);
        System.out.println("-----------------------");
        System.out.println("Minimum among the list: ");
        System.out.println(getMinimum(list));
    }
}
