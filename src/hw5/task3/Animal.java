package hw5.task3;

class Animal {
    private int age = 5;
    public String animalName = "Rex";
    protected String animalType = "Dog";

    @Override
    public String toString() {
        return "Age: " + age + ", name: " + animalName +", animal type is " + animalType + ".";
    }
}
