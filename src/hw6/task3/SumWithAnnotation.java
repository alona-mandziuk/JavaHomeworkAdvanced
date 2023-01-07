package hw6.task3;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Math {
    int num1() default 100;

    int num2() default 200;
}

class SumWithAnnotation {
    @Math
    static int mathSum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class<?> cl = SumWithAnnotation.class;
        Method method = cl.getDeclaredMethod("mathSum", int.class, int.class);
        Math math = method.getAnnotation(Math.class);
        System.out.println("-----------------------");
        System.out.println("The sum 100 and 200 is " + mathSum(math.num1(), math.num2()) + ".");
        System.out.println("-----------------------");
    }
}
