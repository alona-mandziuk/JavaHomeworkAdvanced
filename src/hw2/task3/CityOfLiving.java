package hw2.task3;

import java.util.*;

class CityOfLiving {
    static void showAll (Map <String, String> list){
        for (String key : list.keySet()) {
            System.out.println(key);
        }
    }

    public static void main(String[] args) {
        Map<String, String> cityFamily = new HashMap<>();
        cityFamily.put("London", "Potters");
        cityFamily.put("New York", "Smiths");
        cityFamily.put("Paris", "Croisants");
        cityFamily.put("Kyiv", "Zelenski");
        cityFamily.put("Laplandiia", "Clauses");
        System.out.println("----------------------------------");
        System.out.println("Select the city to know who lives in:");

        showAll(cityFamily);

        System.out.println("Enter EXIT to exit the program");
        System.out.println("----------------------------------");
        String city = null;
        do {
            Scanner scanner = new Scanner(System.in);
            city = scanner.nextLine();
            if (cityFamily.containsKey(city)) {
                System.out.println("In " + city + " lives " + cityFamily.get(city) + " family.");
            } else if (city.equalsIgnoreCase("EXIT")) {
                break;
            } else {
                System.out.println("You have input the wrong key.");
            }
        } while (true);

        System.out.println("----------------------------------");
    }
}
