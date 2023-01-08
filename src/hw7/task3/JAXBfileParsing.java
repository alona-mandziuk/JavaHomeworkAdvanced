package hw7.task3;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

class JAXBfileParsing {
    public static void main(String[] args) throws JAXBException, IOException {
        City city = new City("Kyiv", "big", "Freedom", "5");
        File file = new File("G:\\_java cbs\\homeWork\\JavaAdvanced\\src\\hw7\\task3\\cityXML.xml");
        JAXBContext jaxbContext = JAXBContext.newInstance(City.class);
        Marshaller mar = jaxbContext.createMarshaller();
        mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        mar.marshal(city, file);
        Unmarshaller unmar = jaxbContext.createUnmarshaller();
        city = (City) unmar.unmarshal(file);
        System.out.println(city);
    }
}
