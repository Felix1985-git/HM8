package academy.belhard;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Person user = new Person("Alex", "Ivanov", new Address("Minsk", "Flowers", 38));
        Person user1 = new Person("Evgen", "Petrov", new Address("Tomsk", "Rainbows", 62));
        Person user2 = new Person("Jan", "Wilson", new Address("Brest", "Heroes", 19));
        Person user3 = new Person(null, "Anderson", new Address("NewYork", "King's Road", 17));
        Person user4 = new Person("Sherlock", null, new Address("London", "Baker Street", 221));
        Person user5 = new Person("Dr", "Watson", null);
        List<Person> persons = new ArrayList<>();
        persons.add(user);
        persons.add(user1);
        persons.add(user2);
        persons.add(user3);
        persons.add(user4);
        persons.add(user5);
        persons.forEach(System.out::print);

        System.out.println();
        System.out.println();

        List<String> result = persons
                .stream()
                .filter(person ->
                        person.getLastName() != null
                                && person.getFirstName() != null
                                && person.getAddress() != null)
                .sorted(Comparator.comparingInt((Person person) -> person.getAddress().getHomeNumber()))
                .map(Person::toString)
                .collect(Collectors.toList());

        result.forEach(System.out::print);
    }

}
