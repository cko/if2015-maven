package eventmanager;

/**
 * A location is usually a company office where a tech event takes place.
 *
 */
public class Location {

    private String name;
    private String street;
    private String city;

    public Location(String name, String street, String city) {
	this.name = name;
	this.street = street;
	this.city = city;
    }

    public String getName() {
	return name;
    }

    public String getStreet() {
	return street;
    }

    public String getCity() {
	return city;
    }

}
