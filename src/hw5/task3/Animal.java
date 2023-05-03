package hw5.task3;

class Animal {
    private int age = 2;
    public String animalName = "Lucky";
    String animalType = "Dog";

    @Override
    public String toString() {
        return "Age: " + age + ", name: " + animalName +", animal type is " + animalType + ".";
    }
}
