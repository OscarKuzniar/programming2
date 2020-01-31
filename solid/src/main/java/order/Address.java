package order;

public class Address {

    private String street;

    private String streetNumber;

    private String localNumber;

    private String postalCode;


    public Address(String street, String streetNumber, String localNumber, String postalCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.localNumber = localNumber;
        this.postalCode = postalCode;
    }

    public Address(String street, String streetNumber, String postalCode) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
    }

    public String getStreet() {
        return street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public String getLocalNumber() {
        return localNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
