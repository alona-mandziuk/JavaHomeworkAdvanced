package hw5.task2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class ReflectionExample {
    public static void main(String[] args) {
        getFeilds("hw5.task2.Instance");
        getConstructors("hw5.task2.Instance");
        getMethods("hw5.task2.Instance");
    }


    static void getFeilds(String instance) {
        Class<?> cl = null;
        try {
            cl = Class.forName(instance);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------------");
        System.out.println("Class name: " + cl.getName());

        System.out.println("Fields: ");
        Field[] fields = cl.getDeclaredFields();
        for (Field f : fields) {
            Class<?> fieldType = f.getType();
            System.out.println("\tName: " + f.getName());
            System.out.println("\tType: " + fieldType.getName());
            int modsF = f.getModifiers();
            System.out.println("\tModifier: ");

            if (Modifier.isPrivate(modsF)) {
                System.out.println("Private.");
            } else if (Modifier.isPublic(modsF)) {
                System.out.println("Public. ");
            } else if (Modifier.isStatic(modsF)) {
                System.out.println("Static. ");
            } else if (Modifier.isFinal(modsF)) {
                System.out.println("Final. ");
            } else if (Modifier.isProtected(modsF)) {
                System.out.println("Protected. ");
            } else {
                System.out.println("Default. ");
            }
            System.out.println(" ");
        }
    }

    static void getConstructors(String instance) {
        Class<?> cl = null;
        try {
            cl = Class.forName(instance);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("-------------------------");
        System.out.println("Constructors: ");
        System.out.println(" ");
        Constructor<?>[] constructors = cl.getDeclaredConstructors();
        int i = 0;
        for (Constructor<?> ctr : constructors) {
            System.out.println("\tConstructor: " + (++i) + ": ");
            int modsC = ctr.getModifiers();
            System.out.println("\tModifier: ");
            if (Modifier.isPrivate(modsC)) {
                System.out.println("Private.");
            } else if (Modifier.isPublic(modsC)) {
                System.out.println("Public. ");
            } else if (Modifier.isStatic(modsC)) {
                System.out.println("Static. ");
            } else if (Modifier.isFinal(modsC)) {
                System.out.println("Final. ");
            } else if (Modifier.isProtected(modsC)) {
                System.out.println("Protected. ");
            } else {
                System.out.println("Default. ");
            }

            Class<?>[] paramTypes = ctr.getParameterTypes();
            for (Class<?> paramType : paramTypes) {
                System.out.println(" " + paramType.getName() + " ");
            }
            System.out.println(" ");
        }


    }

    static void getMethods(String instance) {
        Class<?> cl = null;
        try {
            cl = Class.forName(instance);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("--------------------------------");
        System.out.println("Methods: ");
        System.out.println(" ");
        Method[] methods = cl.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Name: " + method.getName());
            System.out.println("\tReturned type: " + method.getReturnType().getName());
            int modsM = method.getModifiers();
            System.out.println("\tModifier: ");
            if (Modifier.isPrivate(modsM)) {
                System.out.println("Private.");
            } else if (Modifier.isPublic(modsM)) {
                System.out.println("Public. ");
            } else if (Modifier.isStatic(modsM)) {
                System.out.println("Static. ");
            } else if (Modifier.isFinal(modsM)) {
                System.out.println("Final. ");
            } else if (Modifier.isProtected(modsM)) {
                System.out.println("Protected. ");
            } else {
                System.out.println("Default. ");
            }

            Class<?>[] paramTypes = method.getParameterTypes();
            System.out.println("\tParametr types: ");
            for (Class<?> paramType : paramTypes) {
                System.out.println(" " + paramType.getName());
            }
            System.out.println(" ");
        }
    }
}
