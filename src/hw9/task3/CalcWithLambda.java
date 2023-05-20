package hw9.task3;

import java.math.BigDecimal;
import java.util.InputMismatchException;
import java.util.Scanner;

@FunctionalInterface
interface Calculator {
    BigDecimal calculate(BigDecimal var1, BigDecimal var2);
}

class CalcWithLambda {

    static Calculator add = (BigDecimal::add);
    static Calculator sub = (BigDecimal::subtract);
    static Calculator mult = (BigDecimal::multiply);
    static Calculator div = (BigDecimal::divide);


    public static void main(String[] args) throws ArithmeticException, InputMismatchException {
        System.out.println("-----------------------------");
        System.out.println("SIMPLE CALC");

        while (true) {
            System.out.println("Input two numbers: ");
            System.out.println("1: ");
            Scanner scanner = new Scanner(System.in);
            BigDecimal var1 = null;
            try {
                var1 = scanner.nextBigDecimal();
            } catch (InputMismatchException e) {
                System.err.println("Input with coma");
                e.printStackTrace();
            }

            System.out.println("2: ");
            scanner = new Scanner(System.in);
            BigDecimal var2 = null;
            try {
                var2 = scanner.nextBigDecimal();
            } catch (InputMismatchException e) {
                System.err.println("Input with coma");
                e.printStackTrace();
            }

            System.out.println("----------------------");
            System.out.println("Choose the action: +, -, *, /, E (for exit): ");
            scanner = new Scanner(System.in);
            String act = scanner.next();

            if (act.equals("+") || act.equals("-") || act.equals("*") || act.equals("/")) {
                switch (act.toLowerCase()) {
                    case "+":
                        System.out.println(add.calculate(var1, var2));
                        break;
                    case "-":
                        System.out.println(sub.calculate(var1, var2));
                        break;
                    case "*":
                        System.out.println(mult.calculate(var1, var2));
                        break;
                    case "/":
                        try {
                            System.out.println(div.calculate(var1, var2));
                        } catch (ArithmeticException e) {
                            System.err.println("No dividing to ZERO!");
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

