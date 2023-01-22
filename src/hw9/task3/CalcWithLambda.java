package hw9.task3;

import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    int calculate(int var1, int var2);
}

class CalcWithLambda {
    static Calculator add = ((var1, var2) -> var1 + var2);
    static Calculator sub = ((var1, var2) -> var1 - var2);
    static Calculator mult = ((var1, var2) -> var1 * var2);
    static Calculator div = ((var1, var2) -> var1 / var2);

    public static void main(String[] args) throws ArithmeticException {
        System.out.println("-----------------------------");
        System.out.println("SIMPLE CALC");
        System.out.println("Input two integers: ");
        System.out.println("1: ");
        Scanner scanner = new Scanner(System.in);
        int var1 = scanner.nextInt();
        System.out.println("2: ");
        scanner = new Scanner(System.in);
        int var2 = scanner.nextInt();
        System.out.println("----------------------");
        while (true) {
            System.out.println("Choose the action: +, -, *, /, E (for exit): ");
            scanner = new Scanner(System.in);
            String act = scanner.next();
            if (act.equals("+") || act.equals("-") || act.equals("*") || act.equals("/")) {
                switch (act.toLowerCase()) {
                    case "+":
                        int resultAdd = add.calculate(var1, var2);
                        System.out.println(resultAdd);
                        break;
                    case "-":
                        int resultSub = sub.calculate(var1, var2);
                        System.out.println(resultSub);
                        break;
                    case "*":
                        int resultMult = mult.calculate(var1, var2);
                        System.out.println(resultMult);
                        break;
                    case "/":
                        if (var2 == 0) {
                            System.out.println("No dividing to ZERO!");
                        } else {
                            int resultDiv = div.calculate(var1, var2);
                            System.out.println(resultDiv);
                        }
                        break;

                }
            } else if (act.equalsIgnoreCase("e")) {
                break;
            } else {
                System.out.println("You have input the wrong statement!");
            }
        }
        System.out.println("---FINISH---");
    }
}

