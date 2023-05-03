package hw6.task1;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.util.Scanner;

@Documented
@ProgramInfo(
        author = "Alona Mandziuk",
        version = "2.03",
        date = "03.05.2023")

/**
 * The annotation Calc contains two parameters in default values, is used
 * only with methods and works just during the runtime.
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Calc {
    int num1() default 55;

    int num2() default 105;
}

/**
 * The class Calculator contains 4 methods, which can be used for elementary mathematical
 * operations as adding, subtracting, multiplying and dividing.
 */

class Calculator {
    /**
     * Method that prints the result of adding two values onto the console; uses annotation @Calc
     * default values:
     *
     * @param num1 = 55,
     * @param num2 = 105.
     */
    @Calc()
    static void add(int num1, int num2) {
        System.out.println("\tThe sum is: " + (num1 + num2));
        System.out.println("-----------");
    }

    /**
     * Method that prints the result of subtracting two values onto the console; uses annotation @Calc
     * default values:
     *
     * @param num1 = 55,
     * @param num2 = 105.
     */
    @Calc()
    static void sub(int num1, int num2) {
        System.out.println("\tThe subtraction is: " + (num1 - num2));
        System.out.println("-----------");
    }

    /**
     * Method that prints the result of multiplying two values onto the console; uses annotation @Calc
     * default values:
     *
     * @param num1 = 55,
     * @param num2 = 105.
     */
    @Calc()
    static void mult(int num1, int num2) {
        System.out.println("\tThe product is: " + (num1 * num2));
        System.out.println("-----------");
    }

    /**
     * Method that prints the result of dividing two values onto the console; uses annotation @Calc
     * default values:
     *
     * @param num1 = 55,
     * @param num2 = 105.
     */
    @Calc()
    static void div(int num1, int num2) {
        System.out.println("\tThe division is: " + (num1 / num2));
        System.out.println("-----------");
    }

    public static void main(String[] args) throws NoSuchMethodException {
        /**
         * Main shows the result of calculating two numbers from the annotation @Calc.
         */

        System.out.println("-------------------");
        System.out.println("Operations with two integers: 55 and 105");

/**
 * In the while cycle the user inputs the chosen operator among +, - , *, /.
 * Program calculates and show the result on console.
 * If the user inputs something, that differs proposed operators, the program prints,
 * that the user have made a mistake and asks to input the operator again, until the user inputs
 * "E" to exit the Calculator.
 */
        while (true) {
            System.out.println("Input the operation (+, - , * , /): ");
            System.out.println("Input 'E' for EXIT the program.");
            Class<?> cl = Calculator.class;
            Scanner scanner = new Scanner(System.in);
            String operator = scanner.next();
            if (operator.equals("+")) {
                Method method = cl.getDeclaredMethod("add", int.class, int.class);
                Calc calc = method.getAnnotation(Calc.class);
                add(calc.num1(), calc.num2());
            } else if (operator.equals("-")) {
                Method method = cl.getDeclaredMethod("sub", int.class, int.class);
                Calc calc = method.getAnnotation(Calc.class);
                sub(calc.num1(), calc.num2());
            } else if (operator.equals("*")) {
                Method method = cl.getDeclaredMethod("mult", int.class, int.class);
                Calc calc = method.getAnnotation(Calc.class);
                mult(calc.num1(), calc.num2());
            } else if (operator.equals("/")) {
                Method method = cl.getDeclaredMethod("div", int.class, int.class);
                Calc calc = method.getAnnotation(Calc.class);
                div(calc.num1(), calc.num2());
            } else if (operator.equalsIgnoreCase("e")) {
                break;
            } else {
                System.out.println("The wrong operator!");
            }
        }
        System.out.println("----------------------------------------");
    }
}
