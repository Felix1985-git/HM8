package academy.belhard;

public class Person {

    private String firstName;
    private String lastName;
    private Address address;


    public Person(String firstName, String lastName, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;

    }

    @Override
    public String toString() {
        if (address != null) {
            return "Name - " + firstName +
                    "; Surname - " + lastName +
                    "; City - " + address.getCity() +
                    "; Street - " + address.getStreet() +
                    "; NumberHouse - " + address.getHomeNumber()
                    + "\n";
        } else return "Name - " + firstName +
                "; Surname - " + lastName +
                "; Address is not specified";
    }

}
