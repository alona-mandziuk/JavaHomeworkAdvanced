package hw7.task3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class JAXBfileParsing {

    public static void main(String[] args) throws JAXBException, IOException {

        System.out.println("---------------------");
        System.out.println("Input the city: ");
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();
        System.out.println("Input the size of the city: ");
        String citySize = scanner.nextLine();
        System.out.println("Input the street: ");
        String street = scanner.nextLine();
        System.out.println("Input the number of the building: ");
        String buildingNumber = scanner.nextLine();

        City city = new City(cityName, citySize, street, buildingNumber);
        marshallingObj("src/hw7/task3/cityXML.xml", city);
        System.out.println("----------------------");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("You have input:");
        unmarshallingObj("src/hw7/task3/cityXML.xml");
    }


    static void marshallingObj(String file, City city) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
        Marshaller mar = jaxbContext.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(city, new File(file));
    }

    static void unmarshallingObj(String file) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
        Unmarshaller unmar = jaxbContext.createUnmarshaller();
        City city = (City) unmar.unmarshal(new File(file));
        System.out.println(city);
    }
}

