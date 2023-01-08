package hw7.task3;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
class City {

    @XmlElement
    String city;

    @XmlAttribute
    String size;

    @XmlElement
    String street;

    @XmlElement
    String building;

    public City() {
    }

    public City(String city, String size, String street, String building) {
        this.city = city;
        this.size = size;
        this.street = street;
        this.building = building;
    }
    @Override
    public String toString() {
        return "City: " + city + "(" + size + ")" + ", street: " + street + ", building: " + building + ".";
    }
}
