package hw1.task2;

import java.util.Arrays;

class CarCompare implements Comparable {
    int speed;
    int price;
    String model;
    String color;

    CarCompare(int speed, int price, String model, String color) {
        this.speed = speed;
        this.price = price;
        this.model = model;
        this.color = color;
    }

    public String toString() {
        return this.model + " " + this.color + " " + this.speed + " " + this.price;
    }


    public int compareTo(Object o) {

        int temp = this.speed - ((CarCompare) o).speed;
        if (temp == 0) {
            return this.price - ((CarCompare) o).price;
        } else if (temp == 0) {
            return this.model.compareTo(((CarCompare) o).model);
        } else if (temp == 0) {
            return this.color.compareTo(((CarCompare) o).color);
        }
        return temp;
    }

}

class Main {
    public static void main(String[] args) {
        CarCompare c1 = new CarCompare(190, 8000, "BMW", "Red");
        CarCompare c2 = new CarCompare(190, 2000, "Opel", "Black");
        CarCompare c3 = new CarCompare(185, 10000, "Mercedes", "White");
        CarCompare c4 = new CarCompare(190, 8000, "Mercedes", "Black");
        CarCompare c5 = new CarCompare(190, 8000, "Mercedes", "Grey");
        CarCompare[] c = {c1, c2, c3, c4, c5};

        Arrays.sort(c);

        for (CarCompare temp : c) {
            System.out.println(temp);
        }
    }
}
