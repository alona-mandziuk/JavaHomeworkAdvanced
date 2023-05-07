package hw7.task1;

import java.io.*;

class Animal implements Serializable {
    private String animalType;
    private String animalName;
    private int animalAge;

    public Animal() {
    }

    public Animal(String animalType, String animalName, int animalAge) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalAge = animalAge;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        this.animalAge = animalAge;
    }

    @Override
    public String toString() {
        return "Animal: " + animalType + ", name: " + animalName + ", age: " + animalAge +
                '.';
    }

    static void serializeAnimal(String path, Animal animal) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
        oos.writeObject(animal);
        oos.flush();
        oos.close();
    }

    static void deserializeAnimal(String path) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
        Animal newAnimal = (Animal) ois.readObject();
        ois.close();
        System.out.println(newAnimal);
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Animal lion = new Animal("lion", "Arnold", 2);

        File file = new File("src/hw7/task1/serializeAnimal");

        serializeAnimal(String.valueOf(file), lion);
        deserializeAnimal(String.valueOf(file));
    }
}
