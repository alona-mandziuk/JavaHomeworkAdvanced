package hw7.task2;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

class XMLwriteAndParse {
    public static void main(String[] args) throws XMLStreamException, IOException,
            ParserConfigurationException, SAXException {
        Path path = Paths.get("G:\\_java cbs\\homeWork\\JavaAdvanced\\src\\hw7\\task2\\file.xml");

        /**
         * Creating XML-file using StAX
         */


        XMLOutputFactory outputFactory = XMLOutputFactory.newInstance();
        XMLStreamWriter writer = outputFactory.createXMLStreamWriter
                (new FileOutputStream(String.valueOf(path)));
        writer.writeStartDocument("UTF-8", "1.0");
        writer.writeStartElement("city");
        writer.writeAttribute("size", "small");
        writer.writeCharacters("Kamianets-Podilskyi");
        writer.writeStartElement("street");
        writer.writeCharacters("Soborna");
        writer.writeStartElement("building_number");
        writer.writeCharacters("4");
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndElement();
        writer.writeEndDocument();

        writer.flush();
        writer.close();

        /**
         *SAXParsing
         */

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser saxParser = factory.newSAXParser();
        DefaultHandler handler = new DefaultHandler() {
            boolean city = false;
            boolean street = false;
            boolean building = false;

            @Override
            public void startElement(String uri, String localName, String qName, Attributes attributes) {
                if (qName.equalsIgnoreCase("city")) {
                    city = true;
                }
                if (qName.equalsIgnoreCase("street")) {
                    street = true;
                }
                if (qName.equalsIgnoreCase("building_number")) {
                    building = true;
                }

            }

            @Override
            public void characters(char ch[], int start, int length) {
                if (city) {
                    System.out.println("City: " + new String(ch, start, length));
                    city = false;
                }
                if (street) {
                    System.out.println("Street: " + new String(ch, start, length));
                    street = false;
                }
                if (building) {
                    System.out.println("building: " + new String(ch, start, length));
                    building = false;
                }
            }
        };
        saxParser.parse(String.valueOf(path), handler);


    }

}
