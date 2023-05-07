package hw7.task2;


import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class XMLwriteAndParse {
    public static void main(String[] args)
            throws XMLStreamException, IOException, ParserConfigurationException, SAXException {
        Path path = Paths.get("src/hw7/task2/file.xml");

        System.out.println("----------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the size of your city: ");
        String citySize = scanner.nextLine();
        System.out.println("Input the city: ");
        String city = scanner.nextLine();
        System.out.println("Input the street: ");
        String street = scanner.nextLine();
        System.out.println("Input the number of the building: ");
        String buildingNumber = scanner.nextLine();
        System.out.println("-----------------------------");
        SAXParse.writeToXml("src/hw7/task2/file.xml",citySize, city, street, buildingNumber);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You have input: ");

        SAXParse.readFromXml("src/hw7/task2/file.xml");


    }

}
