package zadInheritance7;

public class Address {

    private String cityCode;
    private String city;
    private String street;
    private int streetNumber;

    public Address(String cityCode, String city, String street, int streetNumber) {
        this.cityCode = cityCode;
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }
}
