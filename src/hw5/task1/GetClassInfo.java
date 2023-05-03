package hw5.task1;

import java.lang.reflect.Member;
import java.util.Scanner;

class GetClassInfo{
    private void showAll (Member [] members){
        for (int i = 0; i < members.length; i++) {
            String decl = members[i].toString();
            System.out.println("\t" + decl);
        }
    }

    static void getInfoAboutClass (String className){
        GetClassInfo g = new GetClassInfo();
        try {
            Class <?> classInstance = Class.forName(className);
            System.out.println("----------------------------------------");
            System.out.println("------Class: " + classInstance);
            System.out.println("FIELDS: ");
            g.showAll(classInstance.getDeclaredFields());
            System.out.println("----------------------------------------");
            System.out.println("CONSTRUCTORS: ");
            g.showAll(classInstance.getDeclaredConstructors());
            System.out.println("----------------------------------------");
            System.out.println("METHODS: ");
            g.showAll(classInstance.getDeclaredMethods());
            System.out.println("----------------------------------------");
            System.out.println("FINISH.");

        } catch (ClassNotFoundException e) {
            System.err.println("\nYou have input the unexistent class: " + className);
        }

    }

    public static void main(String[] args) {
        System.out.println("----------------------------------------");
        System.out.println("Input a full name of the class: ");
        Scanner scanner = new Scanner(System.in);
        String className = scanner.nextLine();
        getInfoAboutClass(className);
        System.out.println("----------------------------------------");

    }
}
