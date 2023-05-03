package hw6.task2;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Documented
@Inherited
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface TestInheritedAnnotation {
    String string1();

    String string2();
}

class AnnotationPractice {
    @TestInheritedAnnotation(string1 = "MERRY", string2 = "CHRISTMAS!")
    void merryChristmasMethod(String string1, String string2) {
        System.out.println(string1 + " " + string2);
    }
}

class AnnotationPractice2 extends AnnotationPractice {
    @Override
    void merryChristmasMethod(String string1, String string2) {
        super.merryChristmasMethod(string1, string2);
        System.out.println("and HAPPY NEW YEAR!");

    }

    public static void main(String[] args) throws NoSuchMethodException {
        AnnotationPractice annotationPractice = new AnnotationPractice();
        Class<?> cl1 = AnnotationPractice.class;
        Method method1 = cl1.getDeclaredMethod("merryChristmasMethod", String.class, String.class);
        TestInheritedAnnotation testInheritedAnnotation1 = method1.getAnnotation(TestInheritedAnnotation.class);
        annotationPractice.merryChristmasMethod(testInheritedAnnotation1.string1(), testInheritedAnnotation1.string2());
        System.out.println("---------------------------------");
        AnnotationPractice2 annotationPractice2 = new AnnotationPractice2();
        annotationPractice2.merryChristmasMethod(testInheritedAnnotation1.string1(), testInheritedAnnotation1.string2());

    }
}


