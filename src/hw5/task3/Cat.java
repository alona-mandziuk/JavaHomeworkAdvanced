package hw5.task3;

import java.lang.reflect.Field;

class Cat {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
            Animal animal = new Animal();
            System.out.println("--------------------------");
            System.out.println("Original " + "\n" + animal);
            System.out.println("--------------------------");
            Class<?> cl = Animal.class;
            Field field = cl.getDeclaredField("age");
            field.setAccessible(true);
            field.setInt(animal, 7);
            Field field1 = cl.getDeclaredField("animalName");
            field1.setAccessible(true);
            field1.set(animal, "Ms. Wiskirson");
            Field field2 = cl.getDeclaredField("animalType");
            field2.setAccessible(true);
            field2.set(animal, "cat");
            System.out.println("After modification: " + "\n" + animal);
    }
}
