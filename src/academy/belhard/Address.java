package academy.belhard;

public class Address {
    private String city;
    private String street;
    private int homeNumber;

    public Address(String city, String street, int homeNumber) {
        this.city = city;
        this.street = street;
        this.homeNumber = homeNumber;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHomeNumber() {
        return homeNumber;
    }

}
